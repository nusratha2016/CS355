package com.rguktrkv.satyanandaram.bmicalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.weight);
        et2=(EditText)findViewById(R.id.height);
    }

    public void bmiInKilos(View view) {
        String one=et1.getText().toString();
        String two=et2.getText().toString();
        String msg="";
        double weightInKilograms=Double.parseDouble(one);
        double heightInMeters=Double.parseDouble(two);
        double BMI=(weightInKilograms/(heightInMeters*heightInMeters));
        if(BMI<18.5)
            msg="Underweight";
        else if(BMI>=18.5 && BMI<=24.9)
            msg="Normal";
        else if(BMI>=25&&BMI<=29.9)
            msg="Overweight";
        else msg="Obese";
        Toast.makeText(this,BMI+" : "+msg,Toast.LENGTH_LONG).show();
    }

    public void bmiPounds(View view) {
        String one=et1.getText().toString();
        String two=et2.getText().toString();
        String msg="";
        double weightInPounds=Double.parseDouble(one);
        double heightInInches=Double.parseDouble(two);
        double BMI=((weightInPounds*703)/(heightInInches*heightInInches));
        if(BMI<18.5)
            msg="Underweight";
        else if(BMI>=18.5 && BMI<=24.9)
            msg="Normal";
        else if(BMI>=25&&BMI<=29.9)
            msg="Overweight";
        else msg="Obese";
        Toast.makeText(this,BMI+" : "+msg,Toast.LENGTH_LONG).show();
    }
}
