package com.example.kotlinandroidpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnNextActivity = findViewById<Button>(R.id.btnNextActivity)

        // Back button
        btnBack.setOnClickListener {
            finish()
        }

        // Next button
        btnNextActivity.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java).also{
                startActivity(intent)
            }

        }
    }
}
