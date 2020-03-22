package com.example.diversityrecycler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diversityrecycler.R;
import com.example.diversityrecycler.bean.SwipeCardBean;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    List<SwipeCardBean> list;
    Context context;

    public Myadapter(List<SwipeCardBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_swipe_card, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;

        Picasso.with(context).load(list.get(position).getUrl()).into( myViewHolder.iv) ;

        myViewHolder.tvName.setText(list.get(position).getName());
        myViewHolder.tvPrecent.setText(list.get(position).getPostition()+"/"+list.size());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        TextView tvName,tvPrecent;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tvName=itemView.findViewById(R.id.tvName);
            tvPrecent=itemView.findViewById(R.id.tvPrecent);
        }

    }


}
