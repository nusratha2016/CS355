package com.example.ahmedbmiresultactivity;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import java.lang.String;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        protected void onResume() {
            super.onResume();
            setContentView(R.layout.activity_main);
            Log.i(String.valueOf(this), "onResume() callback started");
            Toast toast = Toast.makeText(MainActivity.this, "First:onResume()", Toast.LENGTH_SHORT);
            toast.show();

        }

        public void resultBMI(View view) {
            Intent intent = new Intent(this, ActivityBMI.class);
            EditText editText = (EditText) findViewById(R.id.editText);
            EditText editText2 = (EditText) findViewById(R.id.editText2);
            EditText editText3 = (EditText) findViewById(R.id.editText3);
            String message = editText.getText().toString();
            String message2 = editText2.getText().toString();
            String message3 = editText3.getText().toString();
            intent.putExtra("msg1", message);
            intent.putExtra("msg2", message2);
            intent.putExtra("msg3", message3);
            startActivity(intent);

        }
    }