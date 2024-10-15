package com.example.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.demo.R;
import com.example.demo.utils.Conversion;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button mypreviousButton = findViewById(R.id.button_2);
        Button myNextButton = findViewById(R.id.button_next);
        EditText editText = findViewById(R.id.editText1);
        Button clickMeButton = findViewById(R.id.button_third);

        mypreviousButton.setOnClickListener(v -> {
            Toast.makeText(ThirdActivity.this, "Click Me to return Back",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        myNextButton.setOnClickListener(v->{
            Intent intent = new Intent(ThirdActivity.this,FourthActivity.class);
            startActivity(intent);
        });

        clickMeButton.setOnClickListener(v->{
            String putText = editText.getText().toString();
            float gram = Float.parseFloat(putText);
            String kg = String.valueOf(Conversion.convertKgToGram(gram));
            Toast.makeText(ThirdActivity.this,"Gram "+putText+ " = Kilogram "+kg,Toast.LENGTH_LONG).show();

        });

    }
}