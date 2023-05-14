package com.example.swapandcheck;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyMessage extends Activity {

    TextView t;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.second_layout);
        Intent secondActivity = getIntent();
        t = (TextView) findViewById(R.id.msg_text_view);
        String result = secondActivity.getStringExtra("same");
        t.setText(result);
    }
}
