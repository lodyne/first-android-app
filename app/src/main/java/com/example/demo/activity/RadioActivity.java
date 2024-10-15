package com.example.demo.activity;

import static com.example.demo.R.id.radio_button2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.demo.R;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        RadioGroup radioGroup = findViewById(R.id.radio_btn);
        Button btn_next = findViewById(radio_button2);
        Button btn_previous = findViewById(R.id.radio_button1);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(
                        RadioActivity.this,
                        "You have checked "+radioButton.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_next.setOnClickListener(v->{
            Intent intent  = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });
        btn_previous.setOnClickListener(v->{
            Intent intent  = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });

    }
}