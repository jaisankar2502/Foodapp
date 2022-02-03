package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.adapter.Manicategoryadapter;
import com.example.foodapp.adapter.Subcategoryadapter;
import com.example.foodapp.model.MainList;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        MainList[] mainLists = new MainList[]{
                new MainList("Idli", R.drawable.idli),
                new MainList("Paneer Tikka", R.drawable.paneertikka),
                new MainList("Masala dosa", R.drawable.masaladosa),
                new MainList("Cuisine", R.drawable.cuisine),
                new MainList("Garlic Naan", R.drawable.garlicnaan),
                new MainList("Biriyani", R.drawable.biryani),

        };
        // main view
        RecyclerView manirecyclerview = findViewById(R.id.rv_sub_category);
        Manicategoryadapter mainAdapter = new Manicategoryadapter(mainLists, getBaseContext());
        manirecyclerview.setHasFixedSize(true);
        LinearLayoutManager linerlayout = new LinearLayoutManager(Home.this, LinearLayoutManager.HORIZONTAL, false);
        linerlayout.canScrollVertically();
        manirecyclerview.setLayoutManager(linerlayout);
        manirecyclerview.setAdapter(mainAdapter);
        // subview
        RecyclerView Subrecyclerview = findViewById(R.id.rv_main_category);
        Subcategoryadapter subAdapter = new Subcategoryadapter(mainLists, getBaseContext());
        manirecyclerview.setHasFixedSize(true);
        LinearLayoutManager linerlayout2 = new LinearLayoutManager(Home.this, LinearLayoutManager.HORIZONTAL, false);
        linerlayout.canScrollVertically();
        Subrecyclerview.setLayoutManager(linerlayout2);
        Subrecyclerview.setAdapter(subAdapter);
    }
}