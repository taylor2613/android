package com.example.hyoseok.life;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class checkSurvey extends secondscreen {
    public int total =0;
    private thirdscreen mQuestionLivrary = new thirdscreen();
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button show_result;
    private int left_life =0;
    private int mQuestionNumber =0;

    private secondscreen calc = new secondscreen();  //call  weight1, height1, age1, sex
    private double sang=0,ha=0,over=0,bmi=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mQuestionView =(TextView)findViewById(R.id.Question);
        mButtonChoice1=(Button)findViewById(R.id.Yes);
        mButtonChoice2=(Button)findViewById(R.id.No);
        show_result =(Button) findViewById(R.id.show_result);
        show_result.setVisibility(View.GONE);
        updateQuestion();
        getresult();

        //if press No button
        //TODO : not working!!!!!!!!!!!!!!!!!!!!!!!!!1
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(mButtonChoice1.getText() == "NO"){
                    left_life+=0;
                    updateQuestion();
                    updatelife(left_life);
                    if(mQuestionNumber==24){
                        show_result.setVisibility(View.VISIBLE);
                        show_result_button();
                    }

                }
            }
        });
        //if press YES button
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(mButtonChoice1.getText() == "YES"){
                    left_life+=10;
                    updateQuestion();
                    updatelife(left_life);
                    if(mQuestionNumber==24){
                        show_result.setVisibility(View.VISIBLE);
                        show_result_button();
                    }
                }
            }
        });



    }
    //숨겨져있던 버튼 나타난다음 누르면 마지막으로
    private void show_result_button(){
        show_result.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(getApplicationContext(), lastscreen.class);
                startActivityForResult(myintent, 0);
            }
        });
    }


    private void updateQuestion(){
        mQuestionView.setText(mQuestionLivrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLivrary.getChoice0(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLivrary.getChoice1(mQuestionNumber));

        mQuestionNumber++;
    }

    private int updatelife(int life){
        total+=life;
        return total;
    }

    private void getresult(){
        String value= calc.age.getText().toString();
        int age_string=Integer.parseInt(value);
        int age1=Integer.parseInt(String.valueOf(age_string));

        String value2= weight.getText().toString();
        int weight_string=Integer.parseInt(value2);
        int weight1=Integer.parseInt(String.valueOf(weight_string));

        bmi=(weight1-100)*0.9;
        sang=bmi+10;
        ha = bmi-10;

    }
}
