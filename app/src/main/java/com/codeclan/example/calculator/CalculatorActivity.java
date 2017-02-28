package com.codeclan.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {
    EditText firstNumEditText;
    EditText secondNumEditText;
    Button shakeButton;
    Calculator calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        firstNumEditText = (EditText)findViewById(R.id.num1_edittext);
        secondNumEditText = (EditText)findViewById(R.id.num2_edittext);
        shakeButton = (Button)findViewById(R.id.shake_btn);

        calc = new Calculator();
    }

    public void onShakeButtonClicked(View button) {
//        int answer = calc.addNumbers();
//
//        Intent intent = new Intent(CalculatorActivity.this, AnswerActivity.class);
//        intent.putExtra("answer", answer);
//
//        startActivity(intent);
//    }
}
