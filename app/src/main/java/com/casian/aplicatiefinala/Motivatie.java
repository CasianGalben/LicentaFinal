package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Motivatie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivatie);
        getSupportActionBar().hide();
        String [] cap = getResources().getStringArray(R.array.capitole);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.item_lista,cap); // adaptor in care preluam stringul de capitole
        ListView list = findViewById(R.id.myList);
        list.setAdapter(adapter);


    }




    }
