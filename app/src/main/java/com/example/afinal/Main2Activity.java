package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.afinal.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent in = getIntent();
        ListView listView = (ListView) findViewById(R.id.list);

        AdapterView.OnItemClickListener itemclick = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent in0 = new Intent(Main2Activity.this, MainActivity3.class);
                    startActivity(in0);
                }
                if (position == 1) {
                    Intent in1 = new Intent(Main2Activity.this, MainActivity5.class);
                    startActivity(in1);
                }

                if (position == 2) {
                    Intent in2 = new Intent(Main2Activity.this, MainActivity6.class);
                    startActivity(in2);
                }

                if (position == 3) {
                    Intent in3 = new Intent(Main2Activity.this, MainActivity7.class);
                    startActivity(in3);
                }

                if (position == 4) {
                    Intent in4 = new Intent(Main2Activity.this, MainActivity8.class);
                    startActivity(in4);
                }

            }




        };
        listView.setOnItemClickListener(itemclick);
    }

}