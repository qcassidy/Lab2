package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //comment
    public void addFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());
        int res = num1 + num2;
        goToActivity2(Integer.toString(res));
    }
    public void subtractFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());
        int res = num1 - num2;
        goToActivity2(Integer.toString(res));
    }
    public void multiplyFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());
        int res = num1 * num2;
        goToActivity2(Integer.toString(res));
    }
    public void divideFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());
        int res = num1 / num2;
        goToActivity2(Integer.toString(res));
    }

    public void goToActivity2(String res) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", res);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}