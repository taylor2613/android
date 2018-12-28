package com.example.hyoseok.life;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;



public class lastscreen extends secondscreen{

    public double over=0.0d,ha,sang=0.0d,bmi=0.0d;

    secondscreen hi = new secondscreen();
    //public int weight1 = hi.weight1;
    //public int age1 = hi.age1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);




        calculation();


        TextView show_age = findViewById(R.id.show_age);
        show_age.setText(""+total);

        TextView show_weight = findViewById(R.id.show_weight);
        if (weight1<=ha) {
            show_weight.setText("마름");
        }
        else if (weight1>ha && weight1<=sang) {
            show_weight.setText("평균");
        }
        else if (weight1>sang) {
            show_weight.setText("비만");
        }

    }

    private void calculation(){


        bmi = ( weight1 - 100 ) * 0.9;
        sang = bmi + 10;
        ha = bmi - 10;
        over = weight1 - sang;

        if(age1 >=30 && age1<40){
            total+=2;
        }else if(age1>=40 && age1<50){
            total+=3;
        }else if(age1>=50 && age1<70){
            total+=4;
        }else if(age1>=70){
            total+=5;
        }else {
            total+=1;
        }

        if(over>=23){
            total-=8;
        }else if(over>=13 && over<=22){
            total-=4;
        }else if(over>=5 && over<13){
            total-=2;
        }else if(over<5){
            total-=1;
        }


    }
}
