package com.example.iplguru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Teams extends AppCompatActivity implements MyTeamRecycler.onTeamClickListener{
int[] images={R.drawable.csk, R.drawable.dc, R.drawable.kkr, R.drawable.mi, R.drawable.pbks, R.drawable.rcb, R.drawable.rr, R.drawable.srh};
String[] names;
String[] champs;
RecyclerView recycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0c325b")));
        setContentView(R.layout.activity_teams);
        names=getResources().getStringArray(R.array.teams);
        champs=getResources().getStringArray(R.array.champs);
        recycle=(RecyclerView)findViewById(R.id.team);
        MyTeamRecycler myRecycler=new MyTeamRecycler(this,images,names,champs,this);
        recycle.setAdapter(myRecycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onTeamClick(int position) {
        Intent i=new Intent(getApplicationContext(),TeamPlayers.class);
        i.putExtra("position",position);
        startActivity(i);
    }
}