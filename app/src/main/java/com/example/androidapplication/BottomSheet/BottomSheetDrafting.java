package com.example.androidapplication.BottomSheet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidapplication.Activity.CreateStoryActivity;
import com.example.androidapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import static android.app.Activity.RESULT_OK;

public class BottomSheetDrafting extends BottomSheetDialogFragment implements View.OnClickListener {

    TextView newStoryPin;
    private final int REQUEST_TAKE_GALLERY_VIDEO = 1;
    Uri imageUri;


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
//                Intent intent =new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
//                startActivityForResult(intent,REQUEST_IMAGE_CAPTURE);
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,"Select Video"),REQUEST_TAKE_GALLERY_VIDEO);
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK  && requestCode == REQUEST_TAKE_GALLERY_VIDEO) {
            imageUri = data.getData();
            String VideoUri= imageUri.toString();

            Intent intent = new Intent(getContext(), CreateStoryActivity.class);
            intent.putExtra("image",VideoUri);
            Log.e("tag","===========video= "+VideoUri);
            startActivity(intent);
        }
    }
}