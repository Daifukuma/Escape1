package com.example.escape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.content.Intent;

public class Loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        long countNumber =4500;
        long interval = 20;

        final CountDown countDown = new CountDown(countNumber, interval);
        countDown.start();
    }


    class CountDown extends CountDownTimer {

        CountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            Intent intent = new Intent(Loading.this,Escape01.class);
            startActivity(intent);
        }

        // インターバルで呼ばれる
        @Override
        public void onTick(long millisUntilFinished) {
        }
    }
}

