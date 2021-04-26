package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.example.androidapplication.R;

public class LoginOptionActivity extends AppCompatActivity {

    Button btn;
    LinearLayout login_option;
    TextView fb,google;
    Switch fb_switch,google_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_option);

        //Button
        btn=findViewById(R.id.btn);

        //LinearLayout
        login_option=findViewById(R.id.login_option);

        //TextView
        fb=findViewById(R.id.fb);
        google=findViewById(R.id.google);

        //Switch
        fb_switch=findViewById(R.id.fb_switch);
        google_switch=findViewById(R.id.google_switch);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginOptionActivity.this, AccountSettingsActivity.class);
                startActivity(intent);
            }
        });

    }
}