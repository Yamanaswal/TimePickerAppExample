package com.example.timepickerappexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView displayTime;
    TimePicker timepicker;
    Button changetime;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timepicker= findViewById(R.id.timepicker);
        // Uncomment the below line of code for 24 hour view
        // timepicker.setIs24HourView(true);
        changetime= findViewById(R.id.changetime);
        displayTime = findViewById(R.id.displayTime);

        displayTime.setText(getCurrentTime());
        changetime.setOnClickListener(this);

    }

    public String getCurrentTime(){
        String currentTime="Current Time: "+timepicker.getCurrentHour()+":"+timepicker.getCurrentMinute();
        return currentTime;
    }

    @Override
    public void onClick(View v) {
        displayTime.setText(getCurrentTime());
    }
}
