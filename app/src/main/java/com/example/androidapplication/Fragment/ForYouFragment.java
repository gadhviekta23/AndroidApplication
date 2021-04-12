package com.example.androidapplication.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidapplication.R;

public class ForYouFragment extends Fragment {
    RecyclerView recyclerview_hometwo;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_for_you, container, false);
//        recyclerview_hometwo = view.findViewById(R.id.recyclerview_hometwo);
//        ArrayList<HomeItem_two> homeItem_twos = new ArrayList<>();
//        homeItem_twos.add(new HomeItem_two(R.drawable.nature1,"this is image",R.drawable.heart,"1k"));
//        homeItem_twos.add(new HomeItem_two(R.drawable.nature2,"nature image is best",R.drawable.heart,"2k"));
//        homeItem_twos.add(new HomeItem_two(R.drawable.nature3,"nature image is the best",R.drawable.heart,"4k"));
//        homeItem_twos.add(new HomeItem_two(R.drawable.nature4,"nature image is the best",R.drawable.heart,"6k"));
//        homeItem_twos.add(new HomeItem_two(R.drawable.nature5,"nature image is the best",R.drawable.heart,"2k"));
//
//        recyclerview_hometwo =new HomeAdapterOne(this,homeItem_twos);
//        recyclerview_hometwo.setLayoutManager(new GridLayoutManager(getApplication(), 2));
//        recyclerview_hometwo.setAdapter(recyclerview_hometwo);
        return view;
    }


}
