package com.alimhmd.yourdoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoardingActivity extends AppCompatActivity {

    private final int ON_BOARDING_NB = 3;
    private int currentOnBoarding = 1;
//    private ConstraintLayout skipNextContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        MainActivity.removeActionBar(this);
//        skipNextContainer = findViewById(R.id.skipNextContainer);
    }

    public void skipOnBoarding(View view) {
        startActivity(new Intent(OnBoardingActivity.this, SignUp.class));
    }
    public void nextOnBoarding(View view){

        this.currentOnBoarding++;
//        skipNextContainer.removeView(findViewById(R.id.vectorImage));
        findViewById(R.id.vectorImage1).setVisibility(View.GONE);
        if(this.currentOnBoarding >= this.ON_BOARDING_NB){
            startActivity(new Intent(OnBoardingActivity.this, SignUp.class));
        }
    }
}