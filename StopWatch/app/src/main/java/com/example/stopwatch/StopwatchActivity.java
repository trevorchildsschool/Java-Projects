package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

import org.w3c.dom.Text;

import java.util.Locale;

public class StopwatchActivity extends Activity {
    private int seconds = 0;
    private boolean running = false;
    private boolean wasRunning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("seconds",seconds);
        savedInstanceState.putBoolean("running",running);
        savedInstanceState.putBoolean("wasRunning",wasRunning);
    }
    //start stopwatch when start button is clicked
    public void onClickStart(View view){
        running = true;
    }
    //stop stopwatch when stop button is clicked
    public void onClickStop(View view){
        running = false;
    }
    //reset stopwatch when the reset button is clicked
    public void onClickReset(View view){
        running = false;
        seconds = 0;
        //also setting seconds to 0 to reset timer
    }
    private void runTimer(){
        final TextView timeView = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable(){//code you want passed into the runnable run() method
            @Override
            public void run(){
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format(Locale.getDefault(),"%d:%02d:%02d",hours,minutes,secs);
                timeView.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this, 1000); //run again after a delay of 1,000 ms
            }
        });



    }
}