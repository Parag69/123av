package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication3.Activity_sign_up;
import com.example.myapplication3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("LOGIN FORM");
    }

    public void btn_sign_up  (View view) {

        startActivity(new Intent(getApplicationContext(), Activity_sign_up.class));
    }
}