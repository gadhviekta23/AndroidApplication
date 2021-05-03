package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.androidapplication.Activity.HomePageActivity;
import com.example.androidapplication.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SelectFCActivity extends AppCompatActivity implements View.OnClickListener {

    CircleImageView cag_img1, cag_img2,cag_img4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_f_c);
        cag_img1 = findViewById(R.id.cag_img1);
        cag_img2 = findViewById(R.id.cag_img2);
        cag_img4 = findViewById(R.id.cag_img4);
        cag_img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(SelectFCActivity.this, Choose_board.class);
                startActivity(in);

            }
        });
        button = findViewById(R.id.button);

        cag_img1.setOnClickListener(this);
        cag_img2.setOnClickListener(this);
        button.setOnClickListener(this);

//        circleImageView1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    AnimationDrawable animation = (AnimationDrawable) circleImageView.getDrawable();
//                    animation.stop();
//                    animation.selectDrawable(0);
//                    animation.start();
//                    return true;
//                }
//                return false;
//            }
//
//        });


    }

    public static void effect(View circleImageView) {
        circleImageView.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        v.getBackground().setColorFilter(0xe0f47521, PorterDuff.Mode.SRC_ATOP);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cag_img1:
                Intent intent = new Intent(getApplicationContext(), HomePageActivity.class);
                startActivity(intent);
                break;
            case R.id.cag_img2:
                cag_img2.animate()
                        .setDuration(1000)
                        .scaleX(4.0f)
                        .scaleY(4.0f)
                        .scaleX(1.0f)
                        .scaleY(1.0f)
                        .alpha((float) 0.5);
                break;
            case R.id.button:
                Intent intentb = new Intent(getApplicationContext(), HomePageActivity.class);
                startActivity(intentb);
                break;


        }

    }
}