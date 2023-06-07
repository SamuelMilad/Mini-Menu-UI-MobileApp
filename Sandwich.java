package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Sandwich extends AppCompatActivity {

    RadioButton chicken, burger, sosis, shirmp;
    Button sel;
    String result = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich);

        chicken = findViewById(R.id.rdChicken);
        burger = findViewById(R.id.rdBurger);
        sosis = findViewById(R.id.rdSosis);
        shirmp = findViewById(R.id.rdShrimp);
        sel = findViewById(R.id.btSel);

        sel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chicken.isChecked()){
                    result = "Chicken Sandwich";
                }else if(burger.isChecked()){
                    result = "Burger Sandwich";
                }else if(sosis.isChecked()){
                    result = "Sosis Sandwich";
                }else if(shirmp.isChecked()){
                    result = "Shirmp Sandwich";
                }else{
                    Toast.makeText(Sandwich.this, "Please Select Your Sandwich", Toast.LENGTH_SHORT).show();
                }

                if((!result.isEmpty())){
                    Toast.makeText(Sandwich.this, "Your Sandwich : " + result, Toast.LENGTH_SHORT).show();
                }   else {
                    Toast.makeText(Sandwich.this, "Please Select Your Sandwich", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}