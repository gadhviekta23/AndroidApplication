package com.example.androidapplication.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidapplication.Model.Boardview;
import com.example.androidapplication.Model.StoryItem;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class ViewBoardAdapter extends RecyclerView.Adapter<ViewBoardAdapter.ViewHolder>{
    Activity activity;
    ArrayList<Boardview> boardviews;


    public ViewBoardAdapter(Activity activity, ArrayList<Boardview> boardview) {
        this.activity=activity;
        this.boardviews=boardview;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.board_view_one, parent, false);
        return new ViewBoardAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Boardview boardview = boardviews.get(holder.getAdapterPosition());

        holder.image_VBA.setImageResource(boardview.getImage());

    }


    @Override
    public int getItemCount() {
        return boardviews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_VBA;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_VBA = itemView.findViewById(R.id.image_VBA);
        }
    }
}
