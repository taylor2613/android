package com.example.hyoseok.life;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


import java.util.ArrayList;


public class secondscreen extends Activity {
    EditText age,height,weight;

    ArrayList<String> sex = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        age= findViewById(R.id.Age_blank);
        height= findViewById(R.id.Height_blank);
        weight= findViewById(R.id.Weight_blank);

        sex.add("Man");
        sex.add("Woman");
        ArrayAdapter<String> spinnerArrayAdapter3 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, sex);
        spinnerArrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner3 = findViewById(R.id.sex_spin);
        spinner3.setAdapter(spinnerArrayAdapter3);

        addListernerOnButton();
    }

    public void addListernerOnButton() {
/*
        //age
        for (int i = 1; i <= 100; i++) {
            age.add(Integer.toString(i));
        }
        ArrayAdapter<Integer> spinnerArrayAdapter = new ArrayAdapter<Integer>(
                this, android.R.layout.simple_spinner_item, age);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = findViewById(R.id.age_spin);
        spinner.setAdapter(spinnerArrayAdapter);

        //height
        for (int i = 140; i <= 190; i++) {
            height.add(Integer.toString(i));
        }
        ArrayAdapter<Integer> spinnerArrayAdapter1 = new ArrayAdapter<Integer>(
                this, android.R.layout.simple_spinner_item, height);
        spinnerArrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner1 = findViewById(R.id.height_spin);
        spinner1.setAdapter(spinnerArrayAdapter1);

        //weight
        for (int i = 45; i <= 100; i++) {
            weight.add(Integer.toString(i));
        }
        ArrayAdapter<Integer> spinnerArrayAdapter2 = new ArrayAdapter<Integer>(
                this, android.R.layout.simple_spinner_item, weight);
        spinnerArrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner2 = findViewById(R.id.weight_spin);
        spinner2.setAdapter(spinnerArrayAdapter2);
*/

        Button btnsave = (Button) findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), checkSurvey.class);
                startActivityForResult(myintent, 0);
                //startActivity(new Intent(secondscreen.this, checkSurvey.this));
                //  IF THERE is nothing in information -> alert("error")
                if(age.getText().length()  <= 0){
                    age.setError("Input Age");
                }
                if(height.getText().length() <= 0){
                    height.setError("Input Height");
                }
                if(weight.getText().length() <= 0){
                    weight.setError("Input Weight");
                }


//                getvalue_age();
//                getvalue_height();
//                getvalue_weight();

            }
        });
    }

    public int getvalue_age(){
        String value= age.getText().toString();
        int age_string=Integer.parseInt(value);
        int age1=Integer.parseInt(String.valueOf(age_string));

        return age1;
    }
    public int getvalue_height(){
        String value1= height.getText().toString();
        int height_string=Integer.parseInt(value1);
        int height1=Integer.parseInt(String.valueOf(height_string));

        return height1;
    }
    public int getvalue_weight(){

        String value2= weight.getText().toString();
        int weight_string=Integer.parseInt(value2);
        int weight1=Integer.parseInt(String.valueOf(weight_string));
        return weight1;
    }
}
