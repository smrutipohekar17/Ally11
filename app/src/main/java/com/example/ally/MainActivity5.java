package com.example.ally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void nextActivity2(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity5.class));
    }

    public void nextActivity3(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity6.class));
    }

    public void nextActivity4(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity7.class));
    }

    public void nextActivity5(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity8.class));
    }

    public void nextActivity6(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity9.class));
    }
}