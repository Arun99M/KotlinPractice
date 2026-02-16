package com.example.kotlinandroidpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityfirstsecondactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)   // First activity layout

        val btnOpenActivity = findViewById<Button>(R.id.button)

        btnOpenActivity.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }
    }
}
