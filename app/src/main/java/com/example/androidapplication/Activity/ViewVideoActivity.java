package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;


import com.example.androidapplication.Adapter.VideoViewAdapter;
import com.example.androidapplication.BottomSheet.BottomSheetDialog;
import com.example.androidapplication.Model.HomeItem_two;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class ViewVideoActivity extends AppCompatActivity implements View.OnClickListener {
    VideoView view_image;
    Button btn_save;
    TextView comment;
    ImageView dowload_AVV, extend_AVV, arrowleft_AVV;
    RecyclerView recyclerview_AVV;
    VideoViewAdapter videoViewAdapter;
    Uri myUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_video);
        view_image = findViewById(R.id.view_image);
        comment = findViewById(R.id.comment);
        dowload_AVV = findViewById(R.id.dowload_AVV);
        btn_save = findViewById(R.id.btn_save);
        extend_AVV = findViewById(R.id.extend_AVV);
        arrowleft_AVV = findViewById(R.id.arrowleft_AVV);
        recyclerview_AVV = findViewById(R.id.recyclerview_AVV);


        btn_save.setOnClickListener(this);
        extend_AVV.setOnClickListener(this);
        dowload_AVV.setOnClickListener(this);
        arrowleft_AVV.setOnClickListener(this);


        Bundle extras = getIntent().getExtras();
        myUri = Uri.parse(extras.getString("video"));
        view_image.setVideoURI(myUri);
        view_image.requestFocus();
        view_image.start();

        recyclerview_AVV_init();
    }

    void recyclerview_AVV_init() {
        ArrayList<HomeItem_two> homeItem_twos = new ArrayList<>();
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/" + R.raw.videotwo, "this is image", R.drawable.heart, "1k", R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/" + R.raw.videotwo, "this is image", R.drawable.heart, "1k", R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/" + R.raw.videotwo, "this is image", R.drawable.heart, "1k", R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/" + R.raw.videotwo, "this is image", R.drawable.heart, "1k", R.drawable.dot));

        videoViewAdapter = new VideoViewAdapter(getApplicationContext(), homeItem_twos);
//        recyclerview_AVV.setLayoutManager(new GridLayoutManager(this, 2));
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerview_AVV.setLayoutManager(staggeredGridLayoutManager);
        staggeredGridLayoutManager.scrollToPosition(0);
        recyclerview_AVV.setAdapter(videoViewAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_save:
                Intent i = new Intent(ViewVideoActivity.this, ChooseBoardActivity.class);
                startActivity(i);
                break;

            case R.id.dowload_AVV:
                BottomSheetDialog bottomsheet = new BottomSheetDialog();
                bottomsheet.show(getSupportFragmentManager(), "exampleBottomSheet");
                break;

            case R.id.extend_AVV:
                Intent in = new Intent(ViewVideoActivity.this, ExtendVideoActivity.class);
                in.putExtra("videoextent", myUri.toString());
                startActivity(in);

                break;
            case R.id.arrowleft_AVV:
                Intent b = new Intent(ViewVideoActivity.this, HomePageActivity.class);
                startActivity(b);
                break;
        }
    }
}