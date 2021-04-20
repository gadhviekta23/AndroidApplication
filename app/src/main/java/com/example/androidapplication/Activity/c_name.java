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

public class c_name extends AppCompatActivity {

    Button btn,done_btn;
    TextView contact;
    EditText add_contact_name;
    LinearLayout contact_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_name);

        //Button
        btn=findViewById(R.id.btn);
        done_btn=findViewById(R.id.done_btn);

        //TextView
        contact=findViewById(R.id.contact);

        //EditText
        add_contact_name=findViewById(R.id.add_contact_name);

        //LinearLayout
        contact_name=findViewById(R.id.contact_name);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(c_name.this,activity_account_settings.class);
                startActivity(intent);
            }
        });

    }
}