package com.kyozen.gasstravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    CardView pageWisata, pagePeraturan, pageInfo, pageTips;
    ImageView info;
    ImageView imglogo;
    CarouselView carouselView;
    int[] sampleimg = {
            R.drawable.thumb1,
            R.drawable.thumb6,
            R.drawable.thumb8,
            R.drawable.thumb3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        info = findViewById(R.id.info);
        pageWisata = findViewById(R.id.wisata);
        pagePeraturan = findViewById(R.id.peraturan);
        pageInfo = findViewById(R.id.infoAplikasi);
        pageTips = findViewById(R.id.tipsBerwisata);
        imglogo = findViewById(R.id.imglogo);

        info.setOnClickListener(this);
        pageWisata.setOnClickListener(this);
        pagePeraturan.setOnClickListener(this);
        pageInfo.setOnClickListener(this);
        pageTips.setOnClickListener(this);

        carouselView = findViewById(R.id.cv);
        carouselView.setPageCount(sampleimg.length);
        carouselView.setImageListener(imageListener);

        Glide.with(this)
                .load("https://i.imgur.com/JVFBUNY.png")
                .into(imglogo);
    }

    @Override
    public void onClick(View v) {
        if (v==info){
            Intent a = new Intent(HomeActivity.this, InfoActivity.class);
            startActivity(a);
        }
        else if(v==pageWisata){
            Intent b = new Intent(HomeActivity.this, WisataActivity.class);
            startActivity(b);
        }
        else if (v==pagePeraturan){
            Intent c = new Intent(HomeActivity.this, RulesActivity.class);
            startActivity(c);
        }
        else if (v==pageInfo){
            Intent d = new Intent(HomeActivity.this, InfoAppActivity.class);
            startActivity(d);
        }
        else if (v==pageTips){
            Intent e = new Intent(HomeActivity.this, TipsActivity.class);
            startActivity(e);
        }
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            Glide.with(imageView).load(sampleimg[position]).into(imageView);
        }
    };
}
