package com.example.crickettemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText no_chirps;
    TextView dis_txt;
    Button btn;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no_chirps = findViewById(R.id.no_chirps);
        btn = findViewById(R.id.btn);
        dis_txt = findViewById(R.id.dis_txt);

        dis_txt.setVisibility(View.GONE);

        formatter = new DecimalFormat("#0.00");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(no_chirps.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int number = Integer.parseInt(no_chirps.getText().toString().trim());

                    double temperature = (number/3)+4;

                    String results = "The approximate temperature outside is" + formatter.format(temperature) +
                            "degrees Celcius";

                    dis_txt.setText(results);
                    dis_txt.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
