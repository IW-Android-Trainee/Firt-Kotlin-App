package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DiceGame : AppCompatActivity() {
    private lateinit var diceNumber: TextView
    private lateinit var rollDice: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_game)
        uiInitialize()
        onRollDiceClick()
    }

    private fun onRollDiceClick() {
        rollDice.setOnClickListener {
            diceNumber.text = roll().toString()
        }
    }

    private fun roll(): Int {
        return (1..6).random()
    }

    private fun uiInitialize() {
        diceNumber = findViewById(R.id.diceNumber)
        rollDice = findViewById(R.id.rollDice)
    }
}