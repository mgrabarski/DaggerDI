package com.mateusz.grabarski.daggerdi.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.mateusz.grabarski.daggerdi.di.Injector;

import java.util.UUID;

/**
 * Created by Mateusz Grabarski on 18.01.2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private static String INSTANCE_ID_KEY = "instance_id";

    private String instanceId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            instanceId = savedInstanceState.getString(INSTANCE_ID_KEY);
        } else {
            instanceId = UUID.randomUUID().toString();
        }

        Injector.inject(this);

        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(INSTANCE_ID_KEY, instanceId);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            Injector.clearComponent(this);
        }
    }

    public String getInstanceIdKey() {
        return instanceId;
    }
}
