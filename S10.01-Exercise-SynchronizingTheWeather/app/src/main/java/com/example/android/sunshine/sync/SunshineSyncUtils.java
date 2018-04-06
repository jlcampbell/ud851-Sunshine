// c (9) Create a class called SunshineSyncUtils
    //  c (10) Create a public static void method called startImmediateSync
    //  c (11) Within that method, start the SunshineSyncIntentService


package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;

import com.example.android.sunshine.MainActivity;

public class SunshineSyncUtils{
    public static void startImmediateSync(Context context){
        Intent weatherSync = new Intent(context, SunshineSyncIntentService.class);
        context.startService(weatherSync);
    }
        }