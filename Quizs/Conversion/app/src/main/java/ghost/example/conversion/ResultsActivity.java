package ghost.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Currency;
import java.util.Scanner;
import java.lang.String;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        String s = (intent.getStringExtra("msg1"));
        double message1 = Double.parseDouble(s);

        TextView tv = (TextView) findViewById(R.id.textViewPoundsEuros);
        tv.setText("British Pound: " + ConvertingPoundsToBritishPounds.usdollarToEuro(message1)
        + " Euros: " + ConvertingPoundsToBritishPounds.usdollarToEuro(message1));


    }
}
