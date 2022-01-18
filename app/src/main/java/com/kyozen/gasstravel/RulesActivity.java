package com.kyozen.gasstravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.kyozen.gasstravel.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class RulesActivity extends AppCompatActivity {

    CarouselView carouselView;
    String[] sampleimg = {
            "https://i.imgur.com/1YpDyER.jpg",
            "https://i.imgur.com/NddzVHQ.jpg",
            "https://i.imgur.com/hu6uCnJ.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        carouselView = findViewById(R.id.cv);
        carouselView.setPageCount(sampleimg.length);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            Glide.with(imageView).load(sampleimg[position]).into(imageView);
        }
    };
}

