package com.example.demo.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demo.R;
import  com.example.demo.utils.Counter;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView textView1 = findViewById(R.id.textView1);

        ImageView myImage = findViewById(R.id.imageView);
        myImage.setImageResource(R.mipmap.ic_launcher);


        button1.setText(R.string.click_here);
        button2.setText(R.string.next);

//        Use lambda function
//        button1.setOnClickListener(v -> Counter.tapOnClick());

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sms = Counter.tapOnClick();
                int value = Counter.increaseCounter();

                /*The method String.valueOf(int i) is used
                 to convert an integer (or other types) to
                 its corresponding String representation.
                 */
                textView1.setText(String.valueOf(value));

//                Convert integer to String using concatenation
//                textView1.setText(""+value);

                Toast.makeText(MainActivity.this,"You have clicked " +sms , Toast.LENGTH_SHORT).show();

            }
        });

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        });
    }
}

