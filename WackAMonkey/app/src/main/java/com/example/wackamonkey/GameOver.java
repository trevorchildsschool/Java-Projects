package com.example.wackamonkey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOver extends AppCompatActivity implements View.OnClickListener {
    String playerName;
    int score;
    String playername;
    Intent playIntent;
    Intent highScoreScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        TextView tvMessage = (TextView)findViewById(R.id.tvmessage);
        TextView tvGameOver = (TextView)findViewById(R.id.tvGameOver);
        score = getIntent().getExtras().getInt("score");
        playername = getIntent().getExtras().getString("name");
        tvMessage.setText("You hit "+score+" times");
        tvGameOver.setText("Game Over "+playername);

        playIntent = new Intent(this, Game.class);
        highScoreScreen = new Intent(this, HighScores.class);
    }
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.buttonPlay){
            startActivity(playIntent);
            finish();
        }
        else if (v.getId()==R.id.hsPlayButton){
            startActivity(highScoreScreen);
            finish();
        }
    }
}