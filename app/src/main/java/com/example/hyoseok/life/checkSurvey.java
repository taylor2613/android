package com.example.hyoseok.life;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.System.exit;

public class checkSurvey extends secondscreen {

    private thirdscreen mQuestionLivrary = new thirdscreen();
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private int mQuestionNumber =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        mQuestionView =  findViewById(R.id.Question);
        mButtonChoice1 =  findViewById(R.id.Yes);
        mButtonChoice2 =  findViewById(R.id.No);


        updateQuestion();
        //

        //if press YES button
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice1.getText() == "YES") {
                    updateQuestion();
                }
                else if (mButtonChoice1.getText() == "RESULT") {
                    mButtonChoice1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Intent myintent1 = new Intent(getApplicationContext(), lastscreen.class);
                            startActivityForResult(myintent1, 0);
                        }
                    });
                }
            }
        });

        //if press No button
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice2.getText() == "NO") {
                    updateQuestion();

                } else if (mButtonChoice2.getText() == "EXIT") {
                    exit(0);
                }
            }
        });




    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLivrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLivrary.getChoice0(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLivrary.getChoice1(mQuestionNumber));
        if(mButtonChoice1.getText() =="YES"){
            total+=mQuestionLivrary.getscore_yes(mQuestionNumber);
        }else{
            total+=mQuestionLivrary.getscore_no(mQuestionNumber);
        }
        mQuestionNumber++;

    }







}
