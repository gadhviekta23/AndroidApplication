package com.example.androidapplication.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.androidapplication.Adapter.HomeAdapter;
import com.example.androidapplication.Adapter.HomeAdapterOne;
import com.example.androidapplication.BottomSheet.BottomSheetDialogStory;
import com.example.androidapplication.BottomSheet.BottomSheetDrafting;
import com.example.androidapplication.Fragment.ForYouFragment;
import com.example.androidapplication.Fragment.ProfileFragment;
import com.example.androidapplication.Model.HomeItem;
import com.example.androidapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {

    private FrameLayout frameLayout;
    public RecyclerView recyclerview_homeone;
    HomeAdapter homeAdapter;
    HomeAdapterOne homeAdapterOne;
    TextView texts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        texts = findViewById(R.id.text);
        init();

        ArrayList<HomeItem> homeItems = new ArrayList<>();
        homeItems.add(new HomeItem("For you"));
        homeItems.add(new HomeItem("Latest"));
        homeItems.add(new HomeItem("Following"));
        homeItems.add(new HomeItem("Food design"));
        homeItems.add(new HomeItem("Beverageposter"));
        // ok and getapplication ke getapplicationcontext ee new activity mate use na thai ok
        homeAdapter = new HomeAdapter(homeItems, getApplication(), this);
        recyclerview_homeone.setLayoutManager(new LinearLayoutManager(getApplication(), RecyclerView.HORIZONTAL, false));
        recyclerview_homeone.setAdapter(homeAdapter);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(this);
        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_id,
                    new ForYouFragment()).commit();
        }

    }

    private void init() {
        frameLayout = findViewById(R.id.framelayout_id);
        recyclerview_homeone = findViewById(R.id.recyclerview_homeone);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_home:
                recyclerview_homeone.setVisibility(View.VISIBLE);
                loadFragment(new ForYouFragment());
                break;

            case R.id.nav_search:
                recyclerview_homeone.setVisibility(View.VISIBLE);
                Intent intent = new Intent(HomePageActivity.this, SearchActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_chat:
                recyclerview_homeone.setVisibility(View.VISIBLE);
                break;

            case R.id.nav_story:
                recyclerview_homeone.setVisibility(View.VISIBLE);
                BottomSheetDialogStory bottomsheet =new BottomSheetDialogStory();
                bottomsheet.show(getSupportFragmentManager(),"exampleBottomSheet");
                break;

            case R.id.nav_person:
                visiblerecyclerviewone();
                loadFragment(new ProfileFragment());
                break;

        }

        return true;
    }

    private void visiblerecyclerviewone() {
        if (recyclerview_homeone.getVisibility() == View.VISIBLE) {
            recyclerview_homeone.setVisibility(View.GONE);
        }
    }


    public void loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_id, fragment).commit();
        }
    }

}