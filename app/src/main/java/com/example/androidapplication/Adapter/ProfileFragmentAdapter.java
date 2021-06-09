package com.example.androidapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.androidapplication.Activity.OpenVideoActivity;
import com.example.androidapplication.Model.StoryItem;
import com.example.androidapplication.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileFragmentAdapter extends RecyclerView.Adapter<ProfileFragmentAdapter.ViewHolder> {
    Context context;
    ArrayList<StoryItem> storyItems;

    public ProfileFragmentAdapter(Context context, ArrayList<StoryItem> storyItems) {
        this.context = context;
        this.storyItems = storyItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fragment_profile, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        final StoryItem storyItem = storyItems.get(holder.getAdapterPosition());

        Glide.with(context)
                .load(storyItem.getImage())
                .into(holder.image_IFP);

        Glide.with(context)
                .load(storyItem.getImage_one())
                .into(holder.image_ome_IFP);

        Glide.with(context)
                .load(storyItem.getImage_two())
                .into(holder.image_two_IFP);

        holder.image_IFP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, OpenVideoActivity.class);
                context.startActivity(intent);
            }
        });
        holder.text_IFP.setText(storyItem.getText());
    }

    @Override
    public int getItemCount() {
        return storyItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_IFP, image_ome_IFP, image_two_IFP;
        TextView text_IFP;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_IFP = itemView.findViewById(R.id.image_IFP);
            image_ome_IFP = itemView.findViewById(R.id.image_ome_IFP);
            text_IFP = itemView.findViewById(R.id.text_IFP);
            image_two_IFP = itemView.findViewById(R.id.image_two_IFP);
        }
    }
}
