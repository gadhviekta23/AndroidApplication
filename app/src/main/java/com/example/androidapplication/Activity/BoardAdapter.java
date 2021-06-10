package com.example.androidapplication.Activity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.androidapplication.Adapter.SearchAdapter;
import com.example.androidapplication.Model.SearchItem;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.ViewHolder>{
    ArrayList<SearchItem> searchItems;
    Context context;

    public BoardAdapter(ArrayList<SearchItem> searchItems, Context context) {
        this.searchItems = searchItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_board, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        final SearchItem searchItem = searchItems.get(holder.getAdapterPosition());
        holder.text_IB.setText(searchItem.getText());
        Glide.with(context)
                .load(searchItem.getImage())
                .into(holder.image_IB);
        holder.linearlayout_ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public int getItemCount() {
        return searchItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_IB;
        TextView text_IB;
        LinearLayout linearlayout_ib;

        public ViewHolder(View view) {
            super(view);
            image_IB = view.findViewById(R.id.image_IB);
            text_IB = view.findViewById(R.id.text_IB);
            linearlayout_ib= itemView.findViewById(R.id.linearlayout_ib);

        }
    }
}
