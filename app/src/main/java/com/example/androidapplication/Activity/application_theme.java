package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.androidapplication.R;

public class application_theme extends AppCompatActivity {

    Button btn;
    LinearLayout theme;
    RadioGroup app_theme;
    RadioButton system_default,light,dark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_theme);

        //Button
        btn=findViewById(R.id.btn);

        //LinearLayout
        theme=findViewById(R.id.theme);

        //RadioGroup
        app_theme=findViewById(R.id.app_theme);

        //RadioButton
        system_default=findViewById(R.id.system_default);
        light=findViewById(R.id.light);
        dark=findViewById(R.id.dark);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(application_theme.this,activity_account_settings.class);
                startActivity(intent);
            }
        });
    }
}