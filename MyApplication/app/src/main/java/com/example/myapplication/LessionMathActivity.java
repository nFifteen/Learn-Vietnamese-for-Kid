package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class LessionMathActivity extends AppCompatActivity {


    CardView cv_cong, cv_tru, cv_nhan, cv_chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_math);
        Mapping();

        cv_cong.setOnClickListener(view ->{
            Intent intent = new Intent(this, ExceriseMathActivity.class);
            intent.putExtra("baitap", 1);

            startActivity(intent);
        });
        cv_tru.setOnClickListener(view ->{
            Intent intent = new Intent(this, ExceriseMathActivity.class);
            intent.putExtra("baitap", 2);

            startActivity(intent);
        });
        cv_nhan.setOnClickListener(view ->{
            Intent intent = new Intent(this, ExceriseMathActivity.class);
            intent.putExtra("baitap", 3);

            startActivity(intent);
        });
        cv_chia.setOnClickListener(view ->{
            Intent intent = new Intent(this, ExceriseMathActivity.class);
            intent.putExtra("baitap", 4);

            startActivity(intent);
        });
    }

    private void Mapping() {
        cv_cong = findViewById(R.id.cardview_cong);
        cv_tru = findViewById(R.id.cardview_tru);
        cv_nhan = findViewById(R.id.cardview_nhan);
        cv_chia = findViewById(R.id.cardview_chia);

    }
}