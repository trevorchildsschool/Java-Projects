package com.example.wackamonkey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HighScores extends AppCompatActivity implements View.OnClickListener{
    Intent playScreenIntent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);

        playScreenIntent = new Intent(this, Game.class);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.highscoreplay){
            startActivity(playScreenIntent);
            finish();
        }
        else if (v.getId()==R.id.quit){
            finish();
        }
    }
}