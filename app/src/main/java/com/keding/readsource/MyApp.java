package com.keding.readsource;

import android.app.Application;

import com.github.moduth.blockcanary.BlockCanary;

/**
 * @author: skd
 * @date 2019-08-17
 * @Desc MyApp
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Do it on main process
        BlockCanary.install(this, new AppBlockCanaryContext()).start();
    }
}
