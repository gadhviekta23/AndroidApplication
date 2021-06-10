package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.example.androidapplication.Adapter.ViewBoardAdapter;
import com.example.androidapplication.Model.Boardview;
import com.example.androidapplication.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ViewBoardActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView back_VBA;
    RecyclerView reccycleview_VBA;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_board);
        back_VBA = findViewById(R.id.back_VBA);
        reccycleview_VBA=findViewById(R.id.reccycleview_VBA);
        back_VBA.setOnClickListener(this);

        ArrayList<Boardview>  boardview = new ArrayList<>();
        boardview.add(new Boardview(R.drawable.artgallery));
        boardview.add(new Boardview(R.drawable.artgallerytwo));
        boardview.add(new Boardview(R.drawable.artgalleryfour));
        boardview.add(new Boardview(R.drawable.artgalleryfive));
        boardview.add(new Boardview(R.drawable.artgalleryfive));
        boardview.add(new Boardview(R.drawable.artgalleryfive));

        ViewBoardAdapter viewBoardAdapter = new ViewBoardAdapter(this,boardview);
        reccycleview_VBA.setLayoutManager(new GridLayoutManager(this,3));
        reccycleview_VBA.setAdapter(viewBoardAdapter);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.back_VBA:
                finish();
                break;
        }
    }
}