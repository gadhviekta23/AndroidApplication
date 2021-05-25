package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.VideoView;

import com.example.androidapplication.R;

public class ExtendVideoActivity extends AppCompatActivity {

    VideoView video_AEV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_video);

        video_AEV = findViewById(R.id.video_AEV);

        Bundle extras = getIntent().getExtras();
        Uri myUri = Uri.parse(extras.getString("videoextent"));
        video_AEV.setVideoURI(myUri);
        video_AEV.requestFocus();
        video_AEV.start();

        video_AEV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (video_AEV.isPlaying()){
                video_AEV.pause();
            }else {
                video_AEV.start();
            }
            }
        });

    }


}