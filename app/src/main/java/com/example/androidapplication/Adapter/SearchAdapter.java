package com.example.androidapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidapplication.Model.SearchItem;
import com.example.androidapplication.R;

import java.util.ArrayList;


public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {

    private ArrayList<SearchItem> myListList;
    private Context ct;

    public SearchAdapter(ArrayList<SearchItem> myListList, Context ct) {
        this.myListList = myListList;
        this.ct = ct;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final SearchItem searchItem = myListList.get(holder.getAdapterPosition());
        holder.imageView.setImageResource(searchItem.getImage());
        holder.textview_si.setText(searchItem.getText());

    }

    @Override
    public int getItemCount() {
        return myListList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textview_si;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.myimage);
            textview_si=(TextView)itemView.findViewById(R.id.textview_si);

        }
    }

}
