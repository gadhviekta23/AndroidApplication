package com.example.androidapplication.BottomSheet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidapplication.Activity.PinViewActivity;
import com.example.androidapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDialogStory extends BottomSheetDialogFragment {
    TextView story_BSDS,txt_pin,txt_board;
    private final int PICK_IMAGE_MULTIPLE = 1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_bottom_sheet_dialog_story, container, false);
        story_BSDS = v.findViewById(R.id.story_BSDS);
        txt_pin = v.findViewById(R.id.txt_pin);
        txt_board=v.findViewById(R.id.txt_board);
        story_BSDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDrafting bottomSheetDrafting =new BottomSheetDrafting();
                bottomSheetDrafting.show(getFragmentManager(),"exampleBottomSheet");
            }
        });
        txt_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getContext(), PinViewActivity.class);
                startActivityForResult(intent, PICK_IMAGE_MULTIPLE);


            }
        });
        return v;
    }

}