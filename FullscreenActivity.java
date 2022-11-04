package com.example.xrminev6;

import android.annotation.SuppressLint;

import android.os.Bundle;

import android.view.Menu;
import android.view.View;

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;


public class FullscreenActivity extends AppCompatActivity {

    Button btn_signin, btn_website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        btn_signin = findViewById(R.id.btn_signin);
        btn_website = findViewById(R.id.btn_website);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FullscreenActivity.this, trustline.class));


            }
        });

        btn_website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://www.xrmine.io");
            }
        });
    }


    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}

