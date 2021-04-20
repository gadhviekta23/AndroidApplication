package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.example.androidapplication.Activity.HomePageActivity;
import com.example.androidapplication.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SelectFCActivity extends AppCompatActivity {

    CircleImageView circleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_f_c);
        circleImageView = findViewById(R.id.cag_img1);

        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), HomePageActivity.class);
                startActivity(intent);

            }
        });
    }
        public static void effect(View circleImageView )
        {
            circleImageView.setOnTouchListener(new View.OnTouchListener() {

                public boolean onTouch(View v, MotionEvent event) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN: {
                            v.getBackground().setColorFilter(0xe0f47521,PorterDuff.Mode.SRC_ATOP);
                            v.invalidate();
                            break;
                        }
                        case MotionEvent.ACTION_UP: {
                            v.getBackground().clearColorFilter();
                            v.invalidate();
                            break;
                        }
                    }
                    return false;
                }
            });
        }
}