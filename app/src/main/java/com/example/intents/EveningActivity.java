package com.example.intents;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EveningActivity extends AppCompatActivity {
    private TextView eveningTime;
    private SimpleDateFormat simpleDateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);
        simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        eveningTime = findViewById(R.id.eveningTime);
        Date dateEvening = new Date();
        eveningTime.setText(simpleDateFormat.format(dateEvening));
    }
}
