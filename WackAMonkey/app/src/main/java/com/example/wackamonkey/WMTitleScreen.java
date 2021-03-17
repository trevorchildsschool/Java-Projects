package com.example.wackamonkey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WMTitleScreen extends AppCompatActivity implements View.OnClickListener{
    Intent play;
    Intent settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w_m_title_screen);
        play = new Intent(this, Game.class);
        settings = new Intent(this,Settings.class);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.playButtonTitle){
            startActivity(play);
            finish();
        }
        else if(v.getId()==R.id.settings){
            startActivity(settings);
            finish();
        }
    }
}