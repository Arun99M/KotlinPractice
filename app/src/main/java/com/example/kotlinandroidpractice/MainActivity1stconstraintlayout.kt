package com.example.kotlinandroidpractice

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity1stconstraintlayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_1stconstraintlayout)

        // Connect Views
        val btnApply = findViewById<Button>(R.id.btnApply)
        val etFirstName = findViewById<EditText>(R.id.etFirstName)
        val etLastName = findViewById<EditText>(R.id.etLastName)
        val etBirthDate = findViewById<EditText>(R.id.etBirthDate)
        val etCountry = findViewById<EditText>(R.id.etCountry)

        btnApply.setOnClickListener {

            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val birthdate = etBirthDate.text.toString()
            val country = etCountry.text.toString()

            Log.d("MainActivity", "$firstName $lastName born on $birthdate in $country")

            Toast.makeText(this, "Data Logged", Toast.LENGTH_SHORT).show()
        }
    }
}
