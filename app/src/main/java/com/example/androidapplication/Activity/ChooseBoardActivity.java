package com.example.androidapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.androidapplication.Adapter.CustomAdapter;
import com.example.androidapplication.R;

public class ChooseBoardActivity extends Activity {
    ListView simpleList;
    String boardList[] = {"Food menu design", "Food design ", "Drink design", "Food poster design", "Create board",};
    int food[] = {R.drawable.topsongs, R.drawable.pandas, R.drawable.rapsong, R.drawable.fashion, R.drawable.ic_plus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_board);

        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), boardList, food);
        simpleList.setAdapter(customAdapter);
    }
}
