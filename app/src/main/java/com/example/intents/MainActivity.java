package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private SimpleDateFormat simpleDateFormat;
    private TextView currentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonSYNC);
        currentTime = findViewById(R.id.currentTime);
        simpleDateFormat = new SimpleDateFormat("HH", Locale.getDefault());
        int time = Integer.parseInt(simpleDateFormat.format(Calendar.getInstance().getTime()));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SYNC);

                if (time >= 6 && time < 14) {
                    intent.setData(Uri.parse("http://morning"));
                } else if (time >= 14 && time < 15) {
                    intent.setData(Uri.parse("http://afternoon"));
                } else {
                    intent.setData(Uri.parse("http://evening"));
                }
                startActivity(intent);
            }
        });
    }
}
