package com.example.orderform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    String Isiced = " Not Iced";
    String Ishot = " Not Hot";
    String frenchVanilla;
    String caramel;

    String coffeeSelection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onDonutHole(){
        Spinner coffee = (Spinner)findViewById(R.id.spinner);
        RadioButton hot = (RadioButton)findViewById(R.id.radioButton2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.DonutHoles, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coffee.setAdapter(adapter);
    }

    public void onButtonClick(View view){
        TextView coffeeView = (TextView)findViewById(R.id.textView);
        CheckBox frenchVanillaBox = (CheckBox)findViewById(R.id.checkBox);
        CheckBox caramelBox = (CheckBox)findViewById(R.id.checkBox);
        Spinner coffee = (Spinner)findViewById(R.id.spinner);
        RadioButton iced = (RadioButton)findViewById(R.id.radioButton);
        RadioButton hot = (RadioButton)findViewById(R.id.radioButton2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.DonutHoles, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if(iced.isChecked()){
            Isiced = " Is Iced,";
        }
        if(hot.isChecked()){
            Ishot=" Is Hot,";
           
        }
        if(frenchVanillaBox.isChecked()){
            frenchVanilla = " French Vanilla,";
        }
        if(caramelBox.isChecked()){
            caramel = " Caramel";
        }

        coffeeSelection=String.valueOf(coffee.getSelectedItem());



        //coffeeView.setText(coffeeSelection+ Isiced+ Ishot+ frenchVanilla+ caramel);
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = coffeeSelection+ Isiced+ Ishot+ frenchVanilla+ caramel;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();

    }


}