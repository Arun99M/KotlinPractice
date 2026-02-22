package com.example.kotlinandroidpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityviewpager)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        val images = listOf(
            R.drawable.viewpager1,
            R.drawable.viewpager2,
            R.drawable.viewpager3
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
    }
}