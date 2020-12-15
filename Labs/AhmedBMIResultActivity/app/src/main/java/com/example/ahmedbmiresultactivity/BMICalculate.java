package com.example.ahmedbmiresultactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;



class BMICalculate {
    public static String Info(String name, String height, String weight) {

        float BMI;
        float wt = Float.parseFloat(weight);
        float ht = Float.parseFloat(height);
        BMI = ((wt * 703) / (ht * ht));
        String msg;

        if (BMI < 18.5) {
            msg = name + " 's BMI report" + " " + "\nYour BMI is " + BMI + "\nConsidered UnderWeight";
        }

        else if (BMI > 18.5 && BMI <= 24.9) {
            msg = name + " 's BMI report" + " " + "\nYour BMI is " + BMI + "\nConsidered Healthy";
        }

        else if (BMI >= 25 && BMI <= 29.9) {
            msg = name + " 's BMI report" + " " + "\nYour BMI is " + BMI + "\nConsidered OverWeight";
        }

        else if (BMI >= 30) {
            msg = name + " 's BMI report" + " " + "\nYour BMI is " + BMI + "\nConsidered Obese";

        }

        else {
            msg = "You didn't put right information.";
        }

        return msg;
    }
}

