package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ExceriseMathActivity extends AppCompatActivity {


    TextView tvNum1, tvNum2, tvSign;
    Button btnTraLoi;
    EditText editResult;
    int result, number1, number2;
    Random random1, random2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excerise_math);
        Mapping();
        Intent intent = getIntent();

        int type = intent.getIntExtra("baitap", -1);

        random1 = new Random();
        random2 = new Random();

        number1 = random1.nextInt(1000) + 100;
        number2 = random2.nextInt(100) + 10;



        if (type == 1) {
            tvSign.setText("+");
            result = number1 + number2;
            tvNum1.setText(String.valueOf(number1));
            tvNum2.setText(String.valueOf(number2));
        } else if (type == 2) {
            tvSign.setText("-");
            result = number1 + number2;
            tvNum1.setText(String.valueOf(number1));
            tvNum2.setText(String.valueOf(number2));
        } else if (type == 3) {
            tvSign.setText("*");
            result = number1 + number2;
            tvNum1.setText(String.valueOf(number1));
            tvNum2.setText(String.valueOf(number2));
        } else {
            tvSign.setText("/");


            number1 = random1.nextInt(1000) + 10;
            int temp = random2.nextInt(10)+ 1 ;
            number2 = number1 * temp;
            result = number2 / number1;

            System.out.println("number1 = " + number1 + " , number2 = " + number2 +" = "+(number2/number1));

            tvNum1.setText(String.valueOf(number2));
            tvNum2.setText(String.valueOf(number1));

        }

        btnTraLoi.setOnClickListener(view -> {
            int result1 = Integer.parseInt(editResult.getText().toString().trim());
            if (result1 == result) {
                Toast.makeText(this, "Bạn đã trả lời đúng", Toast.LENGTH_SHORT).show();

                random1 = new Random();
                random2 = new Random();
                if (type == 3) {
                    number1 = random1.nextInt(100) + 10;
                    number2 = random2.nextInt(100) + 10;
                    tvNum1.setText(String.valueOf(number1));
                    tvNum2.setText(String.valueOf(number2));
                } else if (type == 4) {
                    number1 = random1.nextInt(1000) + 10;
                    int temp = random2.nextInt(10) + 10;
                    number2 = number1 * temp;
                    tvNum1.setText(String.valueOf(number2));
                    tvNum2.setText(String.valueOf(number1));
                    System.out.println("number1 = " + number1 + " , number2 = " + number2 +" = "+(number2/number1));
                } else {
                    number1 = random1.nextInt(1000) + 100;
                    number2 = random2.nextInt(100) + 10;
                    tvNum1.setText(String.valueOf(number1));
                    tvNum2.setText(String.valueOf(number2));
                }

                if (type == 1) {
                    tvSign.setText("+");
                    result = number1 + number2;
                } else if (type == 2) {
                    tvSign.setText("-");
                    result = number1 - number2;
                } else if (type == 3) {
                    tvSign.setText("*");
                    result = number1 * number2;
                } else {
                    tvSign.setText("/");
                    result = number2 / number1;
                }
                editResult.setText("");

            } else {
                Toast.makeText(this, "Vui lòng trả lời lại cho đúng", Toast.LENGTH_SHORT).show();
                editResult.setText("");
            }

        });


    }

    private void Mapping() {
        tvNum1 = findViewById(R.id.tv_number_1);
        tvNum2 = findViewById(R.id.tv_number_2);
        tvSign = findViewById(R.id.tv_signal);
        btnTraLoi = findViewById(R.id.btn_tra_loi);
        editResult = findViewById(R.id.edt_result);
    }
}