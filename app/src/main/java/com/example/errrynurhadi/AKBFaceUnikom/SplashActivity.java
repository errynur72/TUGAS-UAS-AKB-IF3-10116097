package com.example.errrynurhadi.AKBFaceUnikom;
//Tanggal pengerjaan : 17-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.errrynurhadi.AKBFaceUnikom.view.TampilanViewPager;

public class SplashActivity extends Activity {

    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mProgress = (ProgressBar) findViewById(R.id.load);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
                finish();
            }
        }).start();
    }

    private void doWork() {
        for (int progress = 0; progress < 100; progress += 100) {
            try {
                Thread.sleep(1000);
                mProgress.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void startApp() {
        Intent intent = new Intent(SplashActivity.this, TampilanViewPager.class);
        startActivity(intent);
    }
}
