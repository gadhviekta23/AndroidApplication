package com.example.androidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class LoginActivity extends AppCompatActivity {
    ImageView image;
    TextView text_welcome,text_dw;
    CircleImageView img_facebbok,img_google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        image = findViewById(R.id.image);
        text_welcome = findViewById(R.id.text_welcome);
        text_dw = findViewById(R.id.text_dw);
        img_facebbok = findViewById(R.id.img_facebbok);
        img_google = findViewById(R.id.img_google);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(LoginActivity.this,SelectFCActivity.class);
                startActivity(in);
            }
        });
    }
}