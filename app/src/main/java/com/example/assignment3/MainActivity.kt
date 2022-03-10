package com.example.assignment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button:Button  = findViewById(R.id.submit)
        val Name:EditText = findViewById(R.id.name)
        val Mail:EditText = findViewById(R.id.mail)
        val gender:RadioGroup = findViewById(R.id.options)




        button.setOnClickListener {
            val intent =Intent(this, MainActivity2::class.java)

            val inputname = Name.editableText.toString()
            val inputmail = Mail.editableText.toString()
            val selectedOption =  gender.checkedRadioButtonId
            val op:RadioButton = findViewById(selectedOption)
            val gendername = op.text


            intent.putExtra("name",inputname)
            intent.putExtra("Mail",inputmail)
            intent.putExtra("gender",gendername)
            startActivity(intent)
        }
    }
}