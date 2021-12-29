package com.example.ally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    CheckBox termsnConditions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        
        termsnConditions = findViewById(R.id.checkBox);
        
        
    }

    public void nextActivity(View view) {
        if (termsnConditions.isChecked()){
            startActivity(new Intent(getApplicationContext(), WelcomePage.class));
        }
        else {
            Toast.makeText(getApplicationContext(), "Please Accept Terms & Conditions", Toast.LENGTH_SHORT).show();
        }
    }
}