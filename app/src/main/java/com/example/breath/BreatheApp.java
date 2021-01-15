package com.example.breath;


import android.app.Application;
import android.content.Context;

import com.example.breath.utils.BreathePreferences;



public class BreatheApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BreathePreferences.init(getApplicationContext());
    }

}
