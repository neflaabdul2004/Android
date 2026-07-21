package com.example.calculater;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    Button sum, sub, mul, div;
    TextView rslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.textView3);
        n2 = findViewById(R.id.textView4);

        sum = findViewById(R.id.button3);
        sub = findViewById(R.id.button2);
        mul = findViewById(R.id.button4);
        div = findViewById(R.id.button);

        rslt = findViewById(R.id.textView5);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate('+');
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate('-');
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate('*');
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate('/');
            }
        });
    }

    private void calculate(char op) {

        if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
            rslt.setText("Enter both numbers");
            return;
        }

        int f1 = Integer.parseInt(n1.getText().toString());
        int f2 = Integer.parseInt(n2.getText().toString());

        switch (op) {
            case '+':
                rslt.setText("Addition = " + (f1 + f2));
                break;

            case '-':
                rslt.setText("Subtraction = " + (f1 - f2));
                break;

            case '*':
                rslt.setText("Multiplication = " + (f1 * f2));
                break;

            case '/':
                if (f2 == 0) {
                    rslt.setText("Cannot divide by zero");
                } else {
                    rslt.setText("Division = " + (f1 / f2));
                }
                break;
        }
    }
}
