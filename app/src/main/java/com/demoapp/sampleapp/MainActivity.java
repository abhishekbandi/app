package com.demoapp.sampleapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Chronometer chronometer;
    private Button btn;
    private  boolean running;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        btn= findViewById(R.id.btn);
        chronometer=findViewById(R.id.chronometer);

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void startTimer(View v) {
        if (!running){
            chronometer.start();
            running= true;
        }
        else if(running){
            chronometer.stop();
            running=false;
        }
        //TODO: START A TIMER WITH MILLISECONDS PRECESSION AND DISPLAY IT ON TEXTVIEW.

        ClassThree.generatePdf(this);

        //TODO: ONCE THIS PDF IS GENERATED, STOP TIMER AND OPEN THE PDF.
    }
}