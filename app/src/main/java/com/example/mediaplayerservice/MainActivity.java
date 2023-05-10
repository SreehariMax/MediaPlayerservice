package com.example.mediaplayerservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button str,stp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str = findViewById(R.id.strbn);
        stp = findViewById(R.id.stopbn);


        stp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    stopService(new Intent(getApplicationContext(), MPService.class));
                    Toast.makeText(MainActivity.this, "service stopped", Toast.LENGTH_SHORT).show();

            }
        });

        str.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == str){

                    startService(new Intent(getApplicationContext(),MPService.class));

                    Toast.makeText(MainActivity.this, "Service Started", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}