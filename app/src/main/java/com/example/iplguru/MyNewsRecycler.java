package com.example.iplguru;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ImageReader;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class MyNewsRecycler extends RecyclerView.Adapter<MyNewsRecycler.MyViewHolder> {
   int i;
   Bitmap b;
onNewsClickListener ont;
    Bitmap img[];
    String stats[][];
    Context context;
    String players[];
    int pos;
    public MyNewsRecycler(Context c, String[] names,  onNewsClickListener on){
        context=c;
        players=names;
        ont=on;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.news_row,parent,false);
        return new MyNewsRecycler.MyViewHolder(view,ont);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        if (position == 0) {
            holder.t1.setText("Daily Analysis");
        } else if (position == 1) {
            holder.t1.setText("Match Report");
        } else {
            holder.t1.setText(players[position]);
        }
    }
    @Override
    public int getItemCount() {

        return players.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView t1;
        ImageView i1;
        onNewsClickListener onnews;
        public MyViewHolder(@NonNull View itemView, MyNewsRecycler.onNewsClickListener onTeam) {
            super(itemView);
            i1=itemView.findViewById(R.id.imageView);
            t1=itemView.findViewById(R.id.textView85);
            itemView.setOnClickListener(this);
            this.onnews=onTeam;

        }

        @Override
        public void onClick(View view) {
            onnews.onTeamClick(this.getAdapterPosition());
        }
    }
    public interface onNewsClickListener{
        void onTeamClick(int position);
    }
}
