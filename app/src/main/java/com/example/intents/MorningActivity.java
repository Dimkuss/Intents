package com.example.intents;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MorningActivity extends AppCompatActivity {
    private TextView morningTime;
    private SimpleDateFormat simpleDateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        morningTime = findViewById(R.id.morningTime);
        Date dateMorning = new Date();
        morningTime.setText(simpleDateFormat.format(dateMorning));
    }
}
