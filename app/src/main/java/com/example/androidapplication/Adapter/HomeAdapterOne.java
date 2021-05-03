package com.example.androidapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.androidapplication.Activity.SettingActivity;
import com.example.androidapplication.Activity.ViewVideoActivity;
import com.example.androidapplication.Fragment.ForYouFragment;
import com.example.androidapplication.Model.HomeItem;
import com.example.androidapplication.Model.HomeItem_two;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class HomeAdapterOne extends RecyclerView.Adapter<HomeAdapterOne.ViewHolder> {
    Context context;
    ArrayList<HomeItem_two> homeItem1;
    private LayoutInflater inflater;

    public HomeAdapterOne(Context context, ArrayList<HomeItem_two> homeItem1) {
        this.context = context;
        this.homeItem1 = homeItem1;
        this.inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = inflater.inflate(R.layout.home_itemtwo, viewGroup, false);
        return new HomeAdapterOne.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final HomeItem_two homeItem_two = homeItem1.get(holder.getAdapterPosition());
        holder.text_HIT.setText(homeItem_two.getTitle());
        holder.text_like.setText(homeItem_two.getLine_number());

        Glide.with(context)
                .load(homeItem_two.getSetting())
                .into(holder.setting_HIT);

        Uri uri3 = Uri.parse(homeItem_two.getVideofile());
        holder.video_HIT.setVideoURI(uri3);
        holder.video_HIT.requestFocus();
        holder.video_HIT.start();


        holder.constraintLayout_HIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ViewVideoActivity.class);
                intent.putExtra("video", uri3.toString());
                context.startActivity(intent);
            }
        });

        holder.setting_HIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SettingActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return homeItem1.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView setting_HIT;
        VideoView video_HIT;
        TextView text_HIT, text_like;
        ConstraintLayout constraintLayout_HIT;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            video_HIT = itemView.findViewById(R.id.video_HIT);
            text_HIT = itemView.findViewById(R.id.text_HIT);
            text_like = itemView.findViewById(R.id.text_like);
            setting_HIT = itemView.findViewById(R.id.setting_HIT);
            constraintLayout_HIT = itemView.findViewById(R.id.constraintLayout_HIT);
        }
    }
}
