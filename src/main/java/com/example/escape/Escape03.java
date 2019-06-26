package com.example.escape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Escape03 extends AppCompatActivity

        implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape03);

        findViewById(R.id.send_button).setOnClickListener(this);
    }
    public void onClick (View v){
        Intent intent = new Intent(getApplication(), Next3.class);
        startActivity(intent);
    }
}