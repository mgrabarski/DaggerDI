package com.mateusz.grabarski.daggerdi.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mateusz Grabarski on 15.01.2018.
 */
@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    Context provideApplicationContext() {
        return mApplication;
    }
}
