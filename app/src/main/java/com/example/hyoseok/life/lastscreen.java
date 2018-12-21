package com.example.hyoseok.life;

import android.os.Bundle;
import android.widget.TextView;

public class lastscreen extends checkSurvey{
    private TextView showing_age;
    checkSurvey fianl = new checkSurvey();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        showing_age = findViewById(R.id.show_age);

        showing_age.setText(fianl.total);
    }
}
