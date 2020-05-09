package com.example.falsephonevideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        if(getIntent().getData() != null)
        {
            textView.setText(getIntent().getData().toString());
        }
        else {
            textView.setText("No data received");
        }
    }
}
