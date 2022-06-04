package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Detalii extends AppCompatActivity {
    TextView fnDetalii,lnDetalii,ageDetalii;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalii);
        getSupportActionBar().hide();

        Intent intent= getIntent();

        fnDetalii = findViewById(R.id.firstNameDetalii);
        lnDetalii = findViewById(R.id.lastNameDetalii);
        ageDetalii = findViewById(R.id.ageDetalii);

        Button Motivatie = findViewById(R.id.btn_motivatie);
        Motivatie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detalii.this,Motivatie.class);
                startActivity(intent);


            }
        });

        if(intent!=null){
            setTitle("Detalii despre:"+" "+intent.getStringExtra( "firstname"));
            fnDetalii.setText("Vom discuta despre:" +" "+intent.getStringExtra("firstname")+"."+" "+"Pe lângă teorie, o să găsim și exemplele necesare pentru un mod de învățare mai optim. ");
            lnDetalii.setText("Deoarece matematica este o materie complexă, aceasta este împărțită pe mai multe ramuri. Ramura pe cara o studiem în acest capitol este:"+" "+intent.getStringExtra("lastname")+"."+" ");
            ageDetalii.setText("Capitolele prezente sunt studiate în clasa a IX-a, iar fiecare capitol este împărțit la rândul lui în mai multe părți. Partea pe care în prezent o studiem este:" +" "+intent.getStringExtra("age")+"."+" ");
        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();  //pentru a inchide actiivitatea cand faci back
    }
}