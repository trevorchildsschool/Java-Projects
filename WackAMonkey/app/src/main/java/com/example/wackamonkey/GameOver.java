package com.example.wackamonkey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {
    String playerName;
    int score;
    String playername;

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

    }
}