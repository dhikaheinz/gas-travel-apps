package com.kyozen.gasstravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.kyozen.gasstravel.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import de.hdodenhof.circleimageview.CircleImageView;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener{

    CircleImageView ig1, ig2, ig3, ig4;
    ImageView fotodiri1, fotodiri2, fotodiri3, fotodiri4, logo_sinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ig1 = findViewById(R.id.ig1);
        ig2 = findViewById(R.id.ig2);
        ig3 = findViewById(R.id.ig3);
        ig4 = findViewById(R.id.ig4);

        fotodiri1 = findViewById(R.id.fotodiri1);
        fotodiri2 = findViewById(R.id.fotodiri2);
        fotodiri3 = findViewById(R.id.fotodiri3);
        fotodiri4 = findViewById(R.id.fotodiri4);
        logo_sinus = findViewById(R.id.logo_sinus);

        ig1.setOnClickListener(this);
        ig2.setOnClickListener(this);
        ig3.setOnClickListener(this);
        ig4.setOnClickListener(this);
        ig4.setOnClickListener(this);
        logo_sinus.setOnClickListener(this);

        Glide.with(this)
                .load("https://i.imgur.com/yy9lLBM.jpg")
                .into(fotodiri1);


        Glide.with(this)
                .load("https://i.imgur.com/Gd8DJYE.jpg")
                .into(fotodiri2);

        Glide.with(this)
                .load("https://i.imgur.com/AB2kNcz.png")
                .into(fotodiri3);

        Glide.with(this)
                .load("https://i.imgur.com/wzOTr7Gb.png")
                .into(fotodiri4);

        Glide.with(this)
                .load("https://i.imgur.com/j9t8u92.png")
                .into(logo_sinus);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ig1:
                Uri ig = Uri.parse("https://instagram.com/dhikaheinz");
                Intent igGas = new Intent(Intent.ACTION_VIEW, ig);
                igGas.setPackage("com.instagram.android");
                startActivity(igGas);
                break;
            case R.id.ig2:
                Uri ig2 = Uri.parse("https://www.instagram.com/sahid_febrianto");
                Intent igGas2 = new Intent(Intent.ACTION_VIEW, ig2);
                igGas2.setPackage("com.instagram.android");
                startActivity(igGas2);
                break;
            case R.id.ig3:
                Uri ig3 = Uri.parse("https://www.instagram.com/03_reffi");
                Intent igGas3 = new Intent(Intent.ACTION_VIEW, ig3);
                igGas3.setPackage("com.instagram.android");
                startActivity(igGas3);
                break;
            case R.id.ig4:
                Uri ig4 = Uri.parse("https://www.instagram.com/abon2saudara");
                Intent igGas4 = new Intent(Intent.ACTION_VIEW, ig4);
                igGas4.setPackage("com.instagram.android");
                startActivity(igGas4);
                break;
            case R.id.logo_sinus:
                Uri logo_sinus = Uri.parse("https://www.sinus.ac.id");
                Intent q = new Intent(Intent.ACTION_VIEW, logo_sinus);
                startActivity(q);
                break;
        }
    }
}
