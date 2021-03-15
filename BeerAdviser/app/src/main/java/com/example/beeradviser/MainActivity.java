package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
import java.util.Random;

public class MainActivity extends Activity {
        private DrinkExpert expert = new DrinkExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void onClick_findDrink(View view){
        //get reference to the text view element
        TextView brands = (TextView) findViewById(R.id.beerview);
        //setting text test
        //brands.setText("you clicked the button");
        //reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //parse the selected item to a string
        String selected = color.getSelectedItem().toString();
        //printing the selected item


        List<String> choice_list = expert.getBrands(selected);
        StringBuilder drink_string = new StringBuilder();
        for (String choice : choice_list){
            drink_string.append("\t\t"+choice+"\n");
        }
    brands.setText("Try one of these:\n" + drink_string);



    }




}