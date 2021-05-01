package com.example.androidapplication.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidapplication.Adapter.SearchAdapter;
import com.example.androidapplication.Model.SearchItem;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {


    RecyclerView rv,reccyleviewtwo_sf,reccyleviewthree_sf;
    SearchAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_fragment);

        rv=(RecyclerView)findViewById(R.id.recycleviewone_sf);
        reccyleviewtwo_sf=(RecyclerView)findViewById(R.id.reccyleviewtwo_sf);
        rv.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<SearchItem> myLists = new ArrayList<>();
        myLists.add(new SearchItem(R.drawable.cake,"Food menu design"));
        myLists.add(new SearchItem(R.drawable.rapsong,"Life Skill"));
        myLists.add(new SearchItem(R.drawable.cake,"Cake  Design"));
        myLists.add(new SearchItem(R.drawable.topsongs,"Rap Song"));
        myLists.add(new SearchItem(R.drawable.topsongs,"Hindi Song"));
        myLists.add(new SearchItem(R.drawable.rapsong,"Pop Song"));


        adapter=new SearchAdapter(myLists,this);
        rv.setAdapter(adapter);



        ArrayList<SearchItem> searchItems = new ArrayList<>();
        searchItems.add(new SearchItem(R.drawable.traveling,"Traveling"));
        searchItems.add(new SearchItem(R.drawable.nature2,"Old song"));
        searchItems.add(new SearchItem(R.drawable.pandas,"Panda Vdio"));
        searchItems.add(new SearchItem(R.drawable.education,"Education"));
        searchItems.add(new SearchItem(R.drawable.traveling,"Hindi Song"));
        searchItems.add(new SearchItem(R.drawable.rapsong,"Pop Song"));
        reccyleviewtwo_sf.setLayoutManager(new GridLayoutManager(this,2));

        adapter=new SearchAdapter(searchItems,this);
        reccyleviewtwo_sf.setAdapter(adapter);


        reccyleviewthree_sf=(RecyclerView)findViewById(R.id.reccyleviewthree_sf);
        reccyleviewthree_sf.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<SearchItem> funnyvedios = new ArrayList<>();
        funnyvedios.add(new SearchItem(R.drawable.nature1,"Traveling"));
        funnyvedios.add(new SearchItem(R.drawable.olddsong,"Old Song"));
        funnyvedios.add(new SearchItem(R.drawable.pandas,"Panda"));
        funnyvedios.add(new SearchItem(R.drawable.nature4,"Motivational"));
        funnyvedios.add(new SearchItem(R.drawable.fashion,"Fashion"));
        funnyvedios.add(new SearchItem(R.drawable.phptography,"PhotoGraphy"));

        adapter=new SearchAdapter(funnyvedios,this);
        reccyleviewthree_sf.setAdapter(adapter);



    }
    private void getdata() {
    }
}