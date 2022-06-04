package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BunVenit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bun_venit);
        getSupportActionBar().hide();
        Button btnEcran2 = findViewById(R.id.btn_ecran2);
        btnEcran2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BunVenit.this,Ecran2.class);
                startActivity(intent);
                finish();


            }
        });
        Button btnEcran3 = findViewById(R.id.btn_ecran3);
        btnEcran3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BunVenit.this,Ecran3.class);
                startActivity(intent);


            }
        });
        Button btnEcran4 = findViewById(R.id.btn_ecran4);
        btnEcran4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BunVenit.this,TesteVerificare.class);
                startActivity(intent);


            }
        });


        Button btnEcran5 = findViewById(R.id.btn_ecran5);
        btnEcran5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BunVenit.this,Ecran5.class);
                startActivity(intent);


            }
        });
    }
}