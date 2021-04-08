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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        recyclerview_homeone = findViewById(R.id.recyclerview_homeone);
        recyclerview_hometwo = findViewById(R.id.recyclerview_hometwo);
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


    }
}