package com.chmaurer.wearable.service;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.wearable.view.ConfirmationOverlay;
import android.support.wearable.watchface.CanvasWatchFaceService;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by Christian on 26.06.2016.
 */
public class WeatherService extends WearableListenerService {

    private static final String TEMP_KEY = "sunshine.key.temp";
    private static String lastTempData;


    @Override
    public void onDataChanged(DataEventBuffer dataEventBuffer) {
        for (DataEvent event : dataEventBuffer) {
            if (event.getType() == DataEvent.TYPE_CHANGED) {
                // DataItem changed
                DataItem item = event.getDataItem();
                if (item.getUri().getPath().compareTo("/temp") == 0) {
                    DataMap dataMap = DataMapItem.fromDataItem(item).getDataMap();
                    //todo parse temp data
                    lastTempData = dataMap.getString(TEMP_KEY);
                }
            } else if (event.getType() == DataEvent.TYPE_DELETED) {
                // DataItem deleted
            }
        }

    }

    public static String getLastTempData() {
        return lastTempData;
    }
}
