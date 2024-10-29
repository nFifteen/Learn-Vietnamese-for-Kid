package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class ReviewDaoDucActivity extends AppCompatActivity {

    CardView cv_daoduc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_dao_duc);
        Mapping();

        cv_daoduc.setOnClickListener(view -> {
            Intent intent = new Intent(this, TotalLessonDaoDucActivity.class);
            intent.putExtra("ontap", 1);
            startActivity(intent);
        });
    }

    private void Mapping() {
        cv_daoduc = findViewById(R.id.cardview_dieubachoday);
    }
}