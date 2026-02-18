package com.example.kotlinandroidpractice

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivityPassingdata : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_passing_data)

        val tvPerson = findViewById<TextView>(R.id.tvPerson)

        val person = if (android.os.Build.VERSION.SDK_INT >= 33) {
            intent.getSerializableExtra("PERSON", Person::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getSerializableExtra("PERSON") as? Person
        }

        person?.let {
            tvPerson.text = "${it.name} is ${it.age} years old and lives in ${it.country}"
        }


    }}
