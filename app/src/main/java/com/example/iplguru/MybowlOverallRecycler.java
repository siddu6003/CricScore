package com.example.iplguru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MybowlOverallRecycler extends RecyclerView.Adapter<MybowlOverallRecycler.MyViewHolder> {
    int[] img;
    String stats[][];
    Context context;
    String players[];
    public MybowlOverallRecycler(Context c, int[] images,String[] names,String[][] details){
        context=c;
        img=images;
        players=names;
        stats=details;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.bowler_row,parent,false);
        return new MybowlOverallRecycler.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.i1.setImageResource(img[position]);
        holder.t1.setText(players[position]);
        holder.t2.setText(stats[position][0]);
        holder.t3.setText(stats[position][1]);
        holder.t4.setText(stats[position][2]);
        holder.t5.setText(stats[position][3]);
        holder.t6.setText(stats[position][4]);
        holder.t7.setText(stats[position][5]);
        holder.t8.setText(stats[position][6]);
        holder.t9.setText(stats[position][7]);


    }

    @Override
    public int getItemCount() {

        return img.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView i1;
        TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            i1=itemView.findViewById(R.id.imageView6);
            t1=itemView.findViewById(R.id.textView64);
            t2=itemView.findViewById(R.id.textView75);
            t3=itemView.findViewById(R.id.textView76);
            t4=itemView.findViewById(R.id.textView77);
            t5=itemView.findViewById(R.id.textView79);
            t6=itemView.findViewById(R.id.textView80);
            t7=itemView.findViewById(R.id.textView81);
            t8=itemView.findViewById(R.id.textView82);
            t9=itemView.findViewById(R.id.textView83);



        }
    }

}
