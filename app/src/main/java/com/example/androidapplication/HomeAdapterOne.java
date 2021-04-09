package com.example.androidapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapterOne extends RecyclerView.Adapter<HomeAdapterOne.ViewHolder> {
    Context context;
    ArrayList<HomeItem_two> homeItem1;
    private LayoutInflater inflater;

    public HomeAdapterOne(Context context, ArrayList<HomeItem_two> homeItem1) {
        this.context=context;
        this.homeItem1=homeItem1;
        this.inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.home_itemone,parent,false);
        return new ViewHolder(view);
            }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final HomeItem_two homeItem_two= homeItem1.get(holder.getAdapterPosition());
        
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        VideoView video_HIT;
        TextView text_HIT,text_like;
        ImageView setting_HIT,heart_img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            video_HIT=itemView.findViewById(R.id.video_HIT);
            text_HIT = itemView.findViewById(R.id.text_HIT);
            text_like = itemView.findViewById(R.id.text_like);
            setting_HIT= itemView.findViewById(R.id.setting_HIT);
            heart_img = itemView.findViewById(R.id.heart_img);
        }
    }
}
