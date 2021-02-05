package com.picsapp.picsmusic;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplachScreen extends AppCompatActivity {

    /* make variable to set times */
    // time of display
    int SPLASH_TIME = 2800; //This is 2.800 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        // code to start timer and take action after the timer ends
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // do any action here.
                // now we are moving to next page
                Intent SplashScrennIntent = new Intent(SplachScreen.this, MainActivity.class);
                startActivity(SplashScrennIntent);

                // this 'finish()' is for exiting the app when back button pressed from Home page which is MainActivity
                finish();
            }
        }, SPLASH_TIME);
    }
}