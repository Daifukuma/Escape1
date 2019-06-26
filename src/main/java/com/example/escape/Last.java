package com.example.escape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Last extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
    }

    public void onClick2(View view){
        //ここに遷移するための処理を追加する
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
