package com.example.iplguru;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class statsseasonBowling extends AppCompatActivity {
    public static FirebaseDatabase fd;
    String arr[][];
    public static DatabaseReference BowlerName,BN1,BN2,BN3,BN4,BN5,BN6,BN7,BN8,BN9,Matches,Wickets,Avg,Strikerate,bbi,ECO,FWI,IN;
    RecyclerView recycle;
    String[] names;
    int images[]={R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1,R.drawable.srh1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#800080")));
        setContentView(R.layout.activity_statsseason_bowling);
        getSupportActionBar().setTitle("Purple Cap");
        /* updateBowlingSeason("BowlingSeason","bowler1"," "," "," "," "," "," "," "," ");
        updateBowlingSeason("BowlingSeason","bowler2"," "," "," "," "," "," "," "," ");
        updateBowlingSeason("BowlingSeason","bowler3"," "," "," "," "," "," "," "," ");
        updateBowlingSeason("BowlingSeason","bowler4"," "," "," "," "," "," "," "," ");
        updateBowlingSeason("BowlingSeason","bowler5"," "," "," "," "," "," "," "," ");
        updateBowlingSeason("BowlingSeason","bowler6"," "," "," "," "," "," "," "," ");
        updateBowlingSeason("BowlingSeason","bowler7"," "," "," "," "," "," "," "," ");
        updateBowlingSeason("BowlingSeason","bowler8"," "," "," "," "," "," "," "," ");
        updateBowlingSeason("BowlingSeason","bowler9"," "," "," "," "," "," "," "," ");
        updateBowlingSeason("BowlingSeason","bowler10"," "," "," "," "," "," "," "," ");*/

        fd=FirebaseDatabase.getInstance();
        arr=new String[10][8];
        names=new String[10];
        BowlerName=fd.getReference("BowlingOverall").child("bowler1");
        BowlerName.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                names[0]=name;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN1=fd.getReference("BowlingOverall").child("bowler2");
        BN1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                names[1]=name;
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN2=fd.getReference("BowlingOverall").child("bowler3");
        BN2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                names[2]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN3=fd.getReference("BowlingOverall").child("bowler4");
        BN3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                names[3]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN4=fd.getReference("BowlingOverall").child("bowler5");
        BN4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                names[4]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN5=fd.getReference("BowlingOverall").child("bowler6");
        BN5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;

                names[5]=name;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN6=fd.getReference("BowlingOverall").child("bowler7");
        BN6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                names[6]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN7=fd.getReference("BowlingOverall").child("bowler8");
        BN7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                names[7]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN8=fd.getReference("BowlingOverall").child("bowler9");
        BN8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                names[8]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN9=fd.getReference("BowlingOverall").child("bowler10");
        BN9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name=dataSnapshot.child("name").getValue(String.class);
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
                arr[0][0]=Mat;
                arr[0][1]=in;
                arr[0][2]=c;
                arr[0][3]=hc;
                arr[0][4]=r;
                arr[0][5]=av;
                arr[0][6]=sr;
                arr[0][7]=hs;
                names[9]=name;
                load();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }

    public static void updateBowlingSeason(String type,String bowlerName,String matches,String inn,String BBI,String eco,String wickets,String avg,String strikerate,String fwi){
        fd= FirebaseDatabase.getInstance();
        Matches=fd.getReference(type).child(bowlerName).child("matches");
        IN=fd.getReference(type).child(bowlerName).child("innings");
        bbi=fd.getReference(type).child(bowlerName).child("BBI");
        ECO=fd.getReference(type).child(bowlerName).child("eco");
        Wickets=fd.getReference(type).child(bowlerName).child("wickets");
        Avg=fd.getReference(type).child(bowlerName).child("avg");
        Strikerate=fd.getReference(type).child(bowlerName).child("strikerate");
        FWI=fd.getReference(type).child(bowlerName).child("fwi");
        Matches.setValue(matches);
        IN.setValue(inn);
        bbi.setValue(BBI);
        ECO.setValue(eco);
        Wickets.setValue(wickets);
        Avg.setValue(avg);
        Strikerate.setValue(strikerate);
        FWI.setValue(fwi);

    }
    public void load(){
        recycle=(RecyclerView)findViewById(R.id.sbo);
        MybowlOverallRecycler myRecycler=new MybowlOverallRecycler(this,images,names,arr);
        recycle.setAdapter(myRecycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));
    }
    }
