package com.example.wackamonkey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;


public class Game extends AppCompatActivity implements View.OnClickListener{

    ArrayList<Integer> myButtonIDs = new ArrayList<>();

    protected Handler taskHandler = new Handler();

    protected Boolean isComplete = false;
    Button currentMole;

    long startTime = System.currentTimeMillis();
    int score = 0;
    String playername = "player";
    int difficultyLevel = 2; // 1 = hard 2 = medium 3 = easy
    int numMoles = 8;
    int duration = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        initButtons();
        setNewMole(); //set one mole as current
        setTimer(difficultyLevel*1000);

    }

    @Override
    public void onClick(View v)
    {
        if(isComplete){
            return;

        }
        if(v==currentMole){
            score++;
            TextView tvscore = (TextView)findViewById(R.id.textView);
            tvscore.setText("Score: "  +score);
            setNewMole();
        }
    }

    //this method is called
    public void gameOver(){

        isComplete = true;
        TextView tvscore = (TextView)findViewById(R.id.textView);
        tvscore.setText("GAME OVER!!! YOUR TRASH \n Score: "  +score);

        Intent gameOver = new Intent(this, GameOver.class);
        gameOver.putExtra("score",score);
        gameOver.putExtra("name",playername);
        startActivity(gameOver);
        finish();
    }

    public void setNewMole(){
        Random generator = new Random();
        int randomItem = generator.nextInt(numMoles);

        int newButtonId = myButtonIDs.get(randomItem);

        if(currentMole!=null){
            currentMole.setVisibility(View.INVISIBLE);
        }
        Button newMole = (Button)findViewById(newButtonId);
        newMole.setVisibility(View.VISIBLE);
        currentMole=newMole;
    }

    public void initButtons(){
        ViewGroup group = (ViewGroup)findViewById(R.id.gameLayout);
        View v;
        //loop controls and find buttons
        for(int i = 0; i < group.getChildCount();i++){
            v = group.getChildAt(i);
            if(v instanceof Button){
                v.setOnClickListener(this); // set onclick listener
                //if game not over
                if(isComplete==false){
                    myButtonIDs.add(v.getId()); // add the button id to the array
                    v.setVisibility(View.INVISIBLE); // set the button to invisible

                }
            }
        }
    }

    protected void setTimer(long time){ //tells us what we pass in (long time)
    final long elapse = time;

    Runnable t = new Runnable(){

        @Override
        public void run() {
            onTimerTask();
            if(!isComplete){
                taskHandler.postDelayed(this,elapse);
            }

        }
    };
        taskHandler.postDelayed(t,elapse);
    }

    protected void onTimerTask(){
        //calculate ending time based on the duration

        long endtime = startTime+(duration*1000);


        if(endtime>System.currentTimeMillis()){
            setNewMole();
        }
        else{
            gameOver();
        }


    }






}