package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Plus = findViewById(R.id.buttonPlus);
        Button Minus = findViewById(R.id.buttonMinus);

        Plus.setOnClickListener(new View.OnClickListener() { //create Button Function
            @Override
            public void onClick(View view) {
                goToPlus();
            }
        });

        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMinus();
            }
        });

    }

    public void goToPlus() {
        EditText input1 = findViewById(R.id.editTextNumber1);
        EditText input2 = findViewById(R.id.editTextNumber2);

        String value1 = input1.getText().toString(); //get Input value and convert to string
        int val1 = Integer.parseInt(value1); //convert to integer

        String value2 = input2.getText().toString();
        int val2 = Integer.parseInt(value2);

        int plus = val1 + val2; //add 2 numbers
        String plusValue = String.valueOf(plus); //number convert to string

        String plusText = value1 + " + " + value2 + " = " + plusValue;

        Intent intent = new Intent(this,Plus.class); //create link to second page
        intent.putExtra("numPlus",plusText); //send data to second page

        startActivity(intent); //go to second page
    }

    public void goToMinus() {
        EditText input1 = findViewById(R.id.editTextNumber1);
        EditText input2 = findViewById(R.id.editTextNumber2);

        String value1 = input1.getText().toString();
        int val1 = Integer.parseInt(value1);

        String value2 = input2.getText().toString();
        int val2 = Integer.parseInt(value2);

        int minus = val1 - val2;
        String minusValue = String.valueOf(minus);

        String minusText = value1 + " - " + value2 + " = " + minusValue;

        Intent intent = new Intent(this,Minus.class);
        intent.putExtra("numMinus",minusText);

        startActivity(intent);
    }

}