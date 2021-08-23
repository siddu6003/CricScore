package com.example.iplguru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TeamPlayers extends AppCompatActivity {
RecyclerView recycle;
int images[];
int images1[]={R.drawable.csk1};
    int images2[]={R.drawable.dc1};
    int images3[]={R.drawable.kkr1};
    int images4[]={R.drawable.mi1};
    int images5[]={R.drawable.pbks1};
    int images6[]={R.drawable.rcb1};
    int images7[]={R.drawable.rr1};
    int images8[]={R.drawable.srh1};
String names[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int position=getIntent().getIntExtra("position",0);
        if (position==0){
            names=getResources().getStringArray(R.array.csk);
            images=images1;
        }else if(position==1){
            names=getResources().getStringArray(R.array.dc);
            images=images2;
        }else if(position==2){
            names=getResources().getStringArray(R.array.kkr);
            images=images3;
        }
        else if(position==3){
            names=getResources().getStringArray(R.array.mi);
            images=images4;
        }
        else if(position==4){
            names=getResources().getStringArray(R.array.pbks);
            images=images5;
        }
        else if(position==5){
            names=getResources().getStringArray(R.array.rcb);
            images=images6;
        }
        else if(position==6){
            names=getResources().getStringArray(R.array.rr);
            images=images7;
        }
        else if(position==7){
            names=getResources().getStringArray(R.array.srh);
            images=images8;
        }
        setContentView(R.layout.activity_team_players);
        recycle=(RecyclerView)findViewById(R.id.teampl);
        MyTeamPlayerRecycler myRecycler=new MyTeamPlayerRecycler(this,names,images);
        recycle.setAdapter(myRecycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));
    }
}