package com.chmaurer.wearable.service;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.WearableListenerService;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/**
 * Created by Christian on 26.06.2016.
 */
public class WeatherService extends WearableListenerService implements DataApi.DataListener, GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener {

    private static final String TEMP_LOW_KEY = "sunshine.key.temp.low";
    private static final String TEMP_HIGH_KEY = "sunshine.key.temp.high";
    private static final String DATE_KEY = "sunshine.key.date";
    private static final String UNIT_KEY = "sunshine.key.unit";
    private static final String WEATHER_IMAGE = "sunshine.key.weather";

    private static WeatherHolder weatherHolder;
    private GoogleApiClient mGoogleApiClient;
    public static WeatherHolder getWeatherHolder() {
        return weatherHolder;
    }

    public static void setWeatherHolder(WeatherHolder w) {
        weatherHolder = w;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(Wearable.API)
                .build();

        mGoogleApiClient.connect();
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }


    @Override
    public void onConnected(@Nullable Bundle bundle) {
        Wearable.DataApi.addListener(mGoogleApiClient, this);

    }

    @Override
    public void onConnectionSuspended(int i) {
        Wearable.DataApi.removeListener(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
    }

    @Override
    public void onDataChanged(DataEventBuffer dataEventBuffer) {
        for (DataEvent event : dataEventBuffer) {
            if (event.getType() == DataEvent.TYPE_CHANGED) {
                // DataItem changed
                DataItem item = event.getDataItem();
                if (item.getUri().getPath().compareTo("/temp") == 0) {
                    DataMap dataMap = DataMapItem.fromDataItem(item).getDataMap();
                    weatherHolder = convertDataMapToWeatherHolder(dataMap);
                }
            } else if (event.getType() == DataEvent.TYPE_DELETED) {
                // DataItem deleted
            }
        }

    }

    public WeatherHolder convertDataMapToWeatherHolder(DataMap dataMap) {
        WeatherHolder w = new WeatherHolder();
        w.setWeatherDate(dataMap.getString(DATE_KEY));
        w.setTempDay(dataMap.getString(TEMP_HIGH_KEY));
        w.setTempMorning(dataMap.getString(TEMP_LOW_KEY));
        w.setTempUnit(dataMap.getString(UNIT_KEY));
        w.setBitmap(loadBitmapFromAsset(dataMap.getAsset(WEATHER_IMAGE)));
        return w;
    }

    public Bitmap loadBitmapFromAsset(Asset asset) {
        if (asset == null) {
            throw new IllegalArgumentException("Asset must be non-null");
        }
        ConnectionResult result =
                mGoogleApiClient.blockingConnect(300, TimeUnit.MILLISECONDS);
        if (!result.isSuccess()) {
            return null;
        }
        // convert asset into a file descriptor and block until it's ready
        InputStream assetInputStream = Wearable.DataApi.getFdForAsset(
                mGoogleApiClient, asset).await().getInputStream();
        mGoogleApiClient.disconnect();

        if (assetInputStream == null) {
            Log.w("WearableWatchFace", "Requested an unknown Asset.");
            return null;
        }
        // decode the stream into a bitmap
        return BitmapFactory.decodeStream(assetInputStream);
    }

}
