package com.example.iplguru;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PointsTable extends AppCompatActivity {
static FirebaseDatabase fd;
static private DatabaseReference Matches;
static  private DatabaseReference Won;
static  private DatabaseReference t;
static    private DatabaseReference l;
 static    private DatabaseReference p;
  static  private DatabaseReference nr;
  static private TextView t1,t2,t3,t4,t5,t6;
    static private TextView t7,t8,t9,t10,t11,t12;
    static private TextView t13,t14,t15,t16,t17,t18;
    static private TextView t19,t20,t21,t22,t23,t24;
    static private TextView t25,t26,t27,t28,t29,t30;
    static private TextView t31,t32,t33,t34,t35,t36;
    static private TextView t37,t38,t39,t40,t41,t42;
    static private TextView t43,t44,t45,t46,t47,t48;
    static private DatabaseReference teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points_table);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0c325b")));
        getSupportActionBar().setTitle("Points Table");
        t1=(TextView)findViewById(R.id.textView9);
        t2=(TextView)findViewById(R.id.textView10);
        t3=(TextView)findViewById(R.id.textView11);
        t4=(TextView)findViewById(R.id.textView12);
        t5=(TextView)findViewById(R.id.textView13);
        t6=(TextView)findViewById(R.id.textView14);
        t7=(TextView)findViewById(R.id.textView16);
        t8=(TextView)findViewById(R.id.textView17);
        t9=(TextView)findViewById(R.id.textView18);
        t10=(TextView)findViewById(R.id.textView19);
        t11=(TextView)findViewById(R.id.textView20);
        t12=(TextView)findViewById(R.id.textView21);
        t13=(TextView)findViewById(R.id.textView23);
        t14=(TextView)findViewById(R.id.textView24);
        t15=(TextView)findViewById(R.id.textView25);
        t16=(TextView)findViewById(R.id.textView26);
        t17=(TextView)findViewById(R.id.textView27);
        t18=(TextView)findViewById(R.id.textView28);
        t19=(TextView)findViewById(R.id.textView30);
        t20=(TextView)findViewById(R.id.textView31);
        t21=(TextView)findViewById(R.id.textView32);
        t22=(TextView)findViewById(R.id.textView33);
        t23=(TextView)findViewById(R.id.textView34);
        t24=(TextView)findViewById(R.id.textView35);
        t25=(TextView)findViewById(R.id.textView37);
        t26=(TextView)findViewById(R.id.textView38);
        t27=(TextView)findViewById(R.id.textView39);
        t28=(TextView)findViewById(R.id.textView40);
        t29=(TextView)findViewById(R.id.textView41);
        t30=(TextView)findViewById(R.id.textView42);
        t31=(TextView)findViewById(R.id.textView44);
        t32=(TextView)findViewById(R.id.textView45);
        t33=(TextView)findViewById(R.id.textView46);
        t34=(TextView)findViewById(R.id.textView47);
        t35=(TextView)findViewById(R.id.textView48);
        t36=(TextView)findViewById(R.id.textView49);
        t37=(TextView)findViewById(R.id.textView51);
        t38=(TextView)findViewById(R.id.textView52);
        t39=(TextView)findViewById(R.id.textView53);
        t40=(TextView)findViewById(R.id.textView54);
        t41=(TextView)findViewById(R.id.textView55);
        t42=(TextView)findViewById(R.id.textView56);
        t43=(TextView)findViewById(R.id.textView58);
        t44=(TextView)findViewById(R.id.textView59);
        t45=(TextView)findViewById(R.id.textView60);
        t46=(TextView)findViewById(R.id.textView61);
        t47=(TextView)findViewById(R.id.textView62);
        t48=(TextView)findViewById(R.id.textView63);
        //updateTeam("CSK","0","0","0","0","0","0");
        //updateTeam("DC","0","0","0","0","0","0");
        //updateTeam("KKR","0","0","0","0","0","0");
        //updateTeam("MI","0","0","0","0","0","0");
        //updateTeam("PK","0","0","0","0","0","0");
        //updateTeam("RCB","0","0","0","0","0","0");
        //updateTeam("RR","0","0","0","0","0","0");
        //updateTeam("SRH","0","0","0","0","0","0");
        getteams("CSK");
        getteams("DC");
        getteams("KKR");
        getteams("MI");
        getteams("PK");
        getteams("RCB");
        getteams("RR");
        getteams("SRH");

    }
    public static void updateTeam(String team,String matches,String won,String tie,String lost,String points,String nrr){
        fd=FirebaseDatabase.getInstance();
        Matches=fd.getReference(team).child(String.valueOf("matches"));
        Won=fd.getReference(team).child(String.valueOf("won"));
        t=fd.getReference(team).child(String.valueOf("tie"));
        l=fd.getReference(team).child(String.valueOf("lost"));
        p=fd.getReference(team).child(String.valueOf("points"));
        nr=fd.getReference(team).child(String.valueOf("nrr"));
        Matches.setValue(matches);
        Won.setValue(won);
        t.setValue(tie);
        l.setValue(lost);
        p.setValue(points);
        nr.setValue(nrr);

    }
    public static void getteams(final String name) {
        teams=FirebaseDatabase.getInstance().getReference();
        if (name == "CSK") {

            teams.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String matches=dataSnapshot.child(name).child("matches").getValue(String.class);
                        String won=dataSnapshot.child(name).child("won").getValue(String.class);
                    String tie=dataSnapshot.child(name).child("tie").getValue(String.class);
                    String lost=dataSnapshot.child(name).child("lost").getValue(String.class);
                    String points=dataSnapshot.child(name).child("points").getValue(String.class);
                    String nrr=dataSnapshot.child(name).child("nrr").getValue(String.class);
                    t1.setText(matches);
                    t2.setText(won);
                    t3.setText(tie);
                    t4.setText(lost);
                    t5.setText(points);
                    t6.setText(nrr);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }else if(name=="DC"){
            teams.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String matches=dataSnapshot.child(name).child("matches").getValue(String.class);
                    String won=dataSnapshot.child(name).child("won").getValue(String.class);
                    String tie=dataSnapshot.child(name).child("tie").getValue(String.class);
                    String lost=dataSnapshot.child(name).child("lost").getValue(String.class);
                    String points=dataSnapshot.child(name).child("points").getValue(String.class);
                    String nrr=dataSnapshot.child(name).child("nrr").getValue(String.class);
                    t7.setText(matches);
                    t8.setText(won);
                    t9.setText(tie);
                    t10.setText(lost);
                    t11.setText(points);
                    t12.setText(nrr);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

        }else if(name=="KKR"){
            teams.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String matches=dataSnapshot.child(name).child("matches").getValue(String.class);
                    String won=dataSnapshot.child(name).child("won").getValue(String.class);
                    String tie=dataSnapshot.child(name).child("tie").getValue(String.class);
                    String lost=dataSnapshot.child(name).child("lost").getValue(String.class);
                    String points=dataSnapshot.child(name).child("points").getValue(String.class);
                    String nrr=dataSnapshot.child(name).child("nrr").getValue(String.class);
                    t13.setText(matches);
                    t14.setText(won);
                    t15.setText(tie);
                    t16.setText(lost);
                    t17.setText(points);
                    t18.setText(nrr);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

        }else if(name=="MI"){
            teams.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String matches=dataSnapshot.child(name).child("matches").getValue(String.class);
                    String won=dataSnapshot.child(name).child("won").getValue(String.class);
                    String tie=dataSnapshot.child(name).child("tie").getValue(String.class);
                    String lost=dataSnapshot.child(name).child("lost").getValue(String.class);
                    String points=dataSnapshot.child(name).child("points").getValue(String.class);
                    String nrr=dataSnapshot.child(name).child("nrr").getValue(String.class);
                    t19.setText(matches);
                    t20.setText(won);
                    t21.setText(tie);
                    t22.setText(lost);
                    t23.setText(points);
                    t24.setText(nrr);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }else if(name=="PK"){
            teams.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String matches=dataSnapshot.child(name).child("matches").getValue(String.class);
                    String won=dataSnapshot.child(name).child("won").getValue(String.class);
                    String tie=dataSnapshot.child(name).child("tie").getValue(String.class);
                    String lost=dataSnapshot.child(name).child("lost").getValue(String.class);
                    String points=dataSnapshot.child(name).child("points").getValue(String.class);
                    String nrr=dataSnapshot.child(name).child("nrr").getValue(String.class);
                    t25.setText(matches);
                    t26.setText(won);
                    t27.setText(tie);
                    t28.setText(lost);
                    t29.setText(points);
                    t30.setText(nrr);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }else if(name=="RCB"){
            teams.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String matches=dataSnapshot.child(name).child("matches").getValue(String.class);
                    String won=dataSnapshot.child(name).child("won").getValue(String.class);
                    String tie=dataSnapshot.child(name).child("tie").getValue(String.class);
                    String lost=dataSnapshot.child(name).child("lost").getValue(String.class);
                    String points=dataSnapshot.child(name).child("points").getValue(String.class);
                    String nrr=dataSnapshot.child(name).child("nrr").getValue(String.class);
                    t31.setText(matches);
                    t32.setText(won);
                    t33.setText(tie);
                    t34.setText(lost);
                    t35.setText(points);
                    t36.setText(nrr);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }else if(name=="RR"){
            teams.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String matches=dataSnapshot.child(name).child("matches").getValue(String.class);
                    String won=dataSnapshot.child(name).child("won").getValue(String.class);
                    String tie=dataSnapshot.child(name).child("tie").getValue(String.class);
                    String lost=dataSnapshot.child(name).child("lost").getValue(String.class);
                    String points=dataSnapshot.child(name).child("points").getValue(String.class);
                    String nrr=dataSnapshot.child(name).child("nrr").getValue(String.class);
                    t37.setText(matches);
                    t38.setText(won);
                    t39.setText(tie);
                    t40.setText(lost);
                    t41.setText(points);
                    t42.setText(nrr);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }else if(name=="SRH"){
            teams.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    String matches=dataSnapshot.child(name).child("matches").getValue(String.class);
                    String won=dataSnapshot.child(name).child("won").getValue(String.class);
                    String tie=dataSnapshot.child(name).child("tie").getValue(String.class);
                    String lost=dataSnapshot.child(name).child("lost").getValue(String.class);
                    String points=dataSnapshot.child(name).child("points").getValue(String.class);
                    String nrr=dataSnapshot.child(name).child("nrr").getValue(String.class);
                    t43.setText(matches);
                    t44.setText(won);
                    t45.setText(tie);
                    t46.setText(lost);
                    t47.setText(points);
                    t48.setText(nrr);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
    }


}
