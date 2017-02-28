package com.codeclan.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 28/02/2017.
 */

public class AnswerActivity extends AppCompatActivity {

    TextView answer_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answer_textview = (TextView)findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int value = extras.getInt("answer");
        answer_textview.setText(value);
    }
}
