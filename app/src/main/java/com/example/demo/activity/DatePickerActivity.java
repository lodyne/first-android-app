package com.example.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.demo.R;

public class DatePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        DatePicker datePicker = findViewById(R.id.date_picker);
        Button nextButton = findViewById(R.id.date_button2);
        Button previousButton = findViewById(R.id.date_button1);

        datePicker.setOnDateChangedListener((view, year, monthOfYear, dayOfMonth) -> {
            String month = String.valueOf(monthOfYear + 1);
            Toast.makeText(this,
                    "Year: "+year+ " Month: "+month+ " Day: "+dayOfMonth,
                    Toast.LENGTH_LONG).show();
        });

        nextButton.setOnClickListener(v->{
            Intent intent = new Intent(this,ProgressBarActivity.class);
            startActivity(intent);
        });
        previousButton.setOnClickListener(v->{
            Intent intent = new Intent(this,TimePickerActivity.class);
            startActivity(intent);
        });



    }
}