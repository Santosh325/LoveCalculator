package com.example.lovecalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText maleName,femaleName;
    Button calculate,clear;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maleName = findViewById(R.id.maleName);
        femaleName = findViewById(R.id.femaleName);
        output = findViewById(R.id.output);
        calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");

                String he = maleName.getText().toString();
                String she = femaleName.getText().toString();



                if(he.equals("") && she.equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter you name or partner name", Toast.LENGTH_SHORT).show();
                } else {
                    Random rand = new Random();
                    int max = 100;
                    int min = 70;
                    int randomNum = rand.nextInt((max - min) + 1) + min ;
                    String str = String.valueOf(randomNum) + "%";
                    output.setText(str);
                    maleName.setText("");
                    femaleName.setText("");

                }


            }
        });


    }
}
