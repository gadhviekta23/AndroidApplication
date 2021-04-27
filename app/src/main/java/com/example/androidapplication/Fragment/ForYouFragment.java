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

        //video1
        video1=view.findViewById(R.id.video1);
        String uriPath1 = "android.resource://com.example.androidapplication/"+R.raw.videoone;
        Uri uri1 = Uri.parse(uriPath1);
        video1.setVideoURI(uri1);
        video1.requestFocus();
        video1.start();

        //video2
        video2=view.findViewById(R.id.video2);
        String uriPath2 = "android.resource://com.example.androidapplication/"+R.raw.videotwo;
        Uri uri2 = Uri.parse(uriPath2);
        video2.setVideoURI(uri2);
        video2.requestFocus();
        video2.start();

        //video3
        video3=view.findViewById(R.id.video3);
        String uriPath3 = "android.resource://com.example.androidapplication/"+R.raw.videoone;
        Uri uri3 = Uri.parse(uriPath3);
        video3.setVideoURI(uri3);
        video3.requestFocus();
        video3.start();

        //video4
        video4=view.findViewById(R.id.video4);
        String uriPath4 = "android.resource://com.example.androidapplication/"+R.raw.videotwo;
        Uri uri4 = Uri.parse(uriPath4);
        video4.setVideoURI(uri4);
        video4.requestFocus();
        video4.start();

//        recyclerview_hometwo = view.findViewById(R.id.recyclerview_hometwo);
//        ArrayList<HomeItem_two> homeItem_twos = new ArrayList<>();
//        homeItem_twos.add(new HomeItem_two(R.raw.videoone,"this is image",R.drawable.heart,"1k",R.drawable.dot));
//        homeItem_twos.add(new HomeItem_two(R.raw.videotwo,"nature image is best",R.drawable.heart,"2k",R.drawable.dot));
//        homeItem_twos.add(new HomeItem_two(R.raw.videothree,"nature image is the best",R.drawable.heart,"4k",R.drawable.dot));
//        homeItem_twos.add(new HomeItem_two(R.raw.videotwo,"nature image is the best",R.drawable.heart,"6k",R.drawable.dot));
//        homeItem_twos.add(new HomeItem_two(R.raw.videothree,"nature image is the best",R.drawable.heart,"2k",R.drawable.dot));
//        homeItem_twos.add(new HomeItem_two(R.raw.videoone,"this is image",R.drawable.heart,"1k",R.drawable.dot));

//        HomeAdapterOne homeAdapterOne = new HomeAdapterOne(getContext(),homeItem_twos);
//        recyclerview_hometwo.setLayoutManager(new GridLayoutManager(getContext(), 2));
//        recyclerview_hometwo.setAdapter(homeAdapterOne);
        return view;
    }


}
