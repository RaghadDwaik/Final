package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Customer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


    }

    public void btnup(View view) {
        Intent in = new Intent(this, SignUp.class);
        startActivity(in);
    }

    public void btnin(View view) {
        Intent in = new Intent(this, SignIn.class);
        startActivity(in);
    }
}