package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Constructor;

/**
 * Created by Jess on 1/14/18.
 */

public class ForecastAdapter {
    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        TextView mWeatherTextView;
        public ForecastAdapterViewHolder(View itemView){
           super(itemView);
           mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }
    }
}
