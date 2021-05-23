package com.example.myapplicationliya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences prefs = getPreferences(MODE_PRIVATE);
                if(prefs.getBoolean("IsFirstRun",true)){
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                }else{
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                }
                prefs.edit().putBoolean("IsFirstRun",false).apply();
                finish();
            }
        },3*1000);
    }
}