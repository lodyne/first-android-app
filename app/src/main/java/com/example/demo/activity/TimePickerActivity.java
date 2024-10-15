package com.example.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.demo.R;

public class TimePickerActivity extends AppCompatActivity {

    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timePicker = findViewById(R.id.timepicker1);

        Button nextButton = findViewById(R.id.time_btn2);
        Button previousButton = findViewById(R.id.time_btn1);

//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//
//            }
//        });

        timePicker.setOnTimeChangedListener((view, hourOfDay, minute) -> {
            Toast.makeText(this,"Hour "+hourOfDay+" Minute "+minute, Toast.LENGTH_LONG).show();

        });

        nextButton.setOnClickListener(v->{
            Intent intent = new Intent(this,DatePickerActivity.class);
            startActivity(intent);
        });
        previousButton.setOnClickListener(v->{
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });

    }
}