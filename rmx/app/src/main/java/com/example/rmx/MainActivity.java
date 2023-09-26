package com.example.rmx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2, editText3;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.etN1);
        editText2 = findViewById(R.id.etN2);
        editText3 = findViewById(R.id.etN3);
        resultTextView = findViewById(R.id.tvMayor);
    }

    public void findLargestNumber(View view) {
        String input1 = editText1.getText().toString();
        String input2 = editText2.getText().toString();
        String input3 = editText3.getText().toString();

        if (input1.isEmpty() || input2.isEmpty() || input3.isEmpty()) {
            // Si alguno de los campos está vacío, muestra un mensaje de error.
            Toast.makeText(this, "Todos los campos son requeridos", Toast.LENGTH_SHORT).show();
        } else {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            int num3 = Integer.parseInt(input3);

            int largest = Math.max(Math.max(num1, num2), num3);

            resultTextView.setText("El número mayor es: " + largest);
        }
    }
}