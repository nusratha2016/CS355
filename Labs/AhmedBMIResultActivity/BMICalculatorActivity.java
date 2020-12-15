import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class BMICalculatorActivity extends AppCompatActivity {

    private EditText userHeightField, userWeightField;
    private Button calculateBMIButton;
    private TextView bmiValueTextView, healthMessageTextView;

    private double userHeight, userWeight, calculatedBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        initApp();

        calculateBMIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculateBMIButton.getText().equals("Calculate"))
                {
                    calculateButtonAction();
                }
                else
                {
                    resetAction();
                }
            }
        });
    }

    private void initApp()
    {
        userHeightField = (EditText) findViewById(R.id.user_height_field);
        userWeightField = (EditText) findViewById(R.id.user_weight_field);
        calculateBMIButton = (Button) findViewById(R.id.btn_calculate_bmi);
        bmiValueTextView = (TextView) findViewById(R.id.bmi_value_text_view);
        healthMessageTextView = (TextView) findViewById(R.id.health_message_text_view);
    }

    private double calculateBMI(double height, double weight)
    {
        height = (height) * 0.0254;
        weight = (weight) * 0.453592;
        double bmi = (weight / Math.pow(height, 2));
        return bmi;
    }

    private String healthMessage(double bmi)
    {
        String message = "";
        if(bmi <= 18.5)
        {
            message = "Sorry, you are Underweight!";
        }
        else if(bmi > 18.5 && bmi <= 24.9)
        {
            message = "Congratulation, you are completely Healthy!";
        }
        else if(bmi >= 25 && bmi <= 29.9)
        {
            message = "Sorry, you are Overweight!";
        }
        else if(bmi >= 30)
        {
            message = "Sorry, you are Obese!";
        }
        return message;
    }

    private void calculateButtonAction()
    {
        //take input height and weight from user
        if(TextUtils.isEmpty(userHeightField.getText()) || TextUtils.isEmpty(userWeightField.getText()))
        {
            Toast.makeText(BMICalculatorActivity.this, "All fields are mandatory!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            userHeight = Double.parseDouble(userHeightField.getText().toString() + "");
            userWeight = Double.parseDouble(userWeightField.getText().toString() + "");

            //calculate the BMI
            calculatedBMI = calculateBMI(userHeight, userWeight);

            //set the BMI value to the text view
            bmiValueTextView.setVisibility(View.VISIBLE);
            bmiValueTextView.setText("Your BMI is: " + (String.format("%.1f", calculatedBMI)) + " kg/sq m");

            //set the health message to the text view
            healthMessageTextView.setVisibility(View.VISIBLE);
            healthMessageTextView.setText(healthMessage(calculatedBMI));

            calculateBMIButton.setText("Reset");
        }
    }

    private void resetAction()
    {
        userHeightField.setText("");
        userWeightField.setText("");
        calculateBMIButton.setText("Calculate");
        bmiValueTextView.setVisibility(View.GONE);
        healthMessageTextView.setVisibility(View.GONE);
    }
}
