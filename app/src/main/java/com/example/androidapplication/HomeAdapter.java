package com.example.androidapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    Context context;
    private LayoutInflater inflater;
    ArrayList<HomeItem> homeItems;

    public HomeAdapter(Context context, ArrayList<HomeItem> homeItems) {

        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.homeItems = homeItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.home_itemone,viewGroup,false);
        return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        final HomeItem homeItem = homeItems.get(holder.getAdapterPosition());
        holder.h_text.setText(homeItem.getName());
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
