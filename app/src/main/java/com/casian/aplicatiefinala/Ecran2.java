package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class Ecran2 extends AppCompatActivity {

    private Button btnAdd,btnView;
    private EditText etNume,etVarsta;
    private Switch mySwitch;
    private ListView myList;
    ArrayAdapter<UserModel> adapter;
    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran2);
        getSupportActionBar().hide();

        btnAdd = findViewById(R.id.btnAdaugare);
        btnView = findViewById(R.id.btnAfisare);
        etNume = findViewById(R.id.et_username);
        etVarsta = findViewById(R.id.et_varsta);
        mySwitch = findViewById(R.id.switch_activ);
        myList = findViewById(R.id.lv_users);
        dataBaseHelper = new DataBaseHelper(Ecran2.this);
        afisareUsers(dataBaseHelper);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                UserModel userModel = null;
                try {
                    userModel = new UserModel(1,etNume.getText().toString(),Integer.parseInt(etVarsta.getText().toString()),mySwitch.isChecked());


                }catch (Exception e){
                    userModel = new UserModel(1, "Erorr", 0, false);
                    Toast.makeText(Ecran2.this, "No data error ",Toast.LENGTH_SHORT).show();
                }

                DataBaseHelper dataBaseHelper = new DataBaseHelper(Ecran2.this);
                boolean succes = dataBaseHelper.adaugaUser(userModel);
                Toast.makeText(Ecran2.this,"Utilizatorul "+etNume.getText().toString()+" a fost adaugat cu succes, având varsta: "+etVarsta.getText().toString()+" ani și a setat procesarea datelor pe: "+mySwitch.isChecked(),Toast.LENGTH_LONG).show();

                afisareUsers(dataBaseHelper);

                etNume.setText("");
                etVarsta.setText("");
            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                afisareUsers(dataBaseHelper);
                Toast.makeText(Ecran2.this,"Pentru a sterge un cont deja creat trebuie doar să apăsați pe acesta.",Toast.LENGTH_LONG).show();

            }
        });

        Button btnBackEC1 = findViewById(R.id.btnBACKEC1);
        btnBackEC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ecran2.this,BunVenit.class);
                startActivity(intent);
            }
        });

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                UserModel userModel = (UserModel) parent.getItemAtPosition(i);
                dataBaseHelper.deleteUsers(userModel);
                afisareUsers(dataBaseHelper);

            }
        });



    }

    public void afisareUsers(DataBaseHelper dataBaseHelper2) {
        adapter = new ArrayAdapter<UserModel>(Ecran2.this, android.R.layout.simple_list_item_1, dataBaseHelper2.getUsers());
        myList.setAdapter(adapter);
    }
}