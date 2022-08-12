package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Mainscreen extends AppCompatActivity implements View.OnClickListener {
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        btn1 = (ImageButton) findViewById(R.id.imageButton);
        btn2 = (ImageButton) findViewById(R.id.imageButton3);
        btn3 = (ImageButton) findViewById(R.id.imageButton4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton:
                Intent intent = new Intent (Mainscreen.this,DailyRoutinePlanner.class);
                startActivity(intent);
                break;
            case R.id.imageButton3:
                Intent intent2 = new Intent (Mainscreen.this,WheelchairLocator.class);
                startActivity(intent2);
                break;

            case R.id.imageButton4:
                Intent intent3 = new Intent (Mainscreen.this,NeedHelp.class);
                startActivity(intent3);
                break;}
    }
}

