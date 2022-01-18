package com.kyozen.gasstravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.kyozen.gasstravel.R;

public class InfoAppActivity extends AppCompatActivity{

    ImageView logo_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_app);

        logo_app = findViewById(R.id.logo_app);

        Glide.with(this)
                .load("https://i.imgur.com/SJjhGzq.png")
                .into(logo_app);
    }
}
