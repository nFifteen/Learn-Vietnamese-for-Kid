package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EnglishLessonActivity extends AppCompatActivity {

    CardView cardView_alpha, cv_nguyenam, cv_phuam, cv_tu ;
    ImageView ivHome ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_lesson);

        Mapping();

        cardView_alpha.setOnClickListener(view ->{
            Intent intent = new Intent(this, AlphaEnglishActivity.class);
            startActivity(intent);
        });
        cv_nguyenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nguyenam = new Intent(getApplicationContext(),NguyenAmTiengAnhActivity.class);
                startActivity(nguyenam);
            }
        });
        cv_phuam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phuam = new Intent(getApplicationContext(),PhuAmEnglishActivity.class);
                startActivity(phuam);
            }
        });
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(h);
            }
        });


        cv_tu.setOnClickListener(view -> {
            Intent phuam = new Intent(getApplicationContext(),PhuAmEnglishActivity.class);
            startActivity(phuam);
        });
    }

    private void Mapping() {
        cardView_alpha = findViewById(R.id.cardview_alpha);
        cv_nguyenam = findViewById(R.id.cardview_nguyenam);
        cv_phuam = findViewById(R.id.cardview_phuam);
        cv_tu = findViewById(R.id.cardview_tuvung);
        ivHome = findViewById(R.id.img_home_rv);
    }
}