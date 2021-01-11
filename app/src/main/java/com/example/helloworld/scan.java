package com.example.helloworld;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class scan extends AppCompatActivity implements View.OnClickListener {

Button scanBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        scanBtn = findViewById(R.id.scanBtn);
        scanBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        scanCode();
    }

    private void scanCode() {
        Activity activity;
        IntentIntegrator integrator = new IntentIntegrator( this);
        integrator.setCaptureActivity(CaptureAct.class);
        integrator.setOrientationLocked(false);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrator.setPrompt("Scanning Code");
        integrator.initiateScan();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.getContents() != null) {

                Context context;
                AlertDialog.Builder builder = new AlertDialog.Builder( this);
                builder.setMessage(result.getContents());
                builder.setTitle("Scanning Result");


                builder.setPositiveButton( "Scan Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        scanCode();
                    }
                }).setNegativeButton("finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
                if(result.getContents().equals("10")) {
                    openE2();
                    Log.d("Tag1","10");
                } else if(result.getContents().equals("12")) {
                    openE1();
                    Log.d("Tag1","12");
                } else if(result.getContents().equals("25")) {
                    openE3();
                    Log.d("Tag1","25");
                } else {
                    Log.d("Tag1","none");
                }

            }
            else {
                Toast.makeText( this, "No Results", Toast.LENGTH_LONG).show();
            }

        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }




    }

    public void openE1() {
        Intent intent = new Intent(this, Elevator_1.class);
        startActivity(intent);
    }

    public void openE2() {
        Intent intent = new Intent(this, elevator_2.class);
        startActivity(intent);


    }

    public void openE3() {
        Intent intent = new Intent(this, elevator_3.class);
        startActivity(intent);
    }


}