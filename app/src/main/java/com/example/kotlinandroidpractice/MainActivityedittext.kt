package com.example.kotlinandroidpractice

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityedittext : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edittext)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber)
        val etSecondNumber = findViewById<EditText>(R.id.etSecondNumber)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {

            val firstNumber = etFirstNumber.text.toString().toIntOrNull()
            val secondNumber = etSecondNumber.text.toString().toIntOrNull()

            if (firstNumber != null && secondNumber != null) {
                val result = firstNumber + secondNumber
                tvResult.text = result.toString()
            } else {
                tvResult.text = "Enter valid numbers"
            }
        }
    }
}
