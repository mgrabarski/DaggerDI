package com.mateusz.grabarski.daggerdi.base;

import android.app.Activity;

import com.mateusz.grabarski.daggerdi.home.MainActivity;
import com.mateusz.grabarski.daggerdi.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Mateusz Grabarski on 15.01.2018.
 */
@Module(subcomponents = {
        MainActivityComponent.class
})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Builder<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);
}
