package com.example.androidapplication.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.androidapplication.Adapter.HomeAdapterOne;
import com.example.androidapplication.Model.HomeItem_two;
import com.example.androidapplication.R;

import java.util.ArrayList;

public class ForYouFragment extends Fragment {
    RecyclerView recyclerview_hometwo;
    View view;
    VideoView video1,video2,video3,video4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_for_you, container, false);

        recyclerview_hometwo = view.findViewById(R.id.recyclerview_hometwo);
        ArrayList<HomeItem_two> homeItem_twos = new ArrayList<>();
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videotwo,"this is image",R.drawable.heart,"1k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videotwo,"nature image is best",R.drawable.heart,"2k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videothree,"nature image is the best",R.drawable.heart,"4k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videoone,"nature image is the best",R.drawable.heart,"6k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videothree,"nature image is the best",R.drawable.heart,"2k",R.drawable.dot));
        homeItem_twos.add(new HomeItem_two("android.resource://com.example.androidapplication/"+R.raw.videotwo,"this is image",R.drawable.heart,"1k",R.drawable.dot));

        HomeAdapterOne homeAdapterOne = new HomeAdapterOne(getContext(),homeItem_twos);
//        recyclerview_hometwo.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerview_hometwo.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerview_hometwo.setAdapter(homeAdapterOne);
        return view;
    }


}
