package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name = intent.getStringExtra("name")
        val Mail = intent.getStringExtra("Mail")
        val gender = intent.getStringExtra("gender")


        val displaytext:TextView = findViewById(R.id.display)

        displaytext.text= "Hello ${name}, your email id is ${Mail} , and your gender is ${gender} "

        Toast.makeText(this, "\"Hello ${name}, your email id is ${Mail} , and your gender is ${gender} ", Toast.LENGTH_SHORT).show()
        
    }
}