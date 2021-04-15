package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidapplication.R;
import com.mikhaellopez.circularimageview.CircularImageView;

public class activity_account_settings extends AppCompatActivity {

    LinearLayout first,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve;
    TextView account_settings_txt,name_txt,email_txt,password_txt,country_txt,gender_txt,login_txt,claimed_account_txt,app_theme_txt,deactivate_account_txt,close_account_txt;
    Button btn,email_btn,password_btn,country_btn,gender_btn,login_btn,claimed_account_btn,app_theme_btn,deactivate_account_btn,close_account_btn;
    CircularImageView profile_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);

        //LinearLayout
        first=findViewById(R.id.first);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        ten=findViewById(R.id.ten);
        eleven=findViewById(R.id.eleven);
        twelve=findViewById(R.id.twelve);

        //TextView
        account_settings_txt=findViewById(R.id.account_settings_txt);
        name_txt=findViewById(R.id.name_txt);
        email_txt=findViewById(R.id.email_txt);
        password_txt=findViewById(R.id.password_txt);
        country_txt=findViewById(R.id.country_txt);
        gender_txt=findViewById(R.id.gender_txt);
        login_txt=findViewById(R.id.login_txt);
        claimed_account_txt=findViewById(R.id.claimed_account_txt);
        app_theme_txt=findViewById(R.id.app_theme_txt);
        deactivate_account_txt=findViewById(R.id.deactivate_account_txt);
        close_account_txt=findViewById(R.id.close_account_txt);

        //Button
        btn=findViewById(R.id.btn);
        email_btn=findViewById(R.id.email_btn);
        password_btn=findViewById(R.id.password_btn);
        country_btn=findViewById(R.id.country_btn);
        gender_btn=findViewById(R.id.gender_btn);
        login_btn=findViewById(R.id.login_btn);
        claimed_account_btn=findViewById(R.id.claimed_account_btn);
        app_theme_btn=findViewById(R.id.app_theme_btn);
        deactivate_account_btn=findViewById(R.id.deactivate_account_btn);
        close_account_btn=findViewById(R.id.close_account_btn);

        //CircularImageView
//        profile_image=findViewById(R.id.profile_image);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity_account_settings.this,SettingActivity.class);
                startActivity(intent);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity_account_settings.this,email_activity.class);
                startActivity(intent);
            }
        });

    }
}