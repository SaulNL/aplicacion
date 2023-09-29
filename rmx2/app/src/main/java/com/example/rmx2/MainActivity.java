package com.example.rmx2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2, editText3;
    private TextView resultTextView;
    private Button findButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.etN1);
        editText2 = findViewById(R.id.etN2);
        editText3 = findViewById(R.id.etN3);
        resultTextView = findViewById(R.id.tvMayor);
        findButton = findViewById(R.id.btnFind);

        // Configurar el escuchador de clic para el botón
        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findLargestNumber();
            }
        });
    }

    private void findLargestNumber() {
        String input1 = editText1.getText().toString();
        String input2 = editText2.getText().toString();
        String input3 = editText3.getText().toString();

        if (input1.isEmpty() || input2.isEmpty() || input3.isEmpty()) {
            // Si alguno de los campos está vacío, muestra un mensaje de error.
            showToast("Todos los campos son requeridos");
        } else {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            int num3 = Integer.parseInt(input3);

            int largest = Math.max(Math.max(num1, num2), num3);

            displayResult("El número mayor es: " + largest);
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void displayResult(String message) {
        resultTextView.setText(message);
    }
}