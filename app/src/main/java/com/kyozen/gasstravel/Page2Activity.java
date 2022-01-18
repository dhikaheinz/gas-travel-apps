package com.kyozen.gasstravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class Page2Activity extends AppCompatActivity implements View.OnClickListener{

    Button loc_p1;
    CarouselView carouselView;
    String[] sampleimg = {
            "https://i.imgur.com/HuTnAmf.jpg",
            "https://i.imgur.com/zcdddoz.jpg",
            "https://i.imgur.com/GE9tUes.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        loc_p1 = findViewById(R.id.lihat_peta);

        loc_p1.setOnClickListener(this);

        carouselView = findViewById(R.id.cv);
        carouselView.setPageCount(sampleimg.length);
        carouselView.setImageListener(imageListener);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lihat_peta:
                String googlemaps = "com.google.android.apps.maps";
                String koor = "0.1590278,130.0510563";
                String loc = "Raja+Ampat";

                Uri lokasi = Uri.parse("geo:"+koor+"?q="+loc);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, lokasi);
                mapIntent.setPackage(googlemaps);
                startActivity(mapIntent);
        }
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            Glide.with(imageView).load(sampleimg[position]).into(imageView);
        }
    };
}
