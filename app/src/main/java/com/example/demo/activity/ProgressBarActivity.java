package com.example.demo.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.demo.R;

public class ProgressBarActivity extends AppCompatActivity {

    int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);


        ProgressBar progressBar = findViewById(R.id.progress);
        Button button = findViewById(R.id.progress_btn);

        button.setOnClickListener(v->{
            progress = progress + 10;

            progressBar.setProgress(progress);

            Toast.makeText(
                    this,
                    "Imefika Asilimia "+progress+"%",
                    Toast.LENGTH_SHORT).show();
        });

    }
}