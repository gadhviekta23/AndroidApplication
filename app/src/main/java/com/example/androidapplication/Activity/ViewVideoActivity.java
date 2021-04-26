package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.example.androidapplication.R;

public class ViewVideoActivity extends AppCompatActivity  implements BottomSheetDialog.BottomSheetListener {
ImageView view_image;
Button btn_save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_video);
        view_image= findViewById(R.id.view_image);
        Intent intent= getIntent();

        view_image.setImageResource(intent.getIntExtra("image",0));
        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomsheet =new BottomSheetDialog();
                bottomsheet.show(getSupportFragmentManager(),"BottomSheetDialog");
            }
        });
    }

    @Override
    public void onButtonClicked(String text) {

    }
}