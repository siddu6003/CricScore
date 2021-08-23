package com.example.iplguru;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class statsseasonBatting extends AppCompatActivity {
    String arr[][];
    public static FirebaseDatabase fd;
    String names[];
    int[] images={R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1};
    public static DatabaseReference BatsmenName,BN1,BN2,BN3,BN4,BN5,BN6,BN7,BN8,BN9,Matches,Runs,Avg,Strikerate,Hs,CEN,HC,IN;
    RecyclerView recycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF5733")));
        setContentView(R.layout.activity_statsseason_batting);
        getSupportActionBar().setTitle("Orange cap");
        /*updateBattingSeason("BattingSeason","batsmen1"," "," "," "," "," "," "," "," ");
        updateBattingSeason("BattingSeason","batsmen2"," "," "," "," "," "," "," "," ");
        updateBattingSeason("BattingSeason","batsmen3"," "," "," "," "," "," "," "," ");
        updateBattingSeason("BattingSeason","batsmen4"," "," "," "," "," "," "," "," ");
        updateBattingSeason("BattingSeason","batsmen5"," "," "," "," "," "," "," "," ");
        updateBattingSeason("BattingSeason","batsmen6"," "," "," "," "," "," "," "," ");
        updateBattingSeason("BattingSeason","batsmen7"," "," "," "," "," "," "," "," ");
        updateBattingSeason("BattingSeason","batsmen8"," "," "," "," "," "," "," "," ");
        updateBattingSeason("BattingSeason","batsmen9"," "," "," "," "," "," "," "," ");
        updateBattingSeason("BattingSeason","batsmen10"," "," "," "," "," "," "," "," ");*/
        fd = FirebaseDatabase.getInstance();
        arr = new String[10][8];
        names=new String[10];
        BatsmenName = fd.getReference("BattingSeason").child("batsmen1");
        BatsmenName.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                names[0]=name;
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN1 = fd.getReference("BattingSeason").child("batsmen2");
        BN1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;
                names[1]=name;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN2 = fd.getReference("BattingSeason").child("batsmen3");
        BN2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;
                names[2]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN3 = fd.getReference("BattingSeason").child("batsmen4");
        BN3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;
                names[3]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN4 = fd.getReference("BattingSeason").child("batsmen5");
        BN4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;
                names[4]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN5 = fd.getReference("BattingSeason").child("batsmen6");
        BN5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;
                names[5]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN6 = fd.getReference("BattingSeason").child("batsmen7");
        BN6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;
                names[6]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN7 = fd.getReference("BattingSeason").child("batsmen8");
        BN7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;

                names[7]=name;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN8 = fd.getReference("BattingSeason").child("batsmen9");
        BN8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;
                names[8]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN9 = fd.getReference("BattingSeason").child("batsmen10");
        BN9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat = dataSnapshot.child("matches").getValue(String.class);
                String in = dataSnapshot.child("innings").getValue(String.class);
                String c = dataSnapshot.child("centuries").getValue(String.class);
                String hc = dataSnapshot.child("half centuries").getValue(String.class);
                String r = dataSnapshot.child("runs").getValue(String.class);
                String av = dataSnapshot.child("avg").getValue(String.class);
                String sr = dataSnapshot.child("strikerate").getValue(String.class);
                String hs = dataSnapshot.child("HS").getValue(String.class);
                arr[0][0] = Mat;
                arr[0][1] = in;
                arr[0][2] = c;
                arr[0][3] = hc;
                arr[0][4] = r;
                arr[0][5] = av;
                arr[0][6] = sr;
                arr[0][7] = hs;
                names[9]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
    public static void updateBattingSeason(String type,String batsmenName,String matches,String inn,String hc,String cen,String runs,String avg,String strikerate,String HS){
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
        IN.setValue(inn);
        HC.setValue(hc);
        CEN.setValue(cen);
        Runs.setValue(runs);
        Avg.setValue(avg);
        Strikerate.setValue(strikerate);
        Hs.setValue(HS);
    }
    public void load(){
        recycle=(RecyclerView)findViewById(R.id.sb);
        MyStatsRecycler myRecycler=new MyStatsRecycler(this,images,names,arr);
        recycle.setAdapter(myRecycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));
    }
}