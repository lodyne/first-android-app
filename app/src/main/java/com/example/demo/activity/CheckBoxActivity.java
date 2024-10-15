package com.example.demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.demo.R;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        Button btn_next = findViewById(R.id.btn51);
        Button btn_prev = findViewById(R.id.btn50);

        CheckBox checkBox1 = findViewById(R.id.checkbox1);
        CheckBox checkBox2 = findViewById(R.id.checkbox2);
        CheckBox checkBox3 = findViewById(R.id.checkbox3);
        CheckBox checkBox4 = findViewById(R.id.checkbox4);


        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(CheckBoxActivity.this,"Man United is selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CheckBoxActivity.this,"Man United is not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(CheckBoxActivity.this,"Arsenal is selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CheckBoxActivity.this,"Arsenal is not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(CheckBoxActivity.this,"Man City is selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CheckBoxActivity.this,"Man City is not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(CheckBoxActivity.this,"Liverpool is selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CheckBoxActivity.this,"Liverpool is not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_next.setOnClickListener(v->{
            Intent intent = new Intent(CheckBoxActivity.this,RadioActivity.class);
            startActivity(intent);
        });
        btn_prev.setOnClickListener(v->{
            Intent intent = new Intent(CheckBoxActivity.this,FourthActivity.class);
            startActivity(intent);
        });



    }
}