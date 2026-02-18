package com.example.kotlinandroidpractice

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivityPermissions : AppCompatActivity() {

    private lateinit var btnRequest: Button

    // Foreground location launcher
    private val foregroundLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
            if (granted) {
                Toast.makeText(this, "Foreground Location Granted", Toast.LENGTH_SHORT).show()
                requestBackgroundLocation()
            } else {
                Toast.makeText(this, "Foreground Location Denied", Toast.LENGTH_SHORT).show()
            }
        }

    // Background location launcher
    private val backgroundLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
            if (granted) {
                Toast.makeText(this, "Background Location Granted", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Background Location Denied", Toast.LENGTH_SHORT).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_permissions)

        btnRequest = findViewById(R.id.btnRequestPermissions)

        btnRequest.setOnClickListener {
            requestForegroundLocation()
        }
    }

    private fun requestForegroundLocation() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            requestBackgroundLocation()
        } else {
            foregroundLauncher.launch(Manifest.permission.ACCESS_COARSE_LOCATION)
        }
    }

    private fun requestBackgroundLocation() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            if (ContextCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_BACKGROUND_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                backgroundLauncher.launch(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
            }
        }
    }
}
