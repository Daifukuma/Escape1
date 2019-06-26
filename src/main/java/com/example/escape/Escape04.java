package com.example.escape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Escape04 extends AppCompatActivity

        implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape04);

        findViewById(R.id.send_button).setOnClickListener(this);
    }
    public void onClick (View v){
        Intent intent = new Intent(getApplication(), Last.class);
        startActivity(intent);
    }
}