package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidapplication.BottomSheet.BottomSheetDialogStory;
import com.example.androidapplication.R;

public class PinViewActivity extends AppCompatActivity {
ImageView backimage;
TextView addpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_view);
        backimage=findViewById(R.id.backimage);
        backimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(), BottomSheetDialogStory.class);
                startActivity(intent);
            }
        });




    }
}