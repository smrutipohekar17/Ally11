package com.example.ally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BioPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }

    public void nextActivity1(View view) {
        startActivity(new Intent(getApplicationContext(), HomePage.class));
    }

    public void openTest(View view) {
        startActivity(new Intent(getApplicationContext(),Test.class));
    }
}