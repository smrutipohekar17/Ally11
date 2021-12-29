package com.example.ally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }


    public void nextActivity2(View view) {
        startActivity(new Intent(getApplicationContext(), HomePage.class));
    }

    public void nextActivity3(View view) {
        startActivity(new Intent(getApplicationContext(), GroupChat.class));
    }

    public void nextActivity4(View view) {
        startActivity(new Intent(getApplicationContext(), SocialWindow.class));
    }

    public void nextActivity5(View view) {
        startActivity(new Intent(getApplicationContext(), PersonalChat.class));
    }

    public void nextActivity6(View view) {
        startActivity(new Intent(getApplicationContext(), Profile.class));
    }
}