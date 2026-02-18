package com.example.kotlinandroidpractice

import java.io.Serializable


// data class used to store data
data class Person(
    val name: String,
    val age: Int,
    val country: String
) : Serializable

// If You Want To Pass This Person Object Between Activities
//You must make it Parcelable or Serializable.
