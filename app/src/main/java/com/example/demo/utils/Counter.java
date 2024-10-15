package com.example.demo.utils;

import android.util.Log;

public class Counter {

    static int counter = 0;

    public static String tapOnClick() {
        ++counter;
        String counterText;
        Log.d("MESSAGE", "Counter value: " + counter);

        if (counter == 1){
            counterText = "once";
        } else if (counter == 2) {
            counterText = "twice";
        }
        else{
            counterText = String.format("%d times",counter);
        }
        return counterText;
    }
    public static int increaseCounter() {
        return counter;
    }
}
