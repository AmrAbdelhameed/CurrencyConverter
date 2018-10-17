package com.example.alaa.converterdollaregyptionpound;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText numUS, numEgypt;
    Button convert, clearAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numUS = findViewById(R.id.numUS);
        numEgypt = findViewById(R.id.numEgypt);

        convert = findViewById(R.id.convert);
        clearAll = findViewById(R.id.clearAll);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUs = numUS.getText().toString(), strEgypt = numEgypt.getText().toString();
                if (strUs.isEmpty() && strEgypt.isEmpty())
                    Toast.makeText(MainActivity.this, "Invalid data - try again", Toast.LENGTH_SHORT).show();
                else if (strUs.isEmpty()) {
                    double ans = Double.parseDouble(strEgypt) / 17.91;
                    numUS.setText(String.valueOf(ans));
                } else {
                    double ans = Double.parseDouble(strUs) * 17.91;
                    numEgypt.setText(String.valueOf(ans));
                }
            }
        });

        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numUS.setText("");
                numEgypt.setText("");
            }
        });
    }
}