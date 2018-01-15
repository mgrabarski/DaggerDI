package com.mateusz.grabarski.daggerdi.home;

import com.mateusz.grabarski.daggerdi.di.ActivityScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by Mateusz Grabarski on 15.01.2018.
 */
@ActivityScope
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }
}
