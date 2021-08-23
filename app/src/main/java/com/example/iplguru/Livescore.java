package com.example.iplguru;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Livescore extends AppCompatActivity {
FirebaseDatabase fd;
String arr[],arr2[];
String arr3[];
TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25;
DatabaseReference d1,d2,d3,d4,d5;
DatabaseReference n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11;
DatabaseReference n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livescore);
        fd=FirebaseDatabase.getInstance();
        arr=new String[11];
        arr2=new String[11];
        arr3=new String[3];
        d1=fd.getReference("squad1");
        d2=fd.getReference("squad2");
        d3=fd.getReference("team1");
        d4=fd.getReference("team2");
        d5=fd.getReference("highlight");
        t1=(TextView)findViewById(R.id.textView99);
        t2=(TextView)findViewById(R.id.textView100);
        t3=(TextView)findViewById(R.id.textView101);
        t4=(TextView)findViewById(R.id.textView102);
        t5=(TextView)findViewById(R.id.textView103);
        t6=(TextView)findViewById(R.id.textView104);
        t7=(TextView)findViewById(R.id.textView105);
        t8=(TextView)findViewById(R.id.textView106);
        t9=(TextView)findViewById(R.id.textView107);
        t10=(TextView)findViewById(R.id.textView108);
        t11=(TextView)findViewById(R.id.textView120);
        t12=(TextView)findViewById(R.id.textView109);
        t13=(TextView)findViewById(R.id.textView110);
        t14=(TextView)findViewById(R.id.textView111);
        t15=(TextView)findViewById(R.id.textView112);
        t16=(TextView)findViewById(R.id.textView113);
        t17=(TextView)findViewById(R.id.textView114);
        t18=(TextView)findViewById(R.id.textView115);
        t19=(TextView)findViewById(R.id.textView116);
        t20=(TextView)findViewById(R.id.textView117);
        t21=(TextView)findViewById(R.id.textView118);
        t22=(TextView)findViewById(R.id.textView119);
        t23=(TextView)findViewById(R.id.textView95);
        t24=(TextView)findViewById(R.id.textView96);
        t25=(TextView)findViewById(R.id.textView98);
        n1=d1.child("name1");
        n1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[0]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n2=d1.child("name2");
        n2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[1]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n3=d1.child("name3");
        n3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[2]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n4=d1.child("name4");
        n4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[3]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n5=d1.child("name5");
        n5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[4]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n6=d1.child("name6");
        n6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[5]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n7=d1.child("name7");
        n7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[6]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n8=d1.child("name8");
        n8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[7]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n9=d1.child("name9");
        n9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[8]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n10=d1.child("name10");
        n10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[9]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n11=d1.child("name11");
        n11.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr[10]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n12=d2.child("name1");
        n12.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[0]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n13=d2.child("name2");
        n13.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[1]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n14=d2.child("name3");
        n14.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[2]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n15=d2.child("name4");
        n15.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[3]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n16=d2.child("name5");
        n16.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[4]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n17=d2.child("name6");
        n17.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[5]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n18=d2.child("name7");
        n18.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[6]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n19=d2.child("name8");
        n19.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[7]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n20=d2.child("name9");
        n20.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[8]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n21=d2.child("name10");
        n21.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[9]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n22=d2.child("name11");
        n22.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String val=snapshot.getValue(String.class);
                arr2[10]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n23=d3.child("name");
        n23.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String s=snapshot.getValue(String.class);
                arr3[0]=s;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n24=d4.child("name");
        n24.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String s=snapshot.getValue(String.class);
                arr3[1]=s;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        n25=d5.child("name");
        n25.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String s=snapshot.getValue(String.class);
                arr3[2]=s;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        load();

    }
    public void load(){
        String i=getIntent().getStringExtra("team1");
        String i2=getIntent().getStringExtra("team2");

        t1.setText(arr[0]);
        t2.setText(arr[1]);
        t3.setText(arr[2]);
        t4.setText(arr[3]);
        t5.setText(arr[4]);
        t6.setText(arr[5]);
        t7.setText(arr[6]);
        t8.setText(arr[7]);
        t9.setText(arr[8]);
        t10.setText(arr[9]);
        t11.setText(arr[10]);
        t12.setText(arr2[0]);
        t13.setText(arr2[1]);
        t14.setText(arr2[2]);
        t15.setText(arr2[3]);
        t16.setText(arr2[4]);
        t17.setText(arr2[5]);
        t18.setText(arr2[6]);
        t19.setText(arr2[7]);
        t20.setText(arr2[8]);
        t21.setText(arr2[9]);
        t22.setText(arr2[10]);
        t23.setText(arr3[0]);
        t24.setText(arr3[1]);
        t25.setText(arr3[2]);

    }
}