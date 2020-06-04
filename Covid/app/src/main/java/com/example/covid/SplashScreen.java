package com.example.covid;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private  ProgressBar progressBar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        progressBar= (ProgressBar)  findViewById(R.id.progressBarid);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork ();
                startapp() ;
            }
        });

        thread.start();


    }

    public  void  doWork(){

        for (progress=20 ; progress<=100 ; progress= progress+20 )

        {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

    public void startapp()
    {

        //Intent intent= new Intent(SplashScreen.this, login.class);
        Intent intent= new Intent(SplashScreen.this, login.class);
        startActivity(intent);
        finish();


    }
}
