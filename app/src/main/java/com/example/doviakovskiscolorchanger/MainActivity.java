package com.example.doviakovskiscolorchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout LinearLayout1;
    private LinearLayout LinearLayout2;
    private LinearLayout LinearLayout3;
    private LinearLayout LinearLayout4;

    private Button buttonGreen;
    private Button buttonRed;
    private Button buttonBlue;
    private Button buttonYellow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout1 = findViewById(R.id.linearLayout1);
        LinearLayout2 = findViewById(R.id.linearLayout2);
        LinearLayout3 = findViewById(R.id.linearLayout3);
        LinearLayout4 = findViewById(R.id.linearLayout4);

        buttonRed = findViewById(R.id.buttonRed);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonBlue = findViewById(R.id.buttonBlue);
        buttonYellow = findViewById(R.id.buttonYellow);

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout1.setBackgroundColor(Color.GREEN);
            }
        });

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout2.setBackgroundColor(Color.RED);
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout3.setBackgroundColor(Color.BLUE);
            }
        });

        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout4.setBackgroundColor(Color.YELLOW);
            }
        });



        }

}