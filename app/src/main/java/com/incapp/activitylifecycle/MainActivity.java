package com.incapp.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ActivityLifecycle", "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifecycle", "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifecycle", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifecycle", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifecycle", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifecycle", "OnDestroy");
    }
}
