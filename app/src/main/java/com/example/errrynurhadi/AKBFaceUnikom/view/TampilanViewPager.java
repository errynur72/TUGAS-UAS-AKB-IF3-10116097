package com.example.errrynurhadi.AKBFaceUnikom.view;
//Tanggal pengerjaan : 20-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.errrynurhadi.AKBFaceUnikom.MainActivity;
import com.example.errrynurhadi.AKBFaceUnikom.R;
import com.example.errrynurhadi.AKBFaceUnikom.presenter.CustomAdapterViewPager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class TampilanViewPager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager bn = (ViewPager) findViewById(R.id.viewpager);
        bn.setAdapter(new CustomAdapterViewPager(this));


    }
    //memenggil tombol
    public void tombolmulai(View view)
    {
        Intent intent = new Intent(TampilanViewPager.this, MainActivity.class);
        startActivity(intent);
    }


}