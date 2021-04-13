package com.example.androidapplication.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidapplication.Model.HomeItem_two;

import java.util.ArrayList;

public class HomeAdapterOne extends RecyclerView.Adapter<HomeAdapterOne.ViewHolder> {
    Context context;
    ArrayList<HomeItem_two> homeItem1;
    public HomeAdapterOne(Context context, ArrayList<HomeItem_two> homeItem1) {
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
