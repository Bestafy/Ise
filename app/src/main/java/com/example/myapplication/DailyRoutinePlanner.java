package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DailyRoutinePlanner extends AppCompatActivity implements View.OnClickListener {
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_routine_planner);

        btn1 = findViewById(R.id.imageButton5);
        btn2 = findViewById(R.id.imageButton6);
        btn3 = findViewById(R.id.imageButton7);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton5:
                Intent intent = new Intent (DailyRoutinePlanner.this,StartANewPlan.class);
                startActivity(intent);
                break;
            case R.id.imageButton6:
                Intent intent2 = new Intent (DailyRoutinePlanner.this,CheckTodaysProgress.class);
                startActivity(intent2);
                break;

            case R.id.imageButton7:
                Intent intent3 = new Intent (DailyRoutinePlanner.this,FILLER.class);
                startActivity(intent3);
                break;}
    }
}