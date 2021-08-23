package com.example.iplguru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Schedule extends AppCompatActivity {
    RecyclerView recycle;
    String s1[],s2[],s3[],s4[];
    int images[] = {R.drawable.csk, R.drawable.dc, R.drawable.kkr, R.drawable.mi, R.drawable.pbks, R.drawable.rcb, R.drawable.rr, R.drawable.srh,R.drawable.tbd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0c325b")));
        getSupportActionBar().setTitle("Schedule");
         s1=getResources().getStringArray(R.array.home);
        s2=getResources().getStringArray(R.array.away);
        s3=getResources().getStringArray(R.array.match);
        s4=getResources().getStringArray(R.array.date);
        recycle = (RecyclerView) findViewById(R.id.schedule);
        // set up the RecyclerView
         MyRecycler myRecycler=new MyRecycler(this,images,s1,s2,s3,s4);
        recycle.setAdapter(myRecycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));



    }

}
