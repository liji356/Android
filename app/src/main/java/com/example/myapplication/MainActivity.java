package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton b1,b2,b3;
    String getUser,getPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.user);
        e2=(EditText)findViewById(R.id.pass);
        b1=(AppCompatButton)findViewById(R.id.sub);
        b2=(AppCompatButton)findViewById(R.id.reg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUser=e1.getText().toString();
                Toast.makeText(getApplicationContext(),getUser,Toast.LENGTH_LONG).show();
                getPass=e2.getText().toString();
                Toast.makeText(getApplicationContext(),getPass,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });


    }
}