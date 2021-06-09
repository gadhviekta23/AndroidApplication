package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import com.example.androidapplication.R;

public class OpenVideoActivity extends AppCompatActivity {

    VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_video);
        videoview = findViewById(R.id.videoview_AOV);
        videoview.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videotwo));
        videoview.requestFocus();
        videoview.start();
    }
}