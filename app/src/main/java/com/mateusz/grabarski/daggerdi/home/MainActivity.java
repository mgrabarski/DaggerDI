package com.mateusz.grabarski.daggerdi.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mateusz.grabarski.daggerdi.R;
import com.mateusz.grabarski.daggerdi.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
