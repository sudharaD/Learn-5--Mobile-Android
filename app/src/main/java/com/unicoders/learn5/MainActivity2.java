package com.unicoders.learn5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button button;
    TextView txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.btnTwo);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);

        Intent intent = getIntent();
//        String name = intent.getStringExtra("USER_NAME");
//        //Intent intent1 = getIntent();
//        int age = intent.getIntExtra("USER_AGE", 0);

        Bundle extras = intent.getExtras();

        String name = extras.getString("USER_NAME");
        int age = extras.getInt("USER_AGE");

        txt2.setText(name);
        txt3.setText(String.valueOf(age));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}