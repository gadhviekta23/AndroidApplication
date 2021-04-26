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

public class GenderActivity extends AppCompatActivity {

    Button btn,done_btn;
    RadioGroup gender_btn;
    RadioButton male,female,non_binary;
    LinearLayout gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        //Button
        btn=findViewById(R.id.btn);
        done_btn=findViewById(R.id.done_btn);

        //RadioGroup
        gender_btn=findViewById(R.id.gender_btn);

        //RadioButton
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        non_binary=findViewById(R.id.non_binary);

        //LinearLayout
        gender=findViewById(R.id.gender);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GenderActivity.this, AccountSettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}