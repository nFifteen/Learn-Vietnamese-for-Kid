package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BangCuuChuongActivity extends AppCompatActivity {

    BangCuuChuongAdapter bangCuuChuongAdapter ;
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bang_cuu_chuong);

        recyclerView = findViewById(R.id.rcv_bangcuuchuong);

        bangCuuChuongAdapter = new BangCuuChuongAdapter();
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(bangCuuChuongAdapter);

    }
}