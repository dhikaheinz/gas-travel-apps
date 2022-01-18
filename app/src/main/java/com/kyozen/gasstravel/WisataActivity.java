package com.kyozen.gasstravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import com.kyozen.gasstravel.R;

public class WisataActivity extends AppCompatActivity implements View.OnClickListener{

    CardView w1, w2, w3, w4, w5, w6, w7, w8, w9, w10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        w1 = findViewById(R.id.wisata1);
        w2 = findViewById(R.id.wisata2);
        w3 = findViewById(R.id.wisata3);
        w4 = findViewById(R.id.wisata4);
        w5 = findViewById(R.id.wisata5);
        w6 = findViewById(R.id.wisata6);
        w7 = findViewById(R.id.wisata7);
        w8 = findViewById(R.id.wisata8);
        w9 = findViewById(R.id.wisata9);
        w10 = findViewById(R.id.wisata10);

        w1.setOnClickListener(this);
        w2.setOnClickListener(this);
        w3.setOnClickListener(this);
        w4.setOnClickListener(this);
        w5.setOnClickListener(this);
        w6.setOnClickListener(this);
        w7.setOnClickListener(this);
        w8.setOnClickListener(this);
        w9.setOnClickListener(this);
        w10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wisata1:
                Intent b = new Intent(WisataActivity.this, Page1Activity.class);
                startActivity(b);
                break;
            case R.id.wisata2:
                Intent c = new Intent(WisataActivity.this, Page2Activity.class);
                startActivity(c);
                break;
            case R.id.wisata3:
                Intent d = new Intent(WisataActivity.this, Page3Activity.class);
                startActivity(d);
                break;
            case R.id.wisata4:
                Intent e = new Intent(WisataActivity.this, Page4Activity.class);
                startActivity(e);
                break;
            case R.id.wisata5:
                Intent f = new Intent(WisataActivity.this, Page5Activity.class);
                startActivity(f);
                break;
            case R.id.wisata6:
                Intent g = new Intent(WisataActivity.this, Page6Activity.class);
                startActivity(g);
                break;
            case R.id.wisata7:
                Intent h = new Intent(WisataActivity.this, Page7Activity.class);
                startActivity(h);
                break;
            case R.id.wisata8:
                Intent i = new Intent(WisataActivity.this, Page8Activity.class);
                startActivity(i);
                break;
            case R.id.wisata9:
                Intent j = new Intent(WisataActivity.this, Page9Activity.class);
                startActivity(j);
                break;
            case R.id.wisata10:
                Intent k = new Intent(WisataActivity.this, Page10Activity.class);
                startActivity(k);
                break;
        }
    }
}
