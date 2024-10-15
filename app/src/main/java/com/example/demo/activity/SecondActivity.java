package com.example.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demo.R;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button button = findViewById(R.id.button_first);
        Button button3 = findViewById(R.id.button3);
        Button btn_click = findViewById(R.id.btn_click);
        EditText editText = findViewById(R.id.editext_first);

        button.setText(R.string.next);
        button3.setText(R.string.previous);

        button.setOnClickListener(v->{
            Intent intent =new Intent(this, ThirdActivity.class);
            startActivity(intent);
        });

        button3.setOnClickListener(v->{
            Intent intent =new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        btn_click.setOnClickListener(v->{
            String putText = editText.getText().toString();
            Toast.makeText(SecondActivity.this,"Oyaaa "+putText+ " , say Hello",Toast.LENGTH_SHORT).show();
        });
    }
}
