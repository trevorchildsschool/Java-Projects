package com.example.wackamonkey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class GameOver extends AppCompatActivity implements View.OnClickListener {
    String playerName;
    int score;
    Intent playIntent;
    Intent highScoreScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        TextView tvMessage = (TextView)findViewById(R.id.tvmessage);
        TextView tvGameOver = (TextView)findViewById(R.id.tvGameOver);
        score = getIntent().getExtras().getInt("score");
        playerName = getIntent().getExtras().getString("name");

        tvMessage.setText("YOUR SCORE IS "+score+"");
        tvGameOver.setText("GAME OVER "+playerName);

        playIntent = new Intent(this, Game.class);
        highScoreScreen = new Intent(this, HighScores.class);

        saveDataFile();
//            if(externalMemoryAvailable(this)){
//            saveDatatoSD();
//        }
//             else{
//
//        }


    }
    public static boolean externalMemoryAvailable(Activity context){
        File[] storages = ContextCompat.getExternalFilesDirs(context,null);
        if(storages.length>1 && storages[0] != null && storages[1] !=null)
            return true;
        else
            return false;
    }
    private void writeToFOS(FileOutputStream fos) {
        try{
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            String endLine = System.getProperty("line.separator");

            osw.write(playerName+endLine);
            osw.write(score+endLine);

            osw.flush();
            osw.close();
        }
        catch (Exception e){
            CharSequence text = "could not write to file"+e.toString();
            int dur = Toast.LENGTH_LONG;
            Toast message = Toast.makeText(this,text,dur);
            message.show();
        }
    }
    private void saveDatatoSD() {
        try{
            //open sd card directory
            File privateLocation = getExternalFilesDir(null);
            // create or open the highscores txt file from the sd card
            File myFile = new File(privateLocation,"HighScores.txt");
            // creates an input stream that will allow you to read from the file
            FileOutputStream fos = new FileOutputStream(myFile, true);
            writeToFOS(fos);
            // read scores from file input stream (fis)

        }
        catch (Exception e){
            CharSequence text = "file cannot be opened " + e.toString();
            int dur = Toast.LENGTH_LONG;
            Toast message = Toast.makeText(this,text,dur);
            message.show();
        }

    }

    private void saveDataFile() {
        try {
            FileOutputStream fos = openFileOutput("HighScores.txt", MODE_APPEND);
            writeToFOS(fos);

        }
        catch(Exception e){
            CharSequence text = "file cannot be opened " + e.toString();
            int dur = Toast.LENGTH_LONG;
            Toast message = Toast.makeText(this,text,dur);
            message.show();
        }

    }



    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.buttonPlay){
            finish();
            startActivity(playIntent);

        }
        else if (v.getId()==R.id.hsPlayButton){
            finish();
            startActivity(highScoreScreen);
            finish();

        }
    }
}