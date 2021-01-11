package com.example.helloworld;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.WriterException;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class create extends AppCompatActivity  {

    String Tag = "GeneratorQrCode";
    EditText edittxt;
    ImageView qrimg;
    Button start;
    String inputvalue;
    Bitmap bitmap;
    QRGEncoder qrgEncoder;


    Button scanBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);



        qrimg=(ImageView)findViewById(R.id.qrcode);
        final EditText edttxt = (EditText) findViewById(R.id.edittext);
        start=(Button)findViewById(R.id.createbtn);
        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputvalue=edttxt.getText().toString().trim();
                if(inputvalue.length()>0) {
                    WindowManager manager = (WindowManager)getSystemService(WINDOW_SERVICE);
                    Display display = manager.getDefaultDisplay();
                    Point point=new Point();
                    display.getSize(point);
                    int width=point.x;
                    int height = point.y;
                    int smallerdimension = width<height ? width:height;
                    smallerdimension = smallerdimension*3/4;
                    qrgEncoder = new QRGEncoder(inputvalue, null, QRGContents.Type.TEXT,smallerdimension);
                    try {
                        bitmap=qrgEncoder.encodeAsBitmap();
                        qrimg.setImageBitmap(bitmap);

                    }
                    catch (WriterException e) {

                        Log.v(Tag,e.toString());
                    }

                } else {
                    edttxt.setError("Required");
                }
            }
        });



    }
}