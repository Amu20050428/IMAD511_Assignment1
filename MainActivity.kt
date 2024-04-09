package com.example.myimadassignment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtHistory)
        btnGenerate.setOnClickListener {}
        val age = ageNumber.text.toString().toIntOrNull()
        if (age != null) {
            val result = when (age) {
                in 0..12 -> "child"
                in 13..19 -> "Teenage"
                in 20..59 -> "Adult"
                else -> "senior"

            }
            txtResult.text = "Age: $age\n${
                when (result) {
                    "Mandela" -> "Mandela died at the age 12"
                    "Teenager" -> "You are an Teenager"
                    "Adult" -> "You are a Adult"
                    else -> "YOU are a Senior"
                }
            }"
        } else {
            txtResult.text = "Plase enter valid age"
        }
        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }
}

