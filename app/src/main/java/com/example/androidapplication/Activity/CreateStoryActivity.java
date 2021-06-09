package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import android.provider.MediaStore.Video.Thumbnails;

import com.example.androidapplication.Fragment.ProfileFragment;
import com.example.androidapplication.R;

import java.io.Serializable;

public class CreateStoryActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView btn_back_AS,thumbnails_CS;
    TextView next_CS;
    VideoView video_AS;
    Uri img,uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_story);

        btn_back_AS = findViewById(R.id.btn_back_AS);
        thumbnails_CS = findViewById(R.id.thumbnails_CS);
        video_AS = findViewById(R.id.video_AS);
        next_CS = findViewById(R.id.next_CS);
        btn_back_AS.setOnClickListener(this);
        next_CS.setOnClickListener(this);


        final String VideoUrl=getIntent().getExtras().getString("image");
        Uri uri = Uri.parse(VideoUrl);

        video_AS.setVideoURI(uri);
        video_AS.start();
        video_AS.requestFocus();
        video_AS.getDuration();
        video_AS.canPause();
        video_AS.stopPlayback();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back_AS:
                finish();
                break;
            case R.id.next_CS:
                Intent intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
    }


}