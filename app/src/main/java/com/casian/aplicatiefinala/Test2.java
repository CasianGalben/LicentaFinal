package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Test2 extends AppCompatActivity implements View.OnClickListener {

    private Button ButonAdevarat;
    private Button ButonFals;
    private Button VerificareRaspunsCorect;
    private Button VerificareRaspunsGresit;
    private ImageButton Next;
    private TextView tvIntrebare;
    private int indexIntrebare = 0;
    private Intrebare[] mIntrebari = new Intrebare[]{  // creem o banca de obiecte de timpul intrebare care ia din string intrebarile
            new Intrebare(R.string.Intreabare21, true),
            new Intrebare(R.string.Intreabare22, false),
            new Intrebare(R.string.Intreabare23, true),
            new Intrebare(R.string.Intreabare24, true),
            new Intrebare(R.string.Intreabare25, false),
            new Intrebare(R.string.Intreabare26, true),
            new Intrebare(R.string.Intreabare27, false),

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ecran4);

        ButonAdevarat = findViewById(R.id.bt_True);
        ButonFals = findViewById(R.id.btn_False);
        Next = findViewById(R.id.UrmatoareaIntrebareBTN);
        VerificareRaspunsCorect = findViewById(R.id.verificareRaspunsCorect);
        VerificareRaspunsGresit = findViewById(R.id.verificareRaspunsGresit);
        getSupportActionBar().hide();
        tvIntrebare = findViewById(R.id.tvIntrebari);
        tvIntrebare.setText(mIntrebari[0].getIntrebareText());

        ButonAdevarat.setOnClickListener(this);
        ButonFals.setOnClickListener(this);
        Next.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {    // luam id ul viewului si il folosim pentru a verifica raspunsurile si folosim metodele de mai jos
        switch (view.getId()) {
            case R.id.bt_True:
                int raspunsuriCorecte=0;
                verificaRaspuns(true);
                raspunsuriCorecte+=1;
                int finalRaspunsuriCorecte = raspunsuriCorecte;
                VerificareRaspunsCorect.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(Test2.this,"Pana acum ai "+ finalRaspunsuriCorecte+" r??spunsuri corecte",Toast.LENGTH_LONG).show();

                    }
                });




                break;

            case R.id.btn_False:
                int raspunsuriGresite=0;
                verificaRaspuns(false);
                raspunsuriGresite+=1;
                int finalRaspunsuriGresite=raspunsuriGresite;
                VerificareRaspunsGresit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(Test2.this,"Pana acum ai "+finalRaspunsuriGresite+" r??spunsuri gresite",Toast.LENGTH_LONG).show();

                    }
                });

                break;

            case R.id.UrmatoareaIntrebareBTN:
                Toast.makeText(getApplicationContext(), "Urmatoarea intreabare", Toast.LENGTH_SHORT).show();

                indexIntrebare = (indexIntrebare + 1) % mIntrebari.length;
                nextIntrebare();
                break;


        }

    }

    public void nextIntrebare() {
        Log.d("INTREBARE", String.valueOf(indexIntrebare));
        //INTRAM IN ARRAY UL DE INTREBARI
        tvIntrebare.setText(mIntrebari[indexIntrebare].getIntrebareText());

    }

    public void verificaRaspuns(boolean raspunsUtilizator) { //pt fiecare intrebare am luat raspunsul acestuia ( de la fiecare index)
        boolean raspunsIntrebare = mIntrebari[indexIntrebare].getRaspunsIntrebare();
        int mesaj = 0;
        if (raspunsIntrebare == raspunsUtilizator) {
            mesaj = R.string.IntrebareAdev;

        } else {
            mesaj = R.string.IntrebareFals;

        }
        Toast.makeText(getApplicationContext(), mesaj, Toast.LENGTH_SHORT).show();
    }



}