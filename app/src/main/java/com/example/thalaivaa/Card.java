package com.example.thalaivaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        TextView text = (TextView) findViewById(R.id.textView6);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }
}
