package com.example.errrynurhadi.AKBFaceUnikom;
//Tanggal pengerjaan : 19-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class DetailSeluruhTemanActivity extends AppCompatActivity {
    //VIEWS
    ImageView img;
    TextView tnimTxt, tnamaTxt, tkelasTxt, tteleponTxt, ttemailTxt, ttsosmedTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seluruh_teman);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setSupportActionBar(toolbar);
        //Your toolbar is now an action bar and you can use it like you always do, for example:
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //RECEIVE OUR DATA
        Intent i = getIntent();

        final String kdnim = i.getExtras().getString("Nim");
        final String kdnama = i.getExtras().getString("Nama");
        final String kdkelas = i.getExtras().getString("Kelas");
        final String kdtelp = i.getExtras().getString("Telepon");
        final String kdemail = i.getExtras().getString("Email");
        final String kdsosmed = i.getExtras().getString("Sosmed");
        final int images = i.getExtras().getInt("Images");

        //REFERENCE VIEWS FROM XML
        tnimTxt = (TextView) findViewById(R.id.namaST);
        tnamaTxt = (TextView) findViewById(R.id.nimST);
        tkelasTxt = (TextView) findViewById(R.id.kelasST);
        tteleponTxt = (TextView) findViewById(R.id.telpST);
        ttemailTxt = (TextView) findViewById(R.id.emailST);
        ttsosmedTxt = (TextView) findViewById(R.id.sosmedST);
        img = (ImageView) findViewById(R.id.gambarST);

        //ASSIGN DATA TO THOSE VIEWS
        tnimTxt.setText(kdnim);
        tnamaTxt.setText(kdnama);
        tkelasTxt.setText(kdkelas);
        tteleponTxt.setText(kdtelp);
        ttemailTxt.setText(kdemail);
        ttsosmedTxt.setText(kdsosmed);
        img.setImageResource(images);
    }
}