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

public class MyRecycler extends RecyclerView.Adapter<MyRecycler.MyViewHolder> {


    int[] img;
    String[] hteam;
    String[] ateam;
    String[] venue;
    String[] no;
    Context context;
    ArrayList<String> x=new ArrayList<>();
   ArrayList<List> l=new ArrayList<>();
    public MyRecycler(Context c, int[] images,String[] s1,String[] s2,String m[],String d[]){
context=c;
img=images;
hteam=s1;
ateam=s2;
venue=d;
no=m;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.recycler_row,parent,false);
        return new MyViewHolder(view);
    }


    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.t3.setText(venue[position]);
        holder.t4.setText(no[position]);
        if(hteam[position].equals(new String("CSK"))){
            holder.i1.setImageResource(img[0]);

        }else if (hteam[position].equals("DC")){
            holder.i1.setImageResource(img[1]);

        }else if (hteam[position].equals("KKR")){
            holder.i1.setImageResource(img[2]);

        }
        else if (hteam[position].equals("MI")){
            holder.i1.setImageResource(img[3]);

        }
        else if (hteam[position].equals("PBKS")){
            holder.i1.setImageResource(img[4]);

        }
        else if (hteam[position].equals("RCB")){
            holder.i1.setImageResource(img[5]);

        }
        else if (hteam[position].equals("RR")){
            holder.i1.setImageResource(img[6]);

        }
        else if (hteam[position].equals("SRH")){
            holder.i1.setImageResource(img[7]);

        }else{
            holder.i1.setImageResource(img[8]);
        }

        if(ateam[position].equals("CSK")){
            holder.i2.setImageResource(img[0]);

        }else if (ateam[position].equals("DC")){
            holder.i2.setImageResource(img[1]);

        }else if (ateam[position].equals("KKR")){
            holder.i2.setImageResource(img[2]);

        }
        else if (ateam[position].equals("MI")){
            holder.i2.setImageResource(img[3]);

        }
        else if (ateam[position].equals("PBKS")){
            holder.i2.setImageResource(img[4]);

        }
        else if (ateam[position].equals("RCB")){
            holder.i2.setImageResource(img[5]);

        }
        else if (ateam[position].equals("RR")){
            holder.i2.setImageResource(img[6]);

        }
        else if (ateam[position].equals("SRH")){
            holder.i2.setImageResource(img[7]);

        }else{
            holder.i2.setImageResource(img[8]);
        }
       }

    @Override
    public int getItemCount() {
        return hteam.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView i1,i2;
        TextView t1,t2,t3,t4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            i1=itemView.findViewById(R.id.imageView4);
            i2=itemView.findViewById(R.id.imageView5);
            t3=itemView.findViewById(R.id.textView68);
            t4=itemView.findViewById(R.id.textView67);
        }
    }

}
