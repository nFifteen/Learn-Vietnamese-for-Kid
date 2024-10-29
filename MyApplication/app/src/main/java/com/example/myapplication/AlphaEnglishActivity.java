package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifImageView;

public class AlphaEnglishActivity extends AppCompatActivity {
    GridLayout parent_card;
    CardView a,aw,aa,b,c,d,dd,e,ee,g,h,i,k,l,m,n,o,oo,ow,p,q,r,s,t,u,uw,v,x,y;
    MediaPlayer audio_apb;
    GifImageView gif_next, gif_back;
    ImageView img_lesson, img_home;
    //   DBHelper db_content_subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_english);
        mapping();
        setSingleEvent(parent_card);
        //set sự kiện cho home
        img_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(home);
            }
        });

    }


    // set âm thanh cho card view
    private void setSingleEvent(GridLayout parent_card) {
        for (int i = 0; i < parent_card.getChildCount();i++)
        {
            final int indexx = i;
            CardView cardView = (CardView) parent_card.getChildAt(i);
            cardView.setOnClickListener(view -> {
                switch (indexx){
                    case 0:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.a);
                        audio_apb.start();
                        break;
                    case 1:
                        audio_apb= MediaPlayer.create(AlphaEnglishActivity.this,R.raw.b);
                        audio_apb.start();
                        break;
                    case 2:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.c);
                        audio_apb.start();
                        break;
                    case 3:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.d);
                        audio_apb.start();
                        break;
                    case 4:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.e);
                        audio_apb.start();
                        break;
                    case 5:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.f);
                        audio_apb.start();
                        break;
                    case 6:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.g);
                        audio_apb.start();
                        break;
                    case 7:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.h);
                        audio_apb.start();
                        break;
                    case 8:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.i);
                        audio_apb.start();
                        break;
                    case 9:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.j);
                        audio_apb.start();
                        break;
                    case 10:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.k);
                        audio_apb.start();
                        break;
                    case 11:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.l);
                        audio_apb.start();
                        break;
                    case 12:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.m);
                        audio_apb.start();
                        break;
                    case 13:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.n);
                        audio_apb.start();
                        break;
                    case 14:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.o);
                        audio_apb.start();
                        break;
                    case 15:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.p);
                        audio_apb.start();
                        break;
                    case 16:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.q);
                        audio_apb.start();
                        break;
                    case 17:
                        audio_apb= MediaPlayer.create(AlphaEnglishActivity.this,R.raw.r);
                        audio_apb.start();
                        break;
                    case 18:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.s);
                        audio_apb.start();
                        break;
                    case 19:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.t);
                        audio_apb.start();
                        break;
                    case 20:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.u);
                        audio_apb.start();
                        break;
                    case 21:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.v);
                        audio_apb.start();
                        break;
                    case 22:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.w);
                        audio_apb.start();
                        break;
                    case 23:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.x);
                        audio_apb.start();
                        break;
                    case 24:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.y);
                        audio_apb.start();
                        break;
                    case 25:
                        audio_apb = MediaPlayer.create(AlphaEnglishActivity.this,R.raw.z);
                        audio_apb.start();
                        break;
                }
            });
        }
    }


    // ánh xạ
    private void mapping() {
        a = findViewById(R.id.cv_a);
        aw = findViewById(R.id.cv_aw);
        aa = findViewById(R.id.cv_aa);
        b = findViewById(R.id.cv_b);
        c = findViewById(R.id.cv_c);
        d = findViewById(R.id.cv_d);
        dd = findViewById(R.id.cv_dd);
        e = findViewById(R.id.cv_e);
        ee = findViewById(R.id.cv_ee);
        g = findViewById(R.id.cv_g);
        h = findViewById(R.id.cv_h);
        i = findViewById(R.id.cv_i);
        k = findViewById(R.id.cv_k);
        l = findViewById(R.id.cv_l);
        m = findViewById(R.id.cv_m);
        n = findViewById(R.id.cv_n);
        o = findViewById(R.id.cv_o);
        oo = findViewById(R.id.cv_oo);
        ow = findViewById(R.id.cv_ow);
        p = findViewById(R.id.cv_p);
        q = findViewById(R.id.cv_q);
        r = findViewById(R.id.cv_r);
        s = findViewById(R.id.cv_s);
        t = findViewById(R.id.cv_t);
        u = findViewById(R.id.cv_u);
        uw = findViewById(R.id.cv_uw);
        x = findViewById(R.id.cv_x);
        v = findViewById(R.id.cv_v);
        y = findViewById(R.id.cv_y);
        parent_card = findViewById(R.id.parent_card);
        gif_next = (GifImageView) findViewById(R.id.next_gif_apb);
        gif_back = (GifImageView) findViewById(R.id.back_gif_apb);
        img_home = findViewById(R.id.img_home_apb);
    }
}