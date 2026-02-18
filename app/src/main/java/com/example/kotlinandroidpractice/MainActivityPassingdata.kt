package com.example.kotlinandroidpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivityPassingData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passingdatabtwactivities)

        val btnApply = findViewById<Button>(R.id.btnApply)
        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)
        val etCountry = findViewById<EditText>(R.id.etCountry)

        btnApply.setOnClickListener {

            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()

            val person = Person(name, age, country)

            val intent = Intent(this, SecondActivityPassingdata::class.java)

            // ✅ PUT DATA HERE
            intent.putExtra("PERSON", person)

            startActivity(intent)
        }
    }
}
