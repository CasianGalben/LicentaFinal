package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TesteVerificare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_verificare);
        getSupportActionBar().hide();

        Button Test1 = findViewById(R.id.Test1);
        Test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TesteVerificare.this, Ecran4.class);
                startActivity(intent);

            }
        });

        Button Test2 = findViewById(R.id.Test2);
        Test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TesteVerificare.this, Test2.class);
                startActivity(intent);

            }
        });

        Button Test3 = findViewById(R.id.Test3);
        Test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TesteVerificare.this, Test3.class);
                startActivity(intent);

            }
        });

        Button Test4 = findViewById(R.id.Test4);
        Test4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TesteVerificare.this, Test4.class);
                startActivity(intent);

            }
        });
    }}