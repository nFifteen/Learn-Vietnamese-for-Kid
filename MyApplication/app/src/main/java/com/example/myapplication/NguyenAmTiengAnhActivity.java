package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifImageView;

public class NguyenAmTiengAnhActivity extends AppCompatActivity {
    GifImageView gif_next, gif_back;
    ImageView img_lesson, img_home;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nguyen_am_tieng_anh);

        gif_next = findViewById(R.id.next_gif_na);
        gif_back = findViewById(R.id.back_gif_na);
        img_home = findViewById(R.id.img_home_na);
        img_lesson = findViewById(R.id.img_lesson_na);

        gif_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(NguyenAmTiengAnhActivity.this);
                builder.setMessage("Bé có muốn chuyển sang học phụ âm?");
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent pa = new Intent(getApplicationContext(), PhuAmEnglishActivity.class);
                        startActivity(pa);
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();

            }
        });

        gif_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(NguyenAmTiengAnhActivity.this);
                builder.setMessage("Bé có muốn chuyển sang học bảng chữ cái?");
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent apb = new Intent(getApplicationContext(), AlphaEnglishActivity.class);
                        startActivity(apb);
                    }
                });
                builder.setNegativeButton("Không", (dialogInterface, i) -> {
                });
                builder.show();
            }
        });

        img_home.setOnClickListener(view -> {
            Intent home = new Intent(getApplicationContext(),HomeActivity.class);
            startActivity(home);
        });
        img_lesson.setOnClickListener(view -> {
            Intent lesson = new Intent(getApplicationContext(),EnglishLessonActivity.class);
            startActivity(lesson);
        });
    }
}