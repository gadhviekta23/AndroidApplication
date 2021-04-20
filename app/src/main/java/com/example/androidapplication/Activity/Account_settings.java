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

public class Account_settings extends AppCompatActivity {

    LinearLayout first,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen;
    TextView account_settings_txt,name_txt,email_txt,password_txt,country_txt,gender_txt,business_type,contact_name,login_txt,claimed_account_txt,app_theme_txt,deactivate_account_txt,close_account_txt;
    Button btn,email_btn,password_btn,country_btn,gender_btn,business_type_btn,contact_name_btn,login_btn,claimed_account_btn,app_theme_btn,deactivate_account_btn,close_account_btn;
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
        thirteen=findViewById(R.id.thirteen);
        fourteen=findViewById(R.id.fourteen);

        //TextView
        account_settings_txt=findViewById(R.id.account_settings_txt);
        name_txt=findViewById(R.id.name_txt);
        email_txt=findViewById(R.id.email_txt);
        password_txt=findViewById(R.id.password_txt);
        country_txt=findViewById(R.id.country_txt);
        gender_txt=findViewById(R.id.gender_txt);
        business_type=findViewById(R.id.business_type);
        contact_name=findViewById(R.id.contact_name);
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
        business_type_btn=findViewById(R.id.business_type_btn);
        contact_name_btn=findViewById(R.id.contact_name_btn);
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
                Intent intent=new Intent(Account_settings.this,SettingActivity.class);
                startActivity(intent);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this, Email_activity.class);
                startActivity(intent);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this, Password.class);
                startActivity(intent);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this, Country.class);
                startActivity(intent);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this, Gender.class);
                startActivity(intent);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this,Business_type.class);
                startActivity(intent);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this, C_name.class);
                startActivity(intent);
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this,login_option.class);
                startActivity(intent);
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this, Claimed_accounts.class);
                startActivity(intent);
            }
        });

        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this, Application_theme.class);
                startActivity(intent);
            }
        });

        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this, Deactivate_account.class );
                startActivity(intent);
            }
        });

        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Account_settings.this, Close_account.class );
                startActivity(intent);
            }
        });
    }
}