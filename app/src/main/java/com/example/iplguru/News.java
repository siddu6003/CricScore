package com.example.iplguru;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class News extends AppCompatActivity implements MyNewsRecycler.onNewsClickListener{
    String arr[];
   Bitmap arr2[];
   int images[];
    ImageView i1;
    StorageReference mStorageRef,ms2,ms3,ms4,ms5;
    RecyclerView recycle;
    FirebaseDatabase fd;
    DatabaseReference d,d2,d3,d4,d5,d6,d7,d8,d9,d10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0c325b")));
        setContentView(R.layout.activity_news);
        getSupportActionBar().setTitle("News");
        fd=FirebaseDatabase.getInstance();
        d=fd.getReference("Article1").child("heading1");
        d2=fd.getReference("Article2").child("heading2");
        d3=fd.getReference("Article3").child("heading3");
        d4=fd.getReference("Article4").child("heading4");
        d5=fd.getReference("Article5").child("heading5");
        d7=fd.getReference("Article7").child("heading7");
        d6=fd.getReference("Article6").child("heading6");


        arr2=new Bitmap[5];
        images=new int[5];
/*mStorageRef= FirebaseStorage.getInstance().getReferenceFromUrl("gs://ipl-guru-78b04.appspot.com/").child("iyer.PNG");
        try {
            final File localFile= File.createTempFile("iyer","PNG");
            mStorageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap= BitmapFactory.decodeFile(localFile.getAbsolutePath());
                    arr2[0]=bitmap;

                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        ms2= FirebaseStorage.getInstance().getReferenceFromUrl("gs://ipl-guru-78b04.appspot.com/").child("pandya.PNG");
        try {
            final File localFile= File.createTempFile("pandyabros","PNG");
            mStorageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap= BitmapFactory.decodeFile(localFile.getAbsolutePath());
                    arr2[1]=bitmap;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        ms3= FirebaseStorage.getInstance().getReferenceFromUrl("gs://ipl-guru-78b04.appspot.com/").child("ponting.PNG");
        try {
            final File localFile= File.createTempFile("ponting","PNG");
            mStorageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap= BitmapFactory.decodeFile(localFile.getAbsolutePath());
                    arr2[2]=bitmap;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        ms4= FirebaseStorage.getInstance().getReferenceFromUrl("gs://ipl-guru-78b04.appspot.com/").child("shakib.PNG");
        try {
            final File localFile= File.createTempFile("shakib","PNG");
            mStorageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap= BitmapFactory.decodeFile(localFile.getAbsolutePath());
                    arr2[3]=bitmap;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        ms5= FirebaseStorage.getInstance().getReferenceFromUrl("gs://ipl-guru-78b04.appspot.com/").child("virat.PNG");
        try {
            final File localFile= File.createTempFile("virat","PNG");
            mStorageRef.getFile(localFile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap= BitmapFactory.decodeFile(localFile.getAbsolutePath());
                    arr2[4]=bitmap;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        arr=new String[5];

       d6.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               String val=dataSnapshot.getValue(String.class);
               arr[0]=val;
               load();
           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
        d7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val=dataSnapshot.getValue(String.class);
                arr[1]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val=dataSnapshot.getValue(String.class);
                arr[2]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val=dataSnapshot.getValue(String.class);
                arr[3]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String val=dataSnapshot.getValue(String.class);
                arr[4]=val;
                load();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });





    }
    public void onTeamClick(int position) {
        Intent i=new Intent(getApplicationContext(),Article.class);
        i.putExtra("position",position);
        startActivity(i);
    }
    public void load(){
        recycle=(RecyclerView)findViewById(R.id.newsr);
        MyNewsRecycler myRecycler=new MyNewsRecycler(this,arr,this);
        recycle.setAdapter(myRecycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.setNestedScrollingEnabled(false);

    }


}