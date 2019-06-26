package com.example.escape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.content.Intent;

public class Next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        long countNumber =1600;
        long interval = 160;

        final CountDown countDown = new CountDown(countNumber, interval);
        countDown.start();
    }


    class CountDown extends CountDownTimer {

        CountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            Intent intent = new Intent(Next.this,Escape02.class);
            startActivity(intent);
        }

        // インターバルで呼ばれる
        @Override
        public void onTick(long millisUntilFinished) {
        }
    }
}

