package com.example.xrminev6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


public class trustline extends AppCompatActivity {

    Button btn_tkn_whitepaper,btn_tkn_mine, btn_tkn2_whitepaper, btn_tkn2_trustline, btn_tkn3_whitepaper, btn_tkn3_trustline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trustline);

        btn_tkn_whitepaper = findViewById(R.id.btn_tkn_whitepaper);
        btn_tkn_mine = findViewById(R.id.btn_tkn_mine);
        btn_tkn2_whitepaper = findViewById(R.id.btn_tkn2_whitepaper);
        btn_tkn2_trustline = findViewById(R.id.btn_tkn2_trustline);
        btn_tkn3_whitepaper = findViewById(R.id.btn_tkn3_whitepaper);
        btn_tkn3_trustline = findViewById(R.id.btn_tkn3_trustline);

        btn_tkn_whitepaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                golink("https://xrmine.io/whitepaper");
            }

        });

        btn_tkn_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.mine);
            }
        });

        btn_tkn2_whitepaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://onxrp.com/wp-content/uploads/2022/04/onxrp_whitepaper_1.1-2.pdf");
            }
        });

        btn_tkn2_trustline.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://xrpl.services/?issuer=rrno7Nj4RkFJLzC4nRaZiLF5aHwcTVon3d&currency=OXP&limit=250000000");
            }
        }));

        btn_tkn3_whitepaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://xspectar.gitbook.io/xspectar-whitepaper-v2/");
            }
        });

        btn_tkn3_trustline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://xrpl.services/?issuer=rh5jzTCdMRCVjQ7LT6zucjezC47KATkuvv&currency=xSPECTAR&limit=88888888");
            }
        });
    }

    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));

    }
}