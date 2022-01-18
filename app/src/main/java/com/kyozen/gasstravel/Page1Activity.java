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

import butterknife.BindView;
import butterknife.ButterKnife;

public class Page1Activity extends AppCompatActivity implements View.OnClickListener{

    Button lihat_peta;
    CarouselView carouselView;
    String[] sampleimg = {
            "https://i.imgur.com/1YpDyER.jpg",
            "https://i.imgur.com/NddzVHQ.jpg",
            "https://i.imgur.com/hu6uCnJ.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        lihat_peta = findViewById(R.id.lihat_peta);
        lihat_peta.setOnClickListener(this);

        carouselView = findViewById(R.id.cv);
        carouselView.setPageCount(sampleimg.length);
        carouselView.setImageListener(imageListener);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lihat_peta:
                String googlemaps = "com.google.android.apps.maps";
                String koor = "-8.5891755,119.3325455";
                String loc = "Taman+Nasional+Komodo";

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
