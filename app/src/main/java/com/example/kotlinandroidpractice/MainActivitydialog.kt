package com.example.kotlinandroidpractice

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivitydialog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitydialog)

        val btnDialog1 = findViewById<Button>(R.id.btnDialog1)

        btnDialog1.setOnClickListener {

            val addContactDialog = AlertDialog.Builder(this)
                .setTitle("Add Contact")
                .setMessage("Do you want to add this contact to your contact list?")
                .setIcon(R.drawable.ic_contact)
                .setPositiveButton("Yes") { dialog, which ->
                    Toast.makeText(this, "You added this contact", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("No") { dialog, which ->
                    Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show()
                }
                .create()

            addContactDialog.show()
        }
    }
}
