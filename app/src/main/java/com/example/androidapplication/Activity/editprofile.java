package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidapplication.R;
import com.mikhaellopez.circularimageview.CircularImageView;

public class editprofile extends AppCompatActivity {
    TextView edit_txt,fname_txt,surname_txt,username_txt,about_you_txt,location_txt,website_txt;
    Button btn,done_btn,edit_btn;
    CircularImageView profile_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);
        //Textview
        edit_txt=findViewById(R.id.edit_txt);
        fname_txt=findViewById(R.id.fname_txt);
        surname_txt=findViewById(R.id.surname_txt);
        username_txt=findViewById(R.id.username_txt);
        about_you_txt=findViewById(R.id.about_you_txt);
        location_txt=findViewById(R.id.location_txt);
        website_txt=findViewById(R.id.website_txt);

        //Button
        btn=findViewById(R.id.btn);
        done_btn=findViewById(R.id.done_btn);
        edit_btn=findViewById(R.id.edit_btn);

        //CircularImageView
        //  profile_image=findViewById(R.id.profile_image);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(editprofile.this, SettingActivity.class);
                startActivity(intent);
            }
        });

    }
}