package com.example.androidapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidapplication.Adapter.ProfileFragmentAdapter;
import com.example.androidapplication.Model.StoryItem;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    RecyclerView recyclerview_FP;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //findViewById
        recyclerview_FP = findViewById(R.id.recyclerview_FP);
        btn_back = findViewById(R.id.btn_back);

        //setOnClickListener
        btn_back.setOnClickListener(this);

        //Methods
        storyinit();

    }

    private void storyinit() {
        ArrayList<StoryItem> storyItems = new ArrayList<>();
        storyItems.add(new StoryItem(R.drawable.artgallery,R.drawable.artgalleryone,R.drawable.artgallerytwo,"All Pins"));
        storyItems.add(new StoryItem(R.drawable.artgallerynine,R.drawable.artgalleryfour,R.drawable.artgalleryfive,"Instagram Highlight"));
        storyItems.add(new StoryItem(R.drawable.artgallerysix,R.drawable.artgalleryseven,R.drawable.artgalleryeight,"Templates"));

        ProfileFragmentAdapter profileFragmentAdapter = new ProfileFragmentAdapter(this,storyItems);
        recyclerview_FP.setLayoutManager(new GridLayoutManager(this,2));
        recyclerview_FP.setAdapter(profileFragmentAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back:
                finish();
                break;
        }

    }
}