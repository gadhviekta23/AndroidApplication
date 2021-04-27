package com.example.androidapplication.Adapter;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidapplication.Activity.HomePageActivity;
import com.example.androidapplication.Fragment.ForYouFragment;
import com.example.androidapplication.Fragment.LatestFragment;
import com.example.androidapplication.Model.HomeItem;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    Context context;
    private LayoutInflater inflater;
    ArrayList<HomeItem> homeItems;
    HomePageActivity homePageActivity;
    int row_index = -1;


    public HomeAdapter(ArrayList<HomeItem> homeItems, Context context, HomePageActivity homePageActivity) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.homeItems = homeItems;
        this.homePageActivity = homePageActivity;
    }



    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.home_itemone,viewGroup,false);
        return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        final HomeItem homeItem = homeItems.get(holder.getAdapterPosition());
        holder.h_text.setText(homeItem.getName());
        holder.h_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homePageActivity.recyclerview_homeone.getLayoutManager().scrollToPosition(holder.getAdapterPosition());

                if (holder.getAdapterPosition()==0){
                    homePageActivity.loadFragment(new ForYouFragment());

                }
                else if (holder.getAdapterPosition()==1){
                    homePageActivity.loadFragment(new LatestFragment());

                }
                row_index = position;
                notifyDataSetChanged();
            }
        });

        if(row_index==position){
            holder.h_text.setBackgroundResource(R.drawable.gradent_selectitem);
            holder.h_text.setTextColor(Color.WHITE);
        }else{
            holder.h_text.setBackgroundResource(R.drawable.gradent_unselectitem);
            holder.h_text.setTextColor(Color.BLACK);
        }
    }


    @Override
    public int getItemCount() {
        return homeItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView h_text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            h_text =itemView.findViewById(R.id.h_text);
        }
    }
}
