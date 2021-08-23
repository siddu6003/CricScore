package com.example.iplguru;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class Article extends AppCompatActivity {
    RecyclerView recycle;
    FirebaseDatabase fd;
    String arr2[];
    StorageReference ms;

    DatabaseReference c,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        arr2=new String[10];
        fd=FirebaseDatabase.getInstance();
        c=fd.getReference("Article6").child("content6");
        c2=fd.getReference("Article7").child("content7");
        c3=fd.getReference("Article3").child("content3");
        c4=fd.getReference("Article4").child("content4");
        c5=fd.getReference("Article5").child("content5");
        ms= FirebaseStorage.getInstance().getReference();
        c.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val=dataSnapshot.getValue(String.class);
                arr2[0]=val;
              load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        c2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val=dataSnapshot.getValue(String.class);
                arr2[1]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        c3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val=dataSnapshot.getValue(String.class);
                arr2[2]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        c4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val=dataSnapshot.getValue(String.class);
                arr2[3]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        c5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val=dataSnapshot.getValue(String.class);
                arr2[4]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
    public void load(){
        int position=getIntent().getIntExtra("position",0);
        recycle=(RecyclerView)findViewById(R.id.Art);
        ArticleRecycler myRecycler=new ArticleRecycler(this,arr2,position);
        recycle.setAdapter(myRecycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.setNestedScrollingEnabled(false);
    }
}