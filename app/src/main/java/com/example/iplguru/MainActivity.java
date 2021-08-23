package com.example.iplguru;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private String url="https://cricapi.com/api/cricketScore/?apikey=pgdBHajKz6csPcvjlLEXkNIfIfT2&unique_id=";
    String id;
    DatabaseReference fd,cd;
    CardView cardView,cardView2;
Button b1,b2,b3,b4;
FloatingActionButton fb1,fb2,fb3;
TextView t1,t2,t3,t4,t5;
String arr[];
ImageView i1,i2;
private StorageReference mStorageRef;
    int images[] = {R.drawable.csk, R.drawable.dc, R.drawable.kkr, R.drawable.mi, R.drawable.pbks, R.drawable.rcb, R.drawable.rr, R.drawable.srh};
boolean isallvisible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0c325b")));
        getSupportActionBar().setLogo(R.drawable.logo);
        setContentView(R.layout.activity_main);
        arr=new String[1];
        fd=FirebaseDatabase.getInstance().getReference("apiid");
        fd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                 id=snapshot.getValue(String.class);
                 Intent i=new Intent(getApplicationContext(),Livescore.class);
                 i.putExtra("matchid",id);
                url=url+id;
                loaddata();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        t5=(TextView)findViewById(R.id.textView91);
        cd=FirebaseDatabase.getInstance().getReference("Just Now");
        cd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String s=snapshot.child("content").getValue(String.class);
               arr[0]=s;
               loaddata();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        cardView2=(CardView)findViewById(R.id.cd2);
        cardView=(CardView)findViewById(R.id.cd);
        i1=(ImageView)findViewById(R.id.imageView3);
        i2=(ImageView)findViewById(R.id.imageView8);
        t4=(TextView)findViewById(R.id.textView87);
        b1=(Button)findViewById(R.id.news);
        b2=(Button)findViewById(R.id.sch);
        b3=(Button)findViewById(R.id.pt);
        b4=(Button)findViewById(R.id.t);
        fb1=(FloatingActionButton)findViewById(R.id.fab1);
        fb2=(FloatingActionButton)findViewById(R.id.fab2);
        t1=(TextView)findViewById(R.id.add_text1);
        fb2.setVisibility(View.GONE);
        t1.setVisibility(View.INVISIBLE);
        isallvisible=false;

        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isallvisible){
                    fb2.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    isallvisible=true;
                }else{
                    fb2.setVisibility(View.GONE);
                    t1.setVisibility(View.INVISIBLE);
                    isallvisible=false;
                }
            }
        });
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent getintent=new Intent(getApplicationContext(),select.class);
               startActivity(getintent);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),News.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(getApplicationContext(),Schedule.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(getApplicationContext(),PointsTable.class);
                        startActivity(i3);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(getApplicationContext(),Teams.class);
                startActivity(i4);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Livescore.class);
                startActivity(i);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Completed.class);
                startActivity(i);
            }
        });
        /*mStorageRef= FirebaseStorage.getInstance().getReference().child("news/news.JPG");
        try {
            final File localfile=File.createTempFile("news","PNG");
            mStorageRef.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap= BitmapFactory.decodeFile(localfile.getAbsolutePath());
                    ImageView imageView=(ImageView)findViewById(R.id.imageView13);
                    imageView.setImageBitmap(bitmap);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }*/



    }
    private void loaddata(){
        t5.setText(arr[0]);
final Intent i=new Intent(getApplicationContext(),Livescore.class);
        StringRequest stringRequest=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            JSONObject jsonObject;
            public void onResponse(String response) {
            try {
                jsonObject=new JSONObject(response);
                String team1=jsonObject.getString("team-1");
                String team2=jsonObject.getString("team-2");
                String matchstatus=jsonObject.getString("matchStarted");
                if(team1.charAt(0)=='C'){
                    i1.setImageResource(images[0]);

                }else if(team1.charAt(0)=='D'){
                    i1.setImageResource(images[1]);

                }else if(team1.charAt(0)=='K'){
                    i1.setImageResource(images[2]);

                }else if(team1.charAt(0)=='M'){
                    i1.setImageResource(images[3]);

                }else if(team1.charAt(0)=='P'){
                    i1.setImageResource(images[4]);

                }else if(team1.charAt(0)=='R' && team1.charAt(1)=='o'){
                    i1.setImageResource(images[5]);

                }else if(team1.charAt(0)=='R'){
                    i1.setImageResource(images[6]);

                }else if(team1.charAt(0)=='S'){
                    i1.setImageResource(images[7]);

                }

                if(team2.charAt(0)=='C'){
                    i2.setImageResource(images[0]);

                }else if(team2.charAt(0)=='D'){
                    i2.setImageResource(images[1]);

                }else if(team2.charAt(0)=='K'){
                    i2.setImageResource(images[2]);

                }else if(team2.charAt(0)=='M'){
                    i2.setImageResource(images[3]);

                }else if(team2.charAt(0)=='P'){
                    i2.setImageResource(images[4]);

                }else if(team2.charAt(0)=='R' && team2.charAt(1)=='o'){
                    i2.setImageResource(images[5]);

                }else if(team2.charAt(0)=='R'){
                    i2.setImageResource(images[6]);

                }else if(team2.charAt(0)=='S'){
                    i2.setImageResource(images[7]);

                }
   t2.setText(team1);
   t3.setText(team2);
                }catch (Exception e){

                }
            try {
                String score=jsonObject.getString("score");
                t4.setText(score);
            }catch (Exception e){

            }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}