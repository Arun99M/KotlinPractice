package com.example.kotlinandroidpractice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivityimageview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageview)

        val ivImage = findViewById<ImageView>(R.id.ivImage)
        val btnToggle = findViewById<Button>(R.id.btnAddImage)

        // Image click listener
        btnToggle.setOnClickListener {

            if (ivImage.visibility == android.view.View.VISIBLE) {
                ivImage.visibility = android.view.View.GONE
                btnToggle.text = "Enable Image"
            } else {
                ivImage.visibility = android.view.View.VISIBLE
                btnToggle.text = "Disable Image"
            }
        }

    }
    }
