package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import android.provider.MediaStore.Video.Thumbnails;

import com.example.androidapplication.Fragment.ProfileFragment;
import com.example.androidapplication.R;

public class CreateStoryActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView btn_back_AS,thumbnails_CS;
    TextView next_CS;
    VideoView video_AS;
    Uri img,uri;
    Bitmap bmThumbnail;

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
        bmThumbnail = ThumbnailUtils.createVideoThumbnail(VideoUrl,Thumbnails.MINI_KIND);
        thumbnails_CS.setImageBitmap(bmThumbnail);
        Log.e("tag","===========bmThumbnail= "+bmThumbnail);
        Log.e("tag","===========VideoUrl= "+VideoUrl);


//        Uri uri = getIntent().getParcelableExtra("imageUri");
        Log.e("tag","===========image= "+img);
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
                String VideoUri= uri.toString();
                Bundle bundle = new Bundle();
                bundle.putString("edttext", VideoUri);
                ProfileFragment fragobj = new ProfileFragment();
                fragobj.setArguments(bundle);
                break;
        }
    }

}