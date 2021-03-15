package com.example.beeradviser;
import java.util.ArrayList;
import java.util.List;


public class DrinkExpert {
    List<String>getBrands(String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("Clear")){
            brands.add("Sprite");
            brands.add("7UP");
            brands.add("WATER!!!");
            brands.add("Club Soda");
            brands.add("Propel");
            brands.add("");
        }
        else if (color.equals("Dark Cola")){
            brands.add("Pepsi");
            brands.add("Coca Cola");
            brands.add("RC");
            brands.add("Root Beer");
        }
        else if (color.equals("Punch")){
            brands.add("Fruit Punch");
            brands.add("Grape");
            brands.add("Pineapple");
            brands.add("Cherry");
        }
        else if (color.equals("Diet")){
            brands.add("Diet Mtn Dew");
            brands.add("Diet Coke");
            brands.add("Diet Pepsi");
            brands.add("Water");
        }
        else if (color.equals("Zero Sugar")){
            brands.add("Coke Zero");
            brands.add("Pepsi Zero Sugar");
            brands.add("Mtn Dew Zero Sugar");
            brands.add("Water");
        }
        else if (color.equals("Energy Drinks")){
            brands.add("Monster");
            brands.add("Redbull");
            brands.add("NOS");
            brands.add("GFuel");
        }
        else if (color.equals("Tea")){
            brands.add("Green Tea");
            brands.add("Green Tea Sugar Free");
            brands.add("Iced Tea");
            brands.add("Water");
        }
        else if (color.equals("Coffee")){
            brands.add("Black Coffee");
            brands.add("Flat White");
            brands.add("Cappuccino");
            brands.add("Caffe Mocha");
            brands.add("Cortado");
            brands.add("Latte");

        }


        else{
            brands.add("Mtn Dew");
        }
        return brands;

    }


}
