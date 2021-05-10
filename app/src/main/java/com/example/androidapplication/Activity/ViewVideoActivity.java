package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;


import com.example.androidapplication.Adapter.HomeAdapterOne;
import com.example.androidapplication.Model.HomeItem_two;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class ViewVideoActivity extends AppCompatActivity implements BottomSheetDialog.BottomSheetListener {
VideoView view_image;
Button btn_save;
TextView comment;
RecyclerView recyclerview_AVV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_video);
        view_image= findViewById(R.id.view_image);
        comment= findViewById(R.id.comment);
        recyclerview_AVV= findViewById(R.id.recyclerview_AVV);

        Bundle extras = getIntent().getExtras();
        Uri myUri=  Uri.parse(extras.getString("video"));
        view_image.setVideoURI(myUri);
        view_image.requestFocus();
        view_image.start();
        Log.e("tag","hjhkjhkjhkh++++++++++++++++++++================ "+myUri);

        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomsheet =new BottomSheetDialog();
                bottomsheet.show(getSupportFragmentManager(),"exampleBottomSheet");

            }
        });
        recyclerview_AVV_init();
    }

    private void recyclerview_AVV_init() {
        ArrayList<HomeItem_two> homeItem_twos = new ArrayList<>();
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videotwo,"this is image",R.drawable.heart,"1k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videotwo,"nature image is best",R.drawable.heart,"2k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videothree,"nature image is the best",R.drawable.heart,"4k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videoone,"nature image is the best",R.drawable.heart,"6k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videothree,"nature image is the best",R.drawable.heart,"2k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videotwo,"this is image",R.drawable.heart,"1k",R.drawable.dot));

        HomeAdapterOne homeAdapterOne = new HomeAdapterOne(this,homeItem_twos);
        recyclerview_AVV.setLayoutManager(new GridLayoutManager(this, 2));
//        recyclerview_AVV.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerview_AVV.setAdapter(homeAdapterOne);
    }

    @Override
    public void onButtonClicked(String text) {
        comment.setText(text);
    }

}