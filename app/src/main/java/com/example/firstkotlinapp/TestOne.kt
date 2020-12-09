package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TestOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_one)

        val textView: TextView = findViewById(R.id.textView)

        /*val myArray = Array(1000) { value ->
            value + 1
        }*/
        // val myArray: IntArray = intArrayOf(1, 2, 3, 4)
        // val myArray = IntArray(4) { 45 }
        // val myArray = IntArray(4) { it * 1 }
        // myArray.forEach { textView.append(it.toString() + "\n") }


        val str = "My name is Prachan Ghale."
        for (s in str) {
            textView.append(s.toString() + "\n")
        }
    }
}