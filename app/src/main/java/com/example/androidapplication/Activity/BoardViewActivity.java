package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.androidapplication.Adapter.HomeAdapter;
import com.example.androidapplication.BottomSheet.BottomSheetDialogStory;
import com.example.androidapplication.Model.HomeItem;
import com.example.androidapplication.Model.SearchItem;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class BoardViewActivity extends AppCompatActivity {
ImageView closeimage;
RecyclerView recyclerview_ABV;
BoardAdapter boardAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_view);
        closeimage=findViewById(R.id.closeimage);

        recyclerview_ABV=findViewById(R.id.recyclerview_ABV);
        ArrayList<SearchItem> searchItems = new ArrayList<>();
        searchItems.add(new SearchItem(R.drawable.artgallerynine,"All Pins"));
        searchItems.add(new SearchItem(R.drawable.artgallery,"Instagram Highlight"));
        searchItems.add(new SearchItem(R.drawable.artgallerysix,"Templates"));

        boardAdapter = new BoardAdapter(searchItems, this);
        recyclerview_ABV.setLayoutManager(new LinearLayoutManager(this));
        recyclerview_ABV.setAdapter(boardAdapter);

        closeimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(), BottomSheetDialogStory.class);
                startActivity(intent);
            }
        });
    }
}