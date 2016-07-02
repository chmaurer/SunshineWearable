package com.chmaurer.wearable.service;

import android.graphics.Bitmap;

/**
 * Created by Christian on 29.06.2016.
 */
public class WeatherHolder {

    private String weatherDate;
    private String tempMorning;
    private String tempDay;
    private String tempUnit;
    private Bitmap bitmap;

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

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
