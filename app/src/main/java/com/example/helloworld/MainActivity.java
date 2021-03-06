package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPress (View view){
        TextView txtHello = findViewById(R.id.txtMessage);
        EditText edtTxtName = findViewById(R.id.editTextTextPersonName);
        String name = edtTxtName.getText().toString();
        int specialNumber = (int) (Math.random()*1000);
        txtHello.setText("Hey, " + name + " your lucky number is " + specialNumber);
    }
}