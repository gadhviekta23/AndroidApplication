package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidapplication.R;

public class EmailActivity extends AppCompatActivity {

    Button btn,done_btn;
    LinearLayout email;
    TextView email_txt;
    EditText add_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_activity);

        //Button
        btn=findViewById(R.id.btn);
        done_btn=findViewById(R.id.done_btn);

        //LinerLayout
        email=findViewById(R.id.email);

        //TextView
        email_txt=findViewById(R.id.email_txt);

        //EditText
        add_email=findViewById(R.id.add_email);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EmailActivity.this, AccountSettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}