package ghost.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ConvertingMoney(View view) {
        Intent intent = new Intent(this, ResultsActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextDollars);
        String message1 = editText.getText().toString();
        intent.putExtra("msg1", message1);
        startActivity(intent);

    }

}
