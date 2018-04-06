package com.example.android.sunshine.sync;


//  c (1) Create a class called SunshineSyncTask

import android.content.ContentValues;
import android.content.Context;
import android.view.View;

import com.example.android.sunshine.MainActivity;
import com.example.android.sunshine.data.SunshinePreferences;
import com.example.android.sunshine.data.WeatherContract;
import com.example.android.sunshine.utilities.FakeDataUtils;
import com.example.android.sunshine.utilities.NetworkUtils;
import com.example.android.sunshine.utilities.OpenWeatherJsonUtils;

import java.net.URL;

public class SunshineSyncTask{
    public static ContentValues[] mWeatherData;

    public static void syncWeather(Context context) {

        URL weatherRequestUrl = NetworkUtils.getUrl(context);

        try {
            String jsonWeatherResponse = NetworkUtils.getResponseFromHttpUrl(weatherRequestUrl);
            ContentValues[] simpleWeatherResponse = OpenWeatherJsonUtils.getWeatherContentValuesFromJson(context, jsonWeatherResponse);
            mWeatherData = simpleWeatherResponse;
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (mWeatherData != null){
            context.getContentResolver().delete(
                    WeatherContract.WeatherEntry.CONTENT_URI,
                    null,
                    null);
            context.getContentResolver().bulkInsert(
                    WeatherContract.WeatherEntry.CONTENT_URI,
                    mWeatherData);
        }

    }
}
//  c (2) Within SunshineSyncTask, create a synchronized public static void method called syncWeather
//      c (3) Within syncWeather, fetch new weather data
//      TODO (4) If we have valid results, delete the old data and insert the new