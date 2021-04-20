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

public class Claimed_accounts extends AppCompatActivity {

    Button btn;
    LinearLayout claimed_account;
    TextView insta,youtube;
    Switch  insta_switch,youtube_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claimed_accounts);

        //Button
        btn=findViewById(R.id.btn);

        //LinearLayout
        claimed_account=findViewById(R.id.claimed_account);

        //TextView
        insta=findViewById(R.id.insta);
        youtube=findViewById(R.id.youtube);

        //Switch
        insta_switch=findViewById(R.id.insta_switch);
        youtube_switch=findViewById(R.id.youtube_switch);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Claimed_accounts.this, Account_settings.class);
                startActivity(intent);
            }
        });


    }
}