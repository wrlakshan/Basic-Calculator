package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Plus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);

        String data = getIntent().getStringExtra("numPlus");

        TextView plusView = findViewById(R.id.textViewPlus);
        plusView.setText(data);

        Button Back = findViewById(R.id.PlusBack);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed(); //back to the main menu
            }
        });
    }

}