package com.example.androidapplication.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDialogStory extends BottomSheetDialogFragment {
    private BottomSheetListenerStoty bottomSheetDialogStory;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_bottom_sheet_dialog_story, container, false);
        return v;
    }


    public interface BottomSheetListenerStoty {
        void onButtonClicked(String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            bottomSheetDialogStory = (BottomSheetListenerStoty) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement BottomSheetListener");
        }
    }
}