package com.example.thalaivaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Card.class);
        startActivity(intent);
    }

    public void sendMessage1(View view) {
        Intent intent1 = new Intent(this, Cash.class);
        startActivity(intent1);
    }

    public void sendMessage2(View view) {
        Intent intent1 = new Intent(this, Profile.class);
        startActivity(intent1);
    }
}
