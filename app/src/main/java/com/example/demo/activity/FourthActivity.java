package com.example.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.demo.R;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_app);

        Button btn_prev = findViewById(R.id.btn_prev);
        Button btn_nxt = findViewById(R.id.btn_nxt);

        btn_prev.setOnClickListener(v->{
            Intent intent = new Intent(FourthActivity.this,ThirdActivity.class);
            startActivity(intent);
        });

        btn_nxt.setOnClickListener(v->{
            Intent intent = new Intent(FourthActivity.this,CheckBoxActivity.class);
            startActivity(intent);
        });
    }
}