package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PaysAdapter paysAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<PaysS> paysList = new ArrayList<>();
        paysList.add(new PaysS("Palestine","Al-Quods"));
        paysList.add(new PaysS("Morocco","Rabat"));
        paysList.add(new PaysS("Qatar","Doha"));
        paysList.add(new PaysS("Korea","Busan"));
        paysList.add(new PaysS("Japan","Tokyo"));

        paysAdapter = new PaysAdapter(paysList);
        recyclerView.setAdapter(paysAdapter);
    }
}