package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;


public class Ecran3 extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    List<User> list;
    DatabaseReference mDatabaseReference;
    Button btn_detaliiEC3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran3);
        btn_detaliiEC3=findViewById(R.id.btn_detaliiEC3);
        list = new ArrayList<>();
        mDatabaseReference = FirebaseDatabase.getInstance().getReference("Users");
        getUsers(mDatabaseReference);


        btn_detaliiEC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Ecran3.this,"Daca selectezi capitolul și vei apăsat scurt, o să accesezi detaliile capitolului. Daca selectezi capitolul și vei apăsat lung, o să accesezi PDF-ul cu materia. ",Toast.LENGTH_LONG).show();

            }
        });

    }
    public void setUsers(List<User> lista){
        mRecyclerView = findViewById(R.id.userList);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this,lista);
        mRecyclerView.setAdapter(myAdapter);


        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Intent intent = new Intent(Ecran3.this,Detalii.class);
                intent.putExtra("firstname",lista.get(position).getFirstname()); // ai grija sa selectezi mereu ce out extra vrei deoarece Ai mai multe functii cu mai multe tipuri de varibile ce se trimit
                intent.putExtra("lastname",lista.get(position).getLastname());
                intent.putExtra("age",lista.get(position).getAge());

                startActivity(intent);
            }

            @Override
            public void onItemLongClick(int position, View v) {
                Toast.makeText(getApplicationContext(),"S-a accesat:"+" "+lista.get(position).getFirstname()+" "+"Ramura:"+" "+lista.get(position).getLastname(),Toast.LENGTH_LONG).show();
                if (lista.get(position).getLastname().equals("Algebra 1")){
                    Intent intent = new Intent(Ecran3.this,PdfActivity.class);
                    startActivity(intent);}
                else if (lista.get(position).getLastname().equals("Algebra 2")){
                    Intent intent = new Intent(Ecran3.this,PdfActivity2.class);
                    startActivity(intent);
                }

                else if (lista.get(position).getLastname().equals("Geometrie")){
                    Intent intent = new Intent(Ecran3.this,PdfActivity3.class);
                    startActivity(intent);
                }

                else if (lista.get(position).getLastname().equals("Trigonometrie")){
                    Intent intent = new Intent(Ecran3.this,PdfActivity4.class);
                    startActivity(intent);
                }


            }
        });
    }

    public void getUsers(DatabaseReference databaseReference){
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list.removeAll(list);
                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){

                    User user = dataSnapshot1.getValue(User.class);
                    list.add(user);
                }

                setUsers(list);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }





}