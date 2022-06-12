package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class MainActivity11 extends AppCompatActivity {

    private EditText f,p;
    private String name ,password;
    private String url ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        f = findViewById(R.id.f);
        p = findViewById(R.id.p);


    }

    public void btnsubmit(View view) {
        name = f.getText().toString().trim();
        password = p.getText().toString().trim();
        if (!name.equals("") && !password.equals("")){
            StringRequest stringRequest = new StringRequest(Request.Method.POST,
                    url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.equals("success")) {
                        Intent in = new Intent(MainActivity11.this,MainActivity13.class);
                        startActivity(in);
                        finish();
                }
                    else {
                        Toast.makeText(MainActivity11.this,"invalid password or name",Toast.LENGTH_SHORT).show();

                    }
            }
                )};

    }
}
}