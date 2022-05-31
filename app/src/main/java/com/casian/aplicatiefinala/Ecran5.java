package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ecran5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran5);


        Button mateinfo= findViewById(R.id.btn_mateinfo);
        mateinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ecran5.this,MateInfo.class);
                startActivity(intent);
            }
        });

        Button stinte= findViewById(R.id.btn_stinte);
        stinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ecran5.this,Stinte.class);
                startActivity(intent);
            }
        });

        Button tehnologic= findViewById(R.id.btn_teologic);
        tehnologic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ecran5.this,Tehnologic.class);
                startActivity(intent);
            }
        });

        Button pedagogic= findViewById(R.id.btn_pedagogic);
        pedagogic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ecran5.this,Pedagogic.class);
                startActivity(intent);
            }
        });





    }
}