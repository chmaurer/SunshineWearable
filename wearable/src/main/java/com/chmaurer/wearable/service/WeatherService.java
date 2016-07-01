package com.chmaurer.wearable.service;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by Christian on 26.06.2016.
 */
public class WeatherService extends WearableListenerService {

    private static WeatherHolder weatherHolder;

    public static WeatherHolder getWeatherHolder() {
        return weatherHolder;
    }

    public static void setWeatherHolder(WeatherHolder w) {
        weatherHolder = w;
    }

    @Override
    public void onDataChanged(DataEventBuffer dataEventBuffer) {
        for (DataEvent event : dataEventBuffer) {
            if (event.getType() == DataEvent.TYPE_CHANGED) {
                // DataItem changed
                DataItem item = event.getDataItem();
                if (item.getUri().getPath().compareTo("/temp") == 0) {
                    DataMap dataMap = DataMapItem.fromDataItem(item).getDataMap();
                    weatherHolder = WeatherHolder.convertDataMapToWeatherHolder(dataMap);
                }
            } else if (event.getType() == DataEvent.TYPE_DELETED) {
                // DataItem deleted
            }
        }

    }
}
