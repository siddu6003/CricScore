package com.example.iplguru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyTeamRecycler extends RecyclerView.Adapter<MyTeamRecycler.MyViewHolder> {
onTeamClickListener onteam;

    int[] img;
    String[] team;
    String[] champ;
    Context context;
    public MyTeamRecycler(Context c, int[] images,String[] s1,String[] s2,onTeamClickListener oteam){
        context=c;
        img=images;
        team=s1;
        champ=s2;
        onteam=oteam;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.teamrow,parent,false);
        return new MyViewHolder(view,onteam);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

holder.i1.setImageResource(img[position]);
holder.t1.setText(team[position]);
holder.t2.setText(champ[position]);
    }

    @Override
    public int getItemCount() {

        return team.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView i1;
        TextView t1,t2;
        onTeamClickListener onTeam;
        public MyViewHolder(@NonNull View itemView,onTeamClickListener onTeam) {
            super(itemView);
            i1=itemView.findViewById(R.id.imageView2);
            t1=itemView.findViewById(R.id.team1);
            t2=itemView.findViewById(R.id.c1);
            itemView.setOnClickListener(this);
            this.onTeam=onTeam;
        }

        @Override
        public void onClick(View view) {
onTeam.onTeamClick(this.getAdapterPosition());
        }
    }
    public interface onTeamClickListener{
       void onTeamClick(int position);
    }

}
