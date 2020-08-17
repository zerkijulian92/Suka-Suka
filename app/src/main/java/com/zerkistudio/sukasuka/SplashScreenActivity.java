package com.zerkistudio.sukasuka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashScreenActivity extends AppCompatActivity {

    ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Inisialisasi Code
        mProgress   = (ProgressBar) findViewById(R.id.spash_screen_progress_bar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork(); //Memanggil Function doWork()
                startApp(); //Memanggil Function starApp()
            }
        }).start();
    }

    //Function doWork()
    private void doWork() {
        for (int progress=0; progress<100; progress+=10) {
            try {
                Thread.sleep(500);
                mProgress.setProgress(progress);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //Function starApp()
    private void startApp() {
        startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
    }
}