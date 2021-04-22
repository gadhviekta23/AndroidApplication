package com.example.androidapplication.Fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.androidapplication.Adapter.SearchAdapter;
import com.example.androidapplication.Model.SearchItem;
import com.example.androidapplication.R;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends AppCompatActivity {

    List<SearchItem> myLists;
    RecyclerView rv;
    SearchAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_fragment);

        rv=(RecyclerView)findViewById(R.id.rec);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new GridLayoutManager(this,2));

        myLists=new ArrayList<>();

        getdata();
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));
        myLists.add(new SearchItem(R.drawable.ic_launcher_background));

        adapter=new SearchAdapter(myLists,this);
        rv.setAdapter(adapter);

    }
    private void getdata() {
    }
}