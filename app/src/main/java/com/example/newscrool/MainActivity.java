package com.example.newscrool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<itemsModel> dataItem;
    private ArrayList<itemsModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_app);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        data = new ArrayList<>();
        for (int i = 0; i < Items.appName.length; i++) {
            data.add(new itemsModel(
                    Items.appName[i],
                    Items.description[i],
                    Items.iconList[i]
            ));

        }
        mAdapter = new mAdapter(data);
        recyclerView.setAdapter(mAdapter);
    }
}