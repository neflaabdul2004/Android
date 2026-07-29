package com.example.registration;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.textView);
        String name=getIntent().getStringExtra("username");
        t1.setText("Welcome"+ name);
    }

    }

