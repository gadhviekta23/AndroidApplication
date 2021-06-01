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

public class AccountSettingsActivity extends AppCompatActivity {

    TextView name_txt,email_txt,password_txt,country_txt,gender_txt,business_type,contact_name,login_txt,claimed_account_txt,app_theme_txt,deactivate_account_txt,close_account_txt;
    Button btn;
    CircularImageView profile_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);


        //TextView
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
        email_txt=findViewById(R.id.email_txt);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });

        email_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), EmailActivity.class);
                startActivity(intent);
            }
        });

        password_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), PasswordActivity.class);
                startActivity(intent);
            }
        });

        country_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), CountryActivity.class);
                startActivity(intent);
            }
        });

        gender_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountSettingsActivity.this, GenderActivity.class);
                startActivity(intent);
            }
        });

        business_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountSettingsActivity.this, BusinessTypeActivity.class);
                startActivity(intent);
            }
        });

        contact_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountSettingsActivity.this, ContactNameActivity.class);
                startActivity(intent);
            }
        });

        login_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountSettingsActivity.this, LoginOptionActivity.class);
                startActivity(intent);
            }
        });

        app_theme_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountSettingsActivity.this, ApplicationThemeActivity.class);
                startActivity(intent);
            }
        });

        deactivate_account_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountSettingsActivity.this, DeactivateAccountActivity.class );
                startActivity(intent);
            }
        });

        close_account_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountSettingsActivity.this, CloseAccountActivity.class );
                startActivity(intent);
            }
        });
    }
}