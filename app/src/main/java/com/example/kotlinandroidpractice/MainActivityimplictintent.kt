package com.example.kotlinandroidpractice

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivityimplictintent : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicitintent)

        val btnTakePhoto = findViewById<Button>(R.id.btnTakePhoto)

        btnTakePhoto.setOnClickListener{
            Intent(Intent.ACTION_GET_CONTENT).also {

                //* putting meaning applicable for all types of images to use png,jpeg
                it.type = "image/*"
                startActivityForResult(it, 0)
            }
        }}

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 0) {
            val uri = data?.data
            val ivPhoto = findViewById<ImageView>(R.id.ivPicture)
            ivPhoto.setImageURI(uri)
        }

    }
}