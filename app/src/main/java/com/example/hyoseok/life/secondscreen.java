package com.example.hyoseok.life;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


import java.util.ArrayList;


public class secondscreen extends MainActivity {
    EditText age,height,weight;
    private Button btnsave;
    public int total =0;
    ArrayList<String> sex = new ArrayList<String>();
    ArrayList<String> lifestyle = new ArrayList<String>();
    public int age1,weight1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnsave = findViewById(R.id.btnsave);

        sex.add("Man");   //-3
        sex.add("Woman");    //+4
        ArrayAdapter<String> spinnerArrayAdapter3 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, sex);
        spinnerArrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner3 = findViewById(R.id.sex_spin);
        spinner3.setAdapter(spinnerArrayAdapter3);

        lifestyle.add("짧고 굵게");  //60
        lifestyle.add("평범하게");   // 76
        lifestyle.add("가늘고 길게");  // 99
        ArrayAdapter<String> spinnerArrayAdapter1 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, lifestyle);
        spinnerArrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner1 = findViewById(R.id.living);
        spinner1.setAdapter(spinnerArrayAdapter1);

        btnsave.setClickable(false);

        age= findViewById(R.id.Age_blank);
        height= findViewById(R.id.Height_blank);
        weight= findViewById(R.id.Weight_blank);


        addListernerOnButton();
    }

    public void addListernerOnButton() {

        String age_check = age.getText().toString().trim();
        String height_check = height.getText().toString().trim();
        String weight_check = weight.getText().toString().trim();
        //age1= Integer.parseInt(age.getText().toString());
        //weight1 = Integer.parseInt(weight.getText().toString());

        if(!age_check.isEmpty() || !height_check.isEmpty()  || !weight_check.isEmpty() ){
            btnsave.setClickable(true);

        }


        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setting();
                Intent myintent = new Intent(getApplicationContext(), checkSurvey.class);
                startActivityForResult(myintent, 0);

            }
        });
    }
    public void setting(){
        for(int i=0;i<sex.size();i++){
            if(sex.get(i)=="Man"){
                total+=(-3);
            }else{
                total+=4;
            }
        }

        for(int i=0;i<lifestyle.size();i++){
            if(lifestyle.get(i)=="짧고 굵게"){
                total+=60;
            }else if(lifestyle.get(i)=="평범하게"){
                total+=76;
            }else{
                total+=99;
            }
        }

    }

}
