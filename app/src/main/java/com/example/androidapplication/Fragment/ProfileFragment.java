package com.example.androidapplication.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.androidapplication.Activity.ProfileActivity;
import com.example.androidapplication.Activity.SettingActivity;
import com.example.androidapplication.Adapter.HomeAdapterOne;
import com.example.androidapplication.Adapter.ProfileFragmentAdapter;
import com.example.androidapplication.Model.HomeItem_two;
import com.example.androidapplication.Model.StoryItem;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class ProfileFragment extends Fragment implements View.OnClickListener {
    ImageView setting_PF, account;
    View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_profile, container, false);

        setting_PF = view.findViewById(R.id.setting_PF);
        account = view.findViewById(R.id.account);
        setting_PF.setOnClickListener(this);
        account.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.setting_PF:
                Intent intent = new Intent(getContext(), SettingActivity.class);
                startActivity(intent);
                break;
            case R.id.account:
                Intent i = new Intent(getContext(), ProfileActivity.class);
                startActivity(i);
                break;
        }
    }
}
