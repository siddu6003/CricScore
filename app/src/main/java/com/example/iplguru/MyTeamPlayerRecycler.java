package com.example.iplguru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyTeamPlayerRecycler extends RecyclerView.Adapter<MyTeamPlayerRecycler.MyViewHolder> {
    int[] img;
    String stats[][];
    Context context;
    String players[];
    int pos;
    public MyTeamPlayerRecycler(Context c, String[] names,int im[]){
        context=c;
        img=im;
        players=names;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.team_player,parent,false);
        return new MyTeamPlayerRecycler.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.i1.setImageResource(img[0]);
        holder.t1.setText(players[position]);
    }

    @Override
    public int getItemCount() {

        return players.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView t1;
        ImageView i1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            i1=itemView.findViewById(R.id.imageView7);
            t1=itemView.findViewById(R.id.textView78);

        }
    }
}
