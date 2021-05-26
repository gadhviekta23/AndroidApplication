package com.example.androidapplication.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;

import com.example.androidapplication.Activity.SettingActivity;
import com.example.androidapplication.R;

public class ProfileFragment extends Fragment implements View.OnClickListener {
    ImageView setting_PF;
    View view;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view= inflater.inflate(R.layout.fragment_profile, container, false);

        setting_PF = view.findViewById(R.id.setting_PF);
        setting_PF.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setting_PF:
                Intent intent = new Intent(getContext(), SettingActivity.class);
                startActivity(intent);
                break;
        }
    }
}
