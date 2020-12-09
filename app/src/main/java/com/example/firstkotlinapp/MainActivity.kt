package com.example.firstkotlinapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView as alias

/*We cal type cast the imports using as keyword
as keyword is also used for type cast*/

class MainActivity : AppCompatActivity() {
    private lateinit var textView: alias
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playGame(view: View) {
        startActivity(Intent(this, DiceGame::class.java))
    }

}