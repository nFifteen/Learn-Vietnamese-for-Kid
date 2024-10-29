package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class ReviewMathActivity extends AppCompatActivity {


    CardView cv_cuuchuong ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_math);
        mapping();

        cv_cuuchuong.setOnClickListener(view ->{
            Intent intent = new Intent(this, BangCuuChuongActivity.class);
            startActivity(intent);
        });

    }

    public void mapping() {
        cv_cuuchuong = findViewById(R.id.cardview_bangcuuchuong);
    }
}