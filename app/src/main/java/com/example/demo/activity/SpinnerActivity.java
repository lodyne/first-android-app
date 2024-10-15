package com.example.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.demo.R;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Spinner spinner = findViewById(R.id.spinner1);
        Button buttonNext = findViewById(R.id.button11);
        Button buttonPrevious = findViewById(R.id.button10);

        String[] courses = {"C+","Java","Python","Kotlin"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courses);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        buttonPrevious.setOnClickListener(v->{
            Intent intent = new Intent(this,RadioActivity.class);
            startActivity(intent);
        });
        buttonNext.setOnClickListener(v->{
            Intent intent = new Intent(this,TimePickerActivity.class);
            startActivity(intent);
        });

    }
}