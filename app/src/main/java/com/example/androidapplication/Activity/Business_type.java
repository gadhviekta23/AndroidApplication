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

public class Business_type extends AppCompatActivity {

    Button btn,done_btn;
    LinearLayout businesstype;
    RadioGroup business_btn;
    RadioButton professional,public_figure,media,brand,retailer,online_marketplace,local_business,instituation_non_profit,other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_type);

        //LinearLayout
        businesstype=findViewById(R.id.businesstype);

        //Button
        btn=findViewById(R.id.btn);
        done_btn=findViewById(R.id.done_btn);

        //RadioGroup
        business_btn=findViewById(R.id.business_btn);

        //RadioButton
        professional=findViewById(R.id.professional);
        public_figure=findViewById(R.id.public_figure);
        media=findViewById(R.id.media);
        retailer=findViewById(R.id.retailer);
        online_marketplace=findViewById(R.id.online_marketplace);
        local_business=findViewById(R.id.local_business);
        instituation_non_profit=findViewById(R.id.instituation_non_profit);
        other=findViewById(R.id.other);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Business_type.this,activity_account_settings.class);
                startActivity(intent);
            }
        });


    }
}