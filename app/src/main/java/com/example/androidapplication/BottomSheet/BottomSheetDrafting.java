package com.example.androidapplication.BottomSheet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDrafting extends BottomSheetDialogFragment implements View.OnClickListener {

    TextView newStoryPin;
    private static final int PICK_FROM_GALLERY = 1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_bottom_sheet_drafting, container, false);
        newStoryPin = v.findViewById(R.id.newStoryPin);
        newStoryPin.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.newStoryPin:
                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent, PICK_FROM_GALLERY);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_FROM_GALLERY) {
            Bitmap image = (Bitmap) data.getExtras().get("data");
            Log.e("tah","++++++++++++++ === "+image);
//            ImageView imageview = (ImageView) findViewById(R.id.ImageView01); //sets imageview as the bitmap
//            imageview.setImageBitmap(image);
        }
    }
}