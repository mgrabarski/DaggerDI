package com.mateusz.grabarski.daggerdi.base;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mateusz Grabarski on 15.01.2018.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class
})
public interface ApplicationComponent {
    void inject(App app);
}
