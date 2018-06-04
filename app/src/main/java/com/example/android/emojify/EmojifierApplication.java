package com.example.android.emojify;

import android.app.Application;

import timber.log.Timber;

public class EmojifierApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
    }
}
