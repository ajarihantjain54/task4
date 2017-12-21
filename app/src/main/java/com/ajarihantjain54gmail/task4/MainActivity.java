package com.ajarihantjain54gmail.task4;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt;
    EditText text1;
    EditText text2;
    static String message1;
    static String message2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);
        text1 =(EditText) findViewById(R.id.edit1);
        text2 = (EditText) findViewById(R.id.edit2);


        }


    @Override
    public void onClick(View v) {
         message1 = text1.getText().toString();
         message2 = text2.getText().toString();
        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra(message1, message2);
        startActivity(intent);

    }
}
