package com.example.firstkotlinapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DiceGame : AppCompatActivity() {
    private lateinit var diceNumber: TextView
    private lateinit var rollDice: Button
    private val luckyNumber = roll()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_game)
        uiInitialize()
        onRollDiceClick()
    }

    @SuppressLint("SetTextI18n")
    private fun onRollDiceClick() {
        rollDice.setOnClickListener {
            if (luckyNumber == roll())
                diceNumber.text = "Congratulations! you won the game by rolling " +
                        "${roll()}."
            else{
                diceNumber.text = "You loose! you rolled " +
                        "${roll()}."
            }
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