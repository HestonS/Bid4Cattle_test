package com.example.admin1.bid4cattle_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class BuyCattle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_cattle);

        ImageView imageHolder = (ImageView)findViewById(R.id.viewImage);
        imageHolder.setImageResource(R.drawable.cow1);

    }


    }

