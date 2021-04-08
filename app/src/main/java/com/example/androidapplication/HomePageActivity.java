package com.example.androidapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {
    RecyclerView recyclerview_homeone,recyclerview_hometwo;
    HomeAdapter homeAdapter;
    HomeAdapterOne homeAdapterOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        recyclerview_homeone = findViewById(R.id.recyclerview_homeone);
        ArrayList<HomeItem> homeItems = new ArrayList<>();
        homeItems.add(new HomeItem("For you"));
        homeItems.add(new HomeItem("Latest"));
        homeItems.add(new HomeItem("Following"));
        homeItems.add(new HomeItem("Food design"));
        homeItems.add(new HomeItem("Beverageposter"));
        // ok and getapplication ke getapplicationcontext ee new activity mate use na thai ok
        homeAdapter = new HomeAdapter(this, homeItems);
        recyclerview_homeone.setLayoutManager(new LinearLayoutManager(getApplication(), RecyclerView.HORIZONTAL, false));
        recyclerview_homeone.setAdapter(homeAdapter);

        recyclerview_hometwo = findViewById(R.id.recyclerview_hometwo);
        ArrayList<HomeItem_two> homeItem_twos = new ArrayList<>();
        homeItem_twos.add(new HomeItem_two(R.drawable.nature1,"this is image",R.drawable.heart,"1k"));
        homeItem_twos.add(new HomeItem_two(R.drawable.nature2,"nature image is best",R.drawable.heart,"2k"));
        homeItem_twos.add(new HomeItem_two(R.drawable.nature3,"nature image is the best",R.drawable.heart,"4k"));
        homeItem_twos.add(new HomeItem_two(R.drawable.nature4,"nature image is the best",R.drawable.heart,"6k"));
        homeItem_twos.add(new HomeItem_two(R.drawable.nature5,"nature image is the best",R.drawable.heart,"2k"));

        homeAdapterOne =new HomeAdapterOne(this,homeItem_twos);
        recyclerview_hometwo.setLayoutManager(new GridLayoutManager(getApplication(), 3));
        recyclerview_hometwo.setAdapter(homeAdapterOne);
    }
}