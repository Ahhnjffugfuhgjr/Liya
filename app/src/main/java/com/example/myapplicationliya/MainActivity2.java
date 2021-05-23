package com.example.myapplicationliya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        EditText user = (EditText) findViewById(R.id.user);
        EditText pass = (EditText) findViewById(R.id.pass);
        Button signin = (Button)findViewById(R.id.signin);
        ImageButton create=(ImageButton)findViewById(R.id.create);


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pass.length()==0||user.length()==0){
                    Toast.makeText(MainActivity2.this, "Одно из полей не заполнено",Toast.LENGTH_SHORT).show();
                }else{
                    Intent i = new Intent(MainActivity2.this,MainActivity4.class);
                    startActivity(i);
                }

            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
            }
        });


    }
}