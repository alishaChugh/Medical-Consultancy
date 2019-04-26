package com.example.navigationdrawerpractise;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splash_Screen extends AppCompatActivity {
    private static int splash_time=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash_Screen.this,MainDrawerActivity.class);
                startActivity(intent);
                finish();
            }
        },splash_time);
    }
}
