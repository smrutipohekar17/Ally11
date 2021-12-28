package com.example.ally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }

    public void nextActivity1(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity5.class));
    }

    public void openPersonalityTest(View view) {
        startActivity(new Intent(getApplicationContext(),personalityTest.class));
    }
}