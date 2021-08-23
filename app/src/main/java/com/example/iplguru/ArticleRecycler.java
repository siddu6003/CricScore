package com.example.iplguru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleRecycler extends RecyclerView.Adapter<ArticleRecycler.MyViewHolder> {
    MyTeamRecycler.onTeamClickListener onteam;


    String[] champ;
    Context context;
    int p;

    public ArticleRecycler(Context c, String[] s1,int x) {
        context = c;
        champ = s1;
        p=x;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.article_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

if (p==0){
    holder.t2.setText(champ[p]);
}else if(p==1){
    holder.t2.setText(champ[p]);
}
else if(p==2){
    holder.t2.setText(champ[p]);
}
else if(p==3){
    holder.t2.setText(champ[p]);
}
else if(p==4){
    holder.t2.setText(champ[p]);
}
else if(p==5){
    holder.t2.setText(champ[p]);
}
else if(p==6){
    holder.t2.setText(champ[p]);
}
else if(p==7){
    holder.t2.setText(champ[p]);
}
else if(p==8){
    holder.t2.setText(champ[p]);
}else if(p==9){
    holder.t2.setText(champ[p]);
}else{
    holder.t2.setText("No data Available");
}

    }

    @Override
    public int getItemCount() {

        return 1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {

        TextView  t2;
        MyTeamRecycler.onTeamClickListener onTeam;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            t2 = itemView.findViewById(R.id.textView89);
        }


    }
}
