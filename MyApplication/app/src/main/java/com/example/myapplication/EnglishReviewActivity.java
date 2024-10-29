package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.R;

public class EnglishReviewActivity extends AppCompatActivity {


    CardView cardView_alpha ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_review);

        Mapping();

        cardView_alpha.setOnClickListener(view ->{
            Intent intent = new Intent(this, AlphaEnglishReviewActivity.class);
            startActivity(intent);
        });

    }

    private void Mapping() {
        cardView_alpha = findViewById(R.id.cardview_alpha);

    }
}