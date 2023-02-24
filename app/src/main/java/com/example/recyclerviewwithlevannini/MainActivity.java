package com.example.recyclerviewwithlevannini;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> stringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stringList = new ArrayList<>();

        stringList.add("Aleksandre");
        stringList.add("Mariami");
        stringList.add("Rati");
        stringList.add("Mixeil");
        stringList.add("Nini");
        stringList.add("Gia");
        stringList.add("Levani");
        stringList.add("Eka");
        stringList.add("Koba");
        stringList.add("Nargiza");

        RVAdapter rvAdapter = new RVAdapter(this, stringList);

        recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(rvAdapter);
    }
}