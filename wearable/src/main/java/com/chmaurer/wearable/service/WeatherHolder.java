package com.chmaurer.wearable.service;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;

/**
 * Created by Christian on 29.06.2016.
 */
public class WeatherHolder {

    private static final String TEMP_LOW_KEY = "sunshine.key.temp.low";
    private static final String TEMP_HIGH_KEY = "sunshine.key.temp.high";
    private static final String DATE_KEY = "sunshine.key.date";
    private static final String UNIT_KEY = "sunshine.key.unit";
    private static final String WEATHER_IMAGE = "sunshine.key.weather";
    private String weatherDate;
    private String tempMorning;
    private String tempDay;
    private String tempUnit;
    private Asset image;

    public static WeatherHolder convertDataMapToWeatherHolder(DataMap dataMap) {
        WeatherHolder w = new WeatherHolder();
        w.setWeatherDate(dataMap.getString(DATE_KEY));
        w.setTempDay(dataMap.getString(TEMP_HIGH_KEY));
        w.setTempMorning(dataMap.getString(TEMP_LOW_KEY));
        w.setTempUnit(dataMap.getString(UNIT_KEY));
        w.setImage(dataMap.getAsset(WEATHER_IMAGE));
        return w;
    }


    public String getWeatherDate() {
        return weatherDate;
    }

    public void setWeatherDate(String weatherDate) {
        this.weatherDate = weatherDate;
    }

    public String getTempMorning() {
        return tempMorning;
    }

    public void setTempMorning(String tempMorning) {
        this.tempMorning = tempMorning;
    }

    public String getTempDay() {
        return tempDay;
    }

    public void setTempDay(String tempDay) {
        this.tempDay = tempDay;
    }

    public String getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(String tempUnit) {
        this.tempUnit = tempUnit;
    }

    public Asset getImage() {
        return image;
    }

    public void setImage(Asset image) {
        this.image = image;
    }
}
