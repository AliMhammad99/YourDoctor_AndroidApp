package com.alimhmd.yourdoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity.removeActionBar(this);
        this.endSplashScreen();
    }

    public static void removeActionBar(AppCompatActivity activity){
        activity.getSupportActionBar().hide();
    }

    private void endSplashScreen(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, OnBoardingActivity.class));
                finish();
            }
        }, 3000);
    }
}