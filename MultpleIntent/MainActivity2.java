package com.example.intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView a1,a2,a3,a4;
    Button b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        a1 =findViewById(R.id.textView);
        a2= findViewById(R.id.textView2);
        a3=findViewById(R.id.textView3);
        a4=findViewById(R.id.textView4);
        b=findViewById(R.id.button2);
        Bundle extra = getIntent().getExtras();
        String text =extra.getString("name");
        String text1 = extra.getString("age");
        String text2 = extra.getString("course");
        String text3 =extra.getString("place");


        a1.setText(text);
        a2.setText(text1);
        a3.setText(text2);
        a4.setText(text3);

    }

    public void Click(View view) {
        Intent i = new Intent(this, MainActivity3.class);

        startActivity(i);
    }
}
