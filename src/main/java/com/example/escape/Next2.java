package com.example.escape;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Next2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        long countNumber =1500;
        long interval = 170;

        final CountDown countDown = new CountDown(countNumber, interval);
        countDown.start();
    }


    class CountDown extends CountDownTimer {

        CountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            Intent intent = new Intent(Next2.this,Escape03.class);
            startActivity(intent);
        }

        // インターバルで呼ばれる
        @Override
        public void onTick(long millisUntilFinished) {
        }
    }
}

