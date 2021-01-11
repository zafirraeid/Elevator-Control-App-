package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");

    button = (Button) findViewById(R.id.button);
    button2 = findViewById(R.id.button2);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            opencreate();
        }
    });

    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openscan();
        }
    });
    }

    public void opencreate() {
        Intent intent = new Intent(this, create.class);
        startActivity(intent);
    }

        public void openscan() {
        Intent intent = new Intent(this, scan.class);
        startActivity(intent);
        }



}