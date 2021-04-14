package com.example.wackamonkey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class HighScores extends AppCompatActivity implements View.OnClickListener{
    Intent playScreenIntent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);

        playScreenIntent = new Intent(this, Game.class);

        //load in all high scores

        loadHighScoresIF();
//        loadHighScoresSD();
//        if(externalMemoryAvailable(this)){
//            loadHighScoresSD();
//        }
//        else{
//            loadHighScoresIF();
//        }
    }

    private void loadHighScoresSD() {
        try{
            //open sd card directory
            File privateLocation = getExternalFilesDir(null);
            // create or open the highscores txt file from the sd card
            File myFile = new File(privateLocation,"HighScores.txt");
            // creates an input stream that will allow you to read from the file
            FileInputStream fis = openFileInput("HighScores.txt");
            // read scores from file input stream (fis)
            readScoresFIS(fis);
        }
        catch (Exception e){
            CharSequence text = "the file could not be opened"+e.toString();
            Toast toastMSG = Toast.makeText(this , text, Toast.LENGTH_LONG);
            toastMSG.show();
        }


    }
    public static boolean externalMemoryAvailable(Activity context){
        File[] storages = ContextCompat.getExternalFilesDirs(context,null);
        if(storages.length>1 && storages[0] != null && storages[1] !=null)
            return true;
        else
            return false;
        }
    private void loadHighScoresIF(){ //internal file
        try{
            FileInputStream fis = openFileInput("HighScores.txt");
            readScoresFIS(fis);
        }
        catch(Exception e){
            CharSequence text = "the file could not be opened"+e.toString();
            Toast toastMSG = Toast.makeText(this , text, Toast.LENGTH_LONG);
                toastMSG.show();
        }
    }
    private void readScoresFIS(FileInputStream fis){
        InputStreamReader iSReader = new InputStreamReader(fis);

        TextView tvName = (TextView)findViewById(R.id.playerNames);
        TextView tvScore = (TextView)findViewById(R.id.playerScores);

        String endline = System.getProperty("line.separator");

        LinkedList<String> playerNames = new LinkedList<>();
        LinkedList<Integer> playerScores = new LinkedList<>();

        try{
            BufferedReader bR = new BufferedReader(iSReader);
            String name = bR.readLine();

            while(name !=null){
                String strScore = bR.readLine();
                int score = Integer.parseInt(strScore);

                ListIterator<Integer> scoreIter = playerScores.listIterator();
                ListIterator<String> playerIter = playerNames.listIterator();
                while (scoreIter.hasNext()){
                    Integer thisScore = scoreIter.next();
                    playerIter.next();
                    if(score >= thisScore){
                        break;
                    }
                }
                if(playerScores.size()>0){
                    scoreIter.previous();
                    playerIter.previous();

                }
                scoreIter.add(new Integer(score));
                playerIter.add(name);

                name = bR.readLine();

            }
        bR.close();
        }

        catch (Exception e){
            CharSequence text = "issue with reading file"+e.toString();
            Toast toastMSG = Toast.makeText(this , text, Toast.LENGTH_SHORT);
            toastMSG.show();
        }
        ListIterator<Integer> scoreIter = playerScores.listIterator();
        ListIterator<String> playerIter = playerNames.listIterator();

        String sortedNames ="";
        String sortedScores ="";

        int numPresent = 0;
        while (scoreIter.hasNext()){
            Integer score = scoreIter.next();
            String name = playerIter.next();

            sortedScores += score.toString() + endline;
            sortedNames +=name+endline;
            numPresent++;
            if(numPresent>=10){
                break;
            }
        }

        tvName.setText(sortedNames);
        tvScore.setText(sortedScores);

    }
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.highscoreplay){
            startActivity(playScreenIntent);
            finish();
        }
        else if (v.getId()==R.id.quit){
            Intent titleScreenIntent = new Intent(this,WMTitleScreen.class);
            startActivity(titleScreenIntent);
            finish();
        }
    }
}