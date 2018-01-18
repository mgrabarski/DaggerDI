package com.mateusz.grabarski.daggerdi.base;

import android.app.Application;

import com.mateusz.grabarski.daggerdi.di.ActivityInjector;

import javax.inject.Inject;

/**
 * Created by Mateusz Grabarski on 15.01.2018.
 */

public class App extends Application {

    @Inject
    ActivityInjector activityInjector;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);
    }


    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }
}
