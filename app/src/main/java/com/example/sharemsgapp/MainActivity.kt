package com.example.sharemsgapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnShowToast : Button = findViewById<Button>(R.id.button)
        btnShowToast.setOnClickListener {
            //Code
            Log.i("MainActivity", "Button was Clicked");

            Toast.makeText(this, "Button was Clicked!", Toast.LENGTH_SHORT).show();
        }
    }
}