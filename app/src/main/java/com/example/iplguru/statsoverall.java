package com.example.iplguru;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class statsoverall extends AppCompatActivity {
public static FirebaseDatabase fd;
   String arr[][];
public static DatabaseReference BatsmenName,BN1,BN2,BN3,BN4,BN5,BN6,BN7,BN8,BN9,Matches,Runs,Avg,Strikerate,Hs,CEN,HC,IN;
RecyclerView recycle;
String[] names={"Virat Kohli","Suresh Raina","David Warner","Rohit Sharma","Shikar Dhawan","AB de villiers","Chris Gayle","MS Dhoni","Robin Uthappa","Gautam Gambhir"};
int images[]={R.drawable.virat,R.drawable.raina,R.drawable.warner,R.drawable.rohit,R.drawable.dhawan,R.drawable.abd,R.drawable.gayle,R.drawable.msd,R.drawable.uthappa,R.drawable.gambhir};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF6347")));
        setContentView(R.layout.activity_statsoverall);
        getSupportActionBar().setTitle("Batting Overall");
        //updateBattingOverall("BattingOverall","Virat Kohli",192,184,5,39,5878,38.16f,130.73f,113);
        //updateBattingOverall("BattingOverall","Suresh Raina",193,189,5,39,5878,38.16f,130.73f,113);
        //updateBattingOverall("BattingOverall","David Warner",142,142,5,39,5878,38.16f,130.73f,113);
        //updateBattingOverall("BattingOverall","Rohit Sharma",200,195,5,39,5878,38.16f,130.73f,113);
        //updateBattingOverall("BattingOverall","Shikar Dhawan",176,175,5,39,5878,38.16f,130.73f,113);
        //updateBattingOverall("BattingOverall","AB de villiers",169,156,5,39,5878,38.16f,130.73f,113);
        //updateBattingOverall("BattingOverall","Chris gayle",132,131,5,39,5878,38.16f,130.73f,113);
        //updateBattingOverall("BattingOverall","MS Dhoni",204,182,5,39,5878,38.16f,130.73f,113);
        //updateBattingOverall("BattingOverall","Robin Uthappa",189,182,5,39,5878,38.16f,130.73f,113);
        //updateBattingOverall("BattingOverall","Gautam Gambhir",154,152,5,39,5878,38.16f,130.73f,113);
        fd=FirebaseDatabase.getInstance();
       arr=new String[10][8];
        BatsmenName=fd.getReference("BattingOverall").child("Virat Kohli");
        BatsmenName.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN1=fd.getReference("BattingOverall").child("Suresh Raina");
       BN1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[1][0]=Mat;
                arr[1][1]=in;
                arr[1][2]=c;
                arr[1][3]=hc;
                arr[1][4]=r;
                arr[1][5]=av;
                arr[1][6]=sr;
                arr[1][7]=hs;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN2=fd.getReference("BattingOverall").child("David Warner");
        BN2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[2][0]=Mat;
                arr[2][1]=in;
                arr[2][2]=c;
                arr[2][3]=hc;
                arr[2][4]=r;
                arr[2][5]=av;
                arr[2][6]=sr;
                arr[2][7]=hs;
load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN3=fd.getReference("BattingOverall").child("Rohit Sharma");
        BN3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[3][0]=Mat;
                arr[3][1]=in;
                arr[3][2]=c;
                arr[3][3]=hc;
                arr[3][4]=r;
                arr[3][5]=av;
                arr[3][6]=sr;
                arr[3][7]=hs;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN4=fd.getReference("BattingOverall").child("Shikar Dhawan");
        BN4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[4][0]=Mat;
                arr[4][1]=in;
                arr[4][2]=c;
                arr[4][3]=hc;
                arr[4][4]=r;
                arr[4][5]=av;
                arr[4][6]=sr;
                arr[4][7]=hs;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN5=fd.getReference("BattingOverall").child("AB de villiers");
        BN5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[5][0]=Mat;
                arr[5][1]=in;
                arr[5][2]=c;
                arr[5][3]=hc;
                arr[5][4]=r;
                arr[5][5]=av;
                arr[5][6]=sr;
                arr[5][7]=hs;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN6=fd.getReference("BattingOverall").child("Chris gayle");
        BN6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[6][0]=Mat;
                arr[6][1]=in;
                arr[6][2]=c;
                arr[6][3]=hc;
                arr[6][4]=r;
                arr[6][5]=av;
                arr[6][6]=sr;
                arr[6][7]=hs;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN7=fd.getReference("BattingOverall").child("MS Dhoni");
        BN7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[7][0]=Mat;
                arr[7][1]=in;
                arr[7][2]=c;
                arr[7][3]=hc;
                arr[7][4]=r;
                arr[7][5]=av;
                arr[7][6]=sr;
                arr[7][7]=hs;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN8=fd.getReference("BattingOverall").child("Robin Uthappa");
        BN8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[8][0]=Mat;
                arr[8][1]=in;
                arr[8][2]=c;
                arr[8][3]=hc;
                arr[8][4]=r;
                arr[8][5]=av;
                arr[8][6]=sr;
                arr[8][7]=hs;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN9=fd.getReference("BattingOverall").child("Gautam Gambhir");
        BN9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("centuries").getValue(String.class);
                String hc=dataSnapshot.child("half centuries").getValue(String.class);
                String r=dataSnapshot.child("runs").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("HS").getValue(String.class);
                arr[9][0]=Mat;
                arr[9][1]=in;
                arr[9][2]=c;
                arr[9][3]=hc;
                arr[9][4]=r;
                arr[9][5]=av;
                arr[9][6]=sr;
                arr[9][7]=hs;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });










    }
    public static void updateBattingOverall(String type,String batsmenName,int matches,int in,int cen,int hc,int runs,float avg,float strikerate,float HS){
        fd= FirebaseDatabase.getInstance();
        Matches=fd.getReference(type).child(batsmenName).child("matches");
        IN=fd.getReference(type).child(batsmenName).child("innings");
        CEN=fd.getReference(type).child(batsmenName).child("centuries");
        HC=fd.getReference(type).child(batsmenName).child("half centuries");
        Runs=fd.getReference(type).child(batsmenName).child("runs");
        Avg=fd.getReference(type).child(batsmenName).child("avg");
        Strikerate=fd.getReference(type).child(batsmenName).child("strikerate");
        Hs=fd.getReference(type).child(batsmenName).child("HS");
        Matches.setValue(matches);
        IN.setValue(in);
        HC.setValue(hc);
        CEN.setValue(cen);
        Runs.setValue(runs);
        Avg.setValue(avg);
        Strikerate.setValue(strikerate);
        Hs.setValue(HS);

    }
    public void load(){
        recycle=(RecyclerView)findViewById(R.id.stats);
        MyStatsRecycler myRecycler=new MyStatsRecycler(this,images,names,arr);
        recycle.setAdapter(myRecycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));
    }

}