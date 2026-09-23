package com.example.adapter2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.Listview);

        String[] students={
                "Anu",
                "Arun",
                "Rahul",
                "Meera",
                "Akhil",
                "Aaaru"
        };
        ArrayAdapter<String>adapter=
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,students
                );
        listView.setAdapter(adapter);

    }
}
