package com.example.guessmynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class play extends AppCompatActivity {
    int tries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        String guess = getIntent().getStringExtra("guess");
        int number = getIntent().getIntExtra("number",0);
        tries = getIntent().getIntExtra("tries",0);
        TextView guessText = (TextView)findViewById(R.id.playerGuess);
        guessText.setText("You guessed "+guess);
        TextView triesleft = (TextView)findViewById(R.id.triesleft);
        triesleft.setText("You have "+tries+" tries left");

        TextView highorlow = (TextView)findViewById(R.id.highorlow);
        Integer numguess = Integer.parseInt(guess);
        //Integer num = Integer.parseInt(number);
        if (numguess < number){
            highorlow.setText("Guess Higher");
        }
        else if (numguess > number){
            highorlow.setText("Guess Lower");
        }
        else{
            if(tries>0){
                if(numguess==number){
                    highorlow.setText("You Guessed Correctly");
                }
                else{
                    highorlow.setText("Guess Again");
                }
            }
            else {
                highorlow.setText("You are out of guesses, u suck btw");
            }
        }

    }
    public void buttonClick(View view){
        if(tries>0){
            Intent backToGuess = new Intent(this,MainActivity.class);
            startActivity(backToGuess);
        }
    }

}