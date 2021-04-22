package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidapplication.R;

public class SettingActivity extends AppCompatActivity {

    TextView setting_txt,personal_txt,edit_txt,account_txt,notification_txt,privacy_txt,action_txt,add_txt,log_txt;
    Button btn,edit_btn,account_btn,notification_btn,privacy_btn;
    LinearLayout first,second,third,forth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        //Textview
        setting_txt=findViewById(R.id.setting_txt);
        personal_txt=findViewById(R.id.personal_txt);
        edit_txt=findViewById(R.id.edit_txt);
        account_txt=findViewById(R.id.account_txt);
        notification_txt=findViewById(R.id.notification_txt);
        privacy_txt=findViewById(R.id.privacy_txt);
        action_txt=findViewById(R.id.action_txt);
        add_txt=findViewById(R.id.add_txt);
        log_txt=findViewById(R.id.log_txt);

        //Button
        btn=findViewById(R.id.btn);
        edit_btn=findViewById(R.id.edit_btn);
        account_btn=findViewById(R.id.account_btn);
        notification_btn=findViewById(R.id.notification_btn);
        privacy_btn=findViewById(R.id.privacy_btn);

        //LinearLayout
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        third=findViewById(R.id.third);

        forth=findViewById(R.id.forth);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this, AccountSettingsActivity.class);
               startActivity(intent);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });

    }
}