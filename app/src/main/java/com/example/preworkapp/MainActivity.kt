package com.example.preworkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.sayHelloButton)
        button.setOnClickListener{
            Toast.makeText(this,"Hello to you too, Friday", Toast.LENGTH_SHORT).show()
        }
    }
}