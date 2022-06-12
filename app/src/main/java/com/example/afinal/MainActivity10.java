package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


    }

    public void btnup(View view) {
        Intent in = new Intent(this,MainActivity12.class);
        startActivity(in);
    }

    public void btnin(View view) {
        Intent in = new Intent(this,MainActivity11.class);
        startActivity(in);
    }
}