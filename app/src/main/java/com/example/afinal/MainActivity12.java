package com.example.afinal;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity12 extends AppCompatActivity {

    private EditText first,last,phone,pass,email,address;
    private TextView fill,status;
    private Button submit;
    private String url ="";
    private String firstname ,lastname,phonenum,password,email1,address1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Intent in = getIntent();
        first = findViewById(R.id.first);
        last = findViewById(R.id.last);
        phone = findViewById(R.id.phone);
        pass = findViewById(R.id.pass);
        email = findViewById(R.id.email);
        address = findViewById(R.id.address);
       fill = findViewById(R.id.fill);
        submit = findViewById(R.id.submit);
        String firstname = lastname = phonenum= password=email1,address1 ="";

    }

    public void btnsubmit(View view) {
        firstname = first.getText().toString().trim();
        lastname = last.getText().toString().trim();
        phonenum = phone.getText().toString().trim();
        password = pass.getText().toString().trim();
        email1= email.getText().toString().trim();
        address1 = address.getText().toString().trim();



        if (!firstname.equals("") && !lastname.equals("") && !phonenum.equals("") &&
                !password.equals("") && !email1.equals("")&& !address.equals("")){
            StringRequest stringRequest = new StringRequest(Request.Method.POST,
                    url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            if (response.equals("success")) {
                                status.setText("successfully regesterd");

                            } else {
                                status.setText("Some thing went wrong");
                            }
                        }


                )};
        }
    }


}

