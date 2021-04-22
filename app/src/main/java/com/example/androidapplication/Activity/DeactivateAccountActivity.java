package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidapplication.R;
import com.mikhaellopez.circularimageview.CircularImageView;

public class DeactivateAccountActivity extends AppCompatActivity {

    TextView deactivate_account,description,name,description_one;
    LinearLayout first;
    CircularImageView profile_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deactivate_account);

        //TextView
        deactivate_account=findViewById(R.id.deactivate_account);
        description=findViewById(R.id.description);
        name=findViewById(R.id.name);
        description_one=findViewById(R.id.description_one);

        //LinearLayout
        first=findViewById(R.id.first);
    }
}