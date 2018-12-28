package com.example.hyoseok.life;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*// Set fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Set No Title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);*/
        TextView showtext =(TextView) findViewById(R.id.showtext);

        Animation animtext = new AlphaAnimation(0.0f, 1.0f);
        animtext.setDuration(100);
        animtext.setStartOffset(20);
        animtext.setRepeatMode(Animation.REVERSE);
        animtext.setRepeatCount(Animation.INFINITE);
        showtext.startAnimation(animtext);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(getApplicationContext(), secondscreen.class);
                startActivityForResult(myintent, 0);
            }
        });



    }


}
