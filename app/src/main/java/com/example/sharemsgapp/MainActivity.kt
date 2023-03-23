package com.example.sharemsgapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnShowToast : Button = findViewById<Button>(R.id.button)
        btnShowToast.setOnClickListener {
            //Code
            Log.i("MainActivity", "Button was Clicked");
            Toast.makeText(this, "Button was Clicked!", Toast.LENGTH_SHORT).show();
        }
        var btnSendToAnotherActivity : Button = findViewById<Button>(R.id.button3)
        btnSendToAnotherActivity.setOnClickListener{
            val message : String = editTextTextPersonName.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message);
            startActivity(intent)
        }
        var btnShareToOtherApps : Button = findViewById<Button>(R.id.button4)
        btnShareToOtherApps.setOnClickListener{
            val message: String = editTextTextPersonName.text.toString()
            val intent = Intent();
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Please select app:"))
        }
    }
}