package com.mateusz.grabarski.daggerdi.di;

import android.app.Activity;

import com.mateusz.grabarski.daggerdi.base.BaseActivity;

/**
 * Created by Mateusz Grabarski on 18.01.2018.
 */

public class Injector {

    private Injector() {
    }

    public static void inject(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

    public static void clearComponent(Activity activity) {
        ActivityInjector.get(activity).clear(activity);
    }
}
