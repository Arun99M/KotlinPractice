package com.example.kotlinandroidpractice

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityradiobtncheckbox : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radiobtncheckbox)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val rgMeat = findViewById<RadioGroup>(R.id.rgMeat)
        val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
        val cbOnion = findViewById<CheckBox>(R.id.cbOnion)
        val cbSalad = findViewById<CheckBox>(R.id.cbSalad)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnOrder.setOnClickListener {

            val selectedId = rgMeat.checkedRadioButtonId

            if (selectedId == -1) {
                tvResult.text = "Please select meat"
                return@setOnClickListener
            }

            val selectedMeat =
                findViewById<RadioButton>(selectedId).text.toString()

            var toppings = ""

            if (cbCheese.isChecked) toppings += "\nCheese"
            if (cbOnion.isChecked) toppings += "\nOnions"
            if (cbSalad.isChecked) toppings += "\nSalad"

            tvResult.text =
                "You ordered a burger with:\n$selectedMeat$toppings"
        }
    }
}
