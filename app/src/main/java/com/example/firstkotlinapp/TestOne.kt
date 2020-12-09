package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TestOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_one)

        val textView: TextView = findViewById(R.id.textView)

        val myArray = Array(5) { value ->
            value + 1
        }
        myArray.forEach { textView.append(it.toString() + "\n") }

    }
}