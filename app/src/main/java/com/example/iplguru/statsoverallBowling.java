package com.example.iplguru;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ViewParent;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class statsoverallBowling extends AppCompatActivity {
    public static FirebaseDatabase fd;
    String arr[][];
    public static DatabaseReference BowlerName,BN1,BN2,BN3,BN4,BN5,BN6,BN7,BN8,BN9,Matches,Avg,Strikerate,IN,bbi,FWI,ECO,Wickets;
    RecyclerView recycle;
    String[] names={"Lasith Malinga","Amith Mishra","Piyush Chawla","Dwayne Bravo","Harbhajan Singh","Ravichandran Ashwin","Bhuvneshwar Kumar","Sunil Narine","Yuzvendra Chahal","Umesh Yadav"};
    int images[]={R.drawable.malinga,R.drawable.mishra,R.drawable.piyush,R.drawable.bravo,R.drawable.piyush,R.drawable.ashwin,R.drawable.bhuvi,R.drawable.narine,R.drawable.yuzi,R.drawable.umesh};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#800080")));
        setContentView(R.layout.activity_statsoverall_bowling);
        getSupportActionBar().setTitle("Bowling Overall");
       /* updateBowlingOverall("BowlingOverall","Lasith Malinga","122","122","5/13","7.14","170","19.8","16.62","1");
        updateBowlingOverall("BowlingOverall","Amith Mishra","150","150","5/17","7.34","160","24.19","19.75","1");
        updateBowlingOverall("BowlingOverall","Piyush Chawla","164","163","4/17","7.87","156","27.32","20.83","0");
        updateBowlingOverall("BowlingOverall","Dwayne Bravo","140","137","4/22","8.40","153","24.81","17.72","0");
        updateBowlingOverall("BowlingOverall","Harbhajan Singh","160","157","5/18","7.05","150","26.44","22.49","1");
        updateBowlingOverall("BowlingOverall","Ravichandran Ashwin","154","151","4/34","6.87","138","26.81","23.40","0");
        updateBowlingOverall("BowlingOverall","Bhuvneshwar Kumar","121","121","5/19","7.23","136","23.91","19.83","1");
        updateBowlingOverall("BowlingOverall","Sunil Narine","120","119","5/19","6.77","127","24.77","21.93","1");
        updateBowlingOverall("BowlingOverall","Yuzvendra Chahal","99","98","4/25","7.67","121","22.50","17.60","0");
        updateBowlingOverall("BowlingOverall","Umesh Yadav","121","120","4/24","8.51","119","30.07","21.19","0");*/
        fd=FirebaseDatabase.getInstance();
        arr=new String[10][8];
        BowlerName=fd.getReference("BowlingOverall").child("Lasith Malinga");
        BowlerName.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
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
                load();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        BN1=fd.getReference("BowlingOverall").child("Amith Mishra");
        BN1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
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
        BN2=fd.getReference("BowlingOverall").child("Piyush Chawla");
        BN2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
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
        BN3=fd.getReference("BowlingOverall").child("Dwayne Bravo");
        BN3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
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
        BN4=fd.getReference("BowlingOverall").child("Harbhajan Singh");
        BN4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
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
        BN5=fd.getReference("BowlingOverall").child(names[5]);
        BN5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
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
        BN6=fd.getReference("BowlingOverall").child(names[6]);
        BN6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
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
        BN7=fd.getReference("BowlingOverall").child(names[7]);
        BN7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
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
        BN8=fd.getReference("BowlingOverall").child(names[8]);
        BN8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
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
        BN9=fd.getReference("BowlingOverall").child(names[9]);
        BN9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String Mat=dataSnapshot.child("matches").getValue(String.class);
                String in=dataSnapshot.child("innings").getValue(String.class);
                String c=dataSnapshot.child("BBI").getValue(String.class);
                String hc=dataSnapshot.child("eco").getValue(String.class);
                String r=dataSnapshot.child("wickets").getValue(String.class);
                String av=dataSnapshot.child("avg").getValue(String.class);
                String sr=dataSnapshot.child("strikerate").getValue(String.class);
                String hs=dataSnapshot.child("fwi").getValue(String.class);
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
    public static void updateBowlingOverall(String type,String bowlerName,String matches,String inn,String BBI,String eco,String wickets,String avg,String strikerate,String fwi){
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
        recycle=(RecyclerView)findViewById(R.id.bowloverall);
        MybowlOverallRecycler myRecycler=new MybowlOverallRecycler(this,images,names,arr);
        recycle.setAdapter(myRecycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }
}