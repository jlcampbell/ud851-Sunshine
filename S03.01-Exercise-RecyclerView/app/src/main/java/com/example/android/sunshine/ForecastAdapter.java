package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Constructor;
import java.util.zip.Inflater;

/**
 * Created by Jess on 1/14/18.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{
    private String[] mWeatherData;
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType, LayoutInflater inflater) {
        View view;
        view = inflater.inflate(R.layout.forecast_list_item, parent, false);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        TextView mWeatherTextView;
        public ForecastAdapterViewHolder(View itemView){
           super(itemView);
           mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }
    }
}
