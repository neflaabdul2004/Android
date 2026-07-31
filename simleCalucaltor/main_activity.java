package com.example.simplecalcultor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button sum,sub,mul,div;
    EditText e1,e2;
    TextView result,t1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        sum=findViewById(R.id.button);
        sub=findViewById(R.id.button3);
        mul=findViewById(R.id.button4);
        div=findViewById(R.id.button5);
        e1=findViewById(R.id.editTextText2);
        e2=findViewById(R.id.editTextText3);
        result=findViewById(R.id.textView3);
        t1=findViewById(R.id.textView);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double f1=Double.parseDouble(e1.getText().toString());
                Double f2=Double.parseDouble(e2.getText().toString());
                Double cal=f1+f2;
                result.setText("Addition="+cal);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double f1=Double.parseDouble(e1.getText().toString());
                Double f2=Double.parseDouble(e2.getText().toString());
                Double cal=f1-f2;
                result.setText("Subtraction="+cal);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double f1=Double.parseDouble(e1.getText().toString());
                Double f2=Double.parseDouble(e2.getText().toString());
                Double cal=f1*f2;
                result.setText("Multiplication="+cal);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double f1=Double.parseDouble(e1.getText().toString());
                Double f2=Double.parseDouble(e2.getText().toString());
                Double cal= f1/f2;
                result.setText("Division="+cal);
            }
        });
    }
}
