package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;



import com.example.myapplication.databinding.ActivityTotalLessonDaoDucBinding;

public class TotalLessonDaoDucActivity extends AppCompatActivity {

    TextView tvTotal ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_total_lesson_dao_duc);
        mapping();
        Intent intent = getIntent();

        int lesson = intent.getIntExtra("ontap",-1);

        if (lesson == 1) {
            tvTotal.setText(getString(R.string.dieu_bac_ho));
        }
    }

    public void mapping(){
        tvTotal = findViewById(R.id.tv_total);
    }

}