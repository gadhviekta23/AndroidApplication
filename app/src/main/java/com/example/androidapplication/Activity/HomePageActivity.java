package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.androidapplication.Adapter.HomeAdapter;
import com.example.androidapplication.Adapter.HomeAdapterOne;
import com.example.androidapplication.Fragment.ForYouFragment;
import com.example.androidapplication.Model.HomeItem;
import com.example.androidapplication.Model.HomeItem_two;
import com.example.androidapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {
    private FrameLayout frameLayout;
    RecyclerView recyclerview_homeone,recyclerview_hometwo;
    HomeAdapter homeAdapter;
    HomeAdapterOne homeAdapterOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        init();

        ArrayList<HomeItem> homeItems = new ArrayList<>();
        homeItems.add(new HomeItem("For you"));
        homeItems.add(new HomeItem("Latest"));
        homeItems.add(new HomeItem("Following"));
        homeItems.add(new HomeItem("Food design"));
        homeItems.add(new HomeItem("Beverageposter"));
        // ok and getapplication ke getapplicationcontext ee new activity mate use na thai ok
        homeAdapter = new HomeAdapter(homeItems,getApplication(),this);
        recyclerview_homeone.setLayoutManager(new LinearLayoutManager(getApplication(), RecyclerView.HORIZONTAL, false));
        recyclerview_homeone.setAdapter(homeAdapter);


        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ForYouFragment()).commit();
        }

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected( MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new ForYouFragment();
                            break;
                        case R.id.nav_favorites:
                            selectedFragment = new ForYouFragment();
                            break;
                        case R.id.nav_search:
                            selectedFragment = new ForYouFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };


    private void init() {
        frameLayout = findViewById(R.id.framelayout_id);
        recyclerview_homeone = findViewById(R.id.recyclerview_homeone);
    }

    public void loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_id, fragment).commit();
        }
    }
}