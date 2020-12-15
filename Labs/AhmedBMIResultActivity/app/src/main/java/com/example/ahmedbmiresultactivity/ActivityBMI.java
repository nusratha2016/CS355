package com.example.ahmedbmiresultactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityBMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Intent intent = getIntent();
        String message1 = intent.getStringExtra("msg1");
        String message2 = intent.getStringExtra("msg2");
        String message3 = intent.getStringExtra("msg3");
        TextView tv = ((TextView) findViewById(R.id.textView));
        tv.setText(BMICalculate.Info(message1, message2, message3));
    }
}