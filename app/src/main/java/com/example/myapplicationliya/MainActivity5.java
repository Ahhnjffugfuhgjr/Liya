package com.example.myapplicationliya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        ImageButton hi =(ImageButton)findViewById(R.id.hi);
        ImageButton se = (ImageButton)findViewById(R.id.se);
        ImageButton menu2 = (ImageButton)findViewById(R.id.menu2);
        ImageButton pri = (ImageButton)findViewById(R.id.pri);



        hi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this,MainActivity6.class);
                startActivity(i);
            }
        });

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this,MainActivity7.class);
                startActivity(i);
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this,MainActivity4.class);
                startActivity(i);
            }
        });

        pri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this,MainActivity7.class);
                startActivity(i);
            }
        });
    }
}