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

public class Password extends AppCompatActivity {

    Button btn,done_btn,show_cpass,show_npass,show_cnpass;
    TextView cpass_txt,forget_pass,npass_txt,cnpass_txt;
    EditText curentpass,newpass,cnewpass;
    LinearLayout pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        //Button
        btn=findViewById(R.id.btn);
        done_btn=findViewById(R.id.done_btn);
        show_cpass=findViewById(R.id.show_cpass);
        show_npass=findViewById(R.id.show_npass);
        show_cnpass=findViewById(R.id.show_cnpass);

        //TextView
        cpass_txt=findViewById(R.id.cpass_txt);
        forget_pass=findViewById(R.id.forget_pass);
        npass_txt=findViewById(R.id.npass_txt);
        cnpass_txt=findViewById(R.id.cnpass_txt);

        //EditText
        curentpass=findViewById(R.id.curentpass);
        newpass=findViewById(R.id.newpass);
        cnewpass=findViewById(R.id.cnewpass);

        //LinerLayout
        pass=findViewById(R.id.pass);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Password.this, Account_settings.class);
                startActivity(intent);
            }
        });

    }
}