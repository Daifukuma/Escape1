package com.example.escape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Escape02 extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape02);

        findViewById(R.id.imageButton2).setOnClickListener(this);  //リスナーをボタンに登録

    }

    public void onClick(View view){
        //ここに遷移するための処理を追加する
        Intent intent = new Intent(this, Next2.class);
        startActivity(intent);
    }
    public void onClick2(View view){
        //ここに遷移するための処理を追加する
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
