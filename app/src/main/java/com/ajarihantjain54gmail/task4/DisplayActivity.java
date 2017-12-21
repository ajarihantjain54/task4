package com.ajarihantjain54gmail.task4;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import static com.ajarihantjain54gmail.task4.MainActivity.*;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        String displaymessage1 = intent.getStringExtra(MainActivity.message1);
        String dispalymessage2 = intent.getStringExtra(MainActivity.message2);

        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText(message1);
        TextView textView1 = (TextView) findViewById(R.id.textview1);
        textView1.setText(message2);
    }

}
