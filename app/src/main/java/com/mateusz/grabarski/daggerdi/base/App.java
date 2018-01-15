package com.mateusz.grabarski.daggerdi.base;

import android.app.Application;

/**
 * Created by Mateusz Grabarski on 15.01.2018.
 */

public class App extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
