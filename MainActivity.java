package com.example.swapandcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e1;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button_check);
        e1 = (EditText) findViewById(R.id.first_string_edit_text);
        e2 = (EditText) findViewById(R.id.second_string_edit_text);
        b.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), MyMessage.class);
            String fir = e1.getText().toString();
            String sec = e2.getText().toString();

            if (fir.equalsIgnoreCase(sec)) {
                i.putExtra("same", "The Same");
                startActivity(i);
            } else {
                i.putExtra("same", "Not The Same");
                startActivity(i);
            }
        });

    }
    public void onSwap (View view) {
        e1 = (EditText) findViewById(R.id.first_string_edit_text);
        e2 = (EditText) findViewById(R.id.second_string_edit_text);
        String getFirstString = String.valueOf(e1.getText());
        String getSecondString = String.valueOf(e2.getText());
        e1.setText(getSecondString);
        e2.setText(getFirstString);
    }
}



