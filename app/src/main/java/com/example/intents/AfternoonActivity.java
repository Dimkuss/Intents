package com.example.intents;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AfternoonActivity extends AppCompatActivity {
    private TextView afternoonTime;
    private SimpleDateFormat simpleDateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);
        simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        afternoonTime = findViewById(R.id.afternoonTime);
        Date dateAfternoon = new Date();
        afternoonTime.setText(simpleDateFormat.format(dateAfternoon));
    }
}
