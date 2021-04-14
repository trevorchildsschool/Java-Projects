package com.example.wackamonkey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class Settings extends AppCompatActivity implements View.OnClickListener{
Intent playintent;
    int difficulty;
    int duration;
    int numMoles;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        setUpSpinner();
        loadSettings();
        playintent = new Intent(this, Game.class);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() != R.id.button) {
            return; //return to monke
        } else {
            //Intent returnIntent = new Intent(this,WMTitleScreen.class);



            EditText etName = (EditText) findViewById(R.id.etName);
            RadioButton easy = (RadioButton) findViewById(R.id.rbEasy);
            RadioButton normal = (RadioButton) findViewById(R.id.rbNormal);
            RadioButton hard = (RadioButton) findViewById(R.id.rnHard);
            SeekBar sb = (SeekBar) findViewById(R.id.sbDuration);
            Spinner sp = (Spinner) findViewById(R.id.spMoles);

            name = etName.getText().toString();
            duration = sb.getProgress();
            numMoles = sp.getSelectedItemPosition() + 3;
            if (easy.isChecked()) {
                difficulty = 3;
            } else if (hard.isChecked()) {
                difficulty = 1;
            } else {
                difficulty = 2;
            }

            // saveSettingsInIntent(difficulty,name,numMoles,duration,playintent);
            saveSettingsInPrefs(difficulty, name, numMoles, duration, playintent);

            startActivity(playintent);
        }
    }
    private void saveSettingsInPrefs(int difficulty, String name, int numMoles, int duration, Intent playintent){
        //ref to shared preferences
        SharedPreferences prefs = getSharedPreferences("WhackSettings",MODE_PRIVATE);

        SharedPreferences.Editor editor = prefs.edit();
        //saving the options info
        editor.putString("name", name);
        editor.putInt("difficulty", difficulty);
        editor.putInt("duration",duration);
        editor.putInt("nummoles",numMoles);

        editor.commit();


    }



    private void saveSettingsInIntent(int difficulty, String name, int numMoles, int duration, Intent myIntent){
        playintent.putExtra("name", name);
        playintent.putExtra("difficulty",difficulty);
        playintent.putExtra("duration",duration);
        playintent.putExtra("nummoles",numMoles);
    }
    private void setUpSpinner(){
        Spinner sp = (Spinner)findViewById(R.id.spMoles);
        String[] numMoles = {"3", "4", "5", "6", "7", "8", "9"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, numMoles);
        sp.setAdapter(adapter);

    }
    private void loadSettings(){
        SharedPreferences prefs = getSharedPreferences("WhackSettings", MODE_PRIVATE);
        String playerName = prefs.getString("name","player");
        int difficultyLevel = prefs.getInt("difficulty",1);
        int numMoles = prefs.getInt("numMoles",8);
        int duration = prefs.getInt("duration",20);

        EditText etName = (EditText)findViewById(R.id.etName);
        RadioButton easy = (RadioButton)findViewById(R.id.rbEasy);
        RadioButton hard = (RadioButton)findViewById(R.id.rnHard);
        SeekBar sb = (SeekBar)findViewById(R.id.sbDuration);
        Spinner sp = (Spinner)findViewById(R.id.spMoles);

        etName.setText(playerName);
        sp.setSelection(numMoles-3);
        sb.setProgress(duration);

        if(difficultyLevel == 3){
            easy.setChecked(true);
        }
        else if(difficultyLevel == 1){
            hard.setChecked(true);
        }
        else{
            difficultyLevel =2;
        }
    }
}