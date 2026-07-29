package com.example.registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextText);
        e2 = findViewById(R.id.editTextText3);
        e3 = findViewById(R.id.editTextTextPassword);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =e1.getText().toString();
                String email =e2.getText().toString();
                String password =e3.getText().toString();

                SharedPreferences sp =getSharedPreferences("UserData",MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("name",name);
                editor.putString("Email",email);
                editor.putString("password",password);
                editor.commit();
                Toast.makeText(MainActivity.this,"Registration Successful",
                        Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,
                        MainActivity2.class);
                intent.putExtra("username",name);
                startActivity(intent);

            }        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
