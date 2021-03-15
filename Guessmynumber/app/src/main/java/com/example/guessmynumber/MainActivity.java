package com.example.guessmynumber;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String guess;
    int tries = 3;
    Integer number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random r = new Random();
        number = r.nextInt(10);
        number ++;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView test = (TextView)findViewById(R.id.testOutput);
        test.setText(number.toString());


    }
    public void onGuess(View view){
        tries--;
        EditText guessBox = (EditText)findViewById(R.id.numberField);
        guess = guessBox.getText().toString();
        Intent makeGuess = new Intent(this,play.class);
        makeGuess.putExtra("guess",guess);
        makeGuess.putExtra("number",number);
        makeGuess.putExtra("tries",tries);
        startActivity(makeGuess);

    }

}