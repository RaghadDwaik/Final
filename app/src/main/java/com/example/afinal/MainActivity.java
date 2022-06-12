package com.example.afinal;

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
        public void btncustomer(View view)
        {
            Intent in = new Intent(this,Main2Activity.class);
            startActivity(in);

        }

        public void btnOwner(View view) {
            Intent in = new Intent(this,MainActivity4.class);
            startActivity(in);
        }

}