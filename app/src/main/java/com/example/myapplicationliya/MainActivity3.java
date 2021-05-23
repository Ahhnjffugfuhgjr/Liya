package com.example.myapplicationliya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText user2 = (EditText)findViewById(R.id.user2);
        EditText pass2 = (EditText)findViewById(R.id.pass2);
        EditText pass3 = (EditText)findViewById(R.id.pass3);
        EditText email = (EditText)findViewById(R.id.email);
        Button signup = (Button)findViewById(R.id.signup);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailadd = email.getText().toString().trim();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if(emailadd.matches(emailPattern)){
                    if(user2.length()==0||email.length()==0||pass2.length()==0||pass3.length()==0){
                        Toast.makeText(MainActivity3.this,"Одно из полей не заполнено", Toast.LENGTH_SHORT).show();
                    }else{
                        if(pass2.getText().toString().equals(pass3.getText().toString())){
                            Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                            startActivity(i);
                        }else{
                            Toast.makeText(MainActivity3.this,"Пороли не совпадают", Toast.LENGTH_SHORT).show();
                            pass2.setText("");
                            pass3.setText("");
                        }
                    }
                }else{
                    Toast.makeText(MainActivity3.this,"email введен неправильно", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}