package com.example.firstkotlinapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class DiceGame : AppCompatActivity() {
    private lateinit var diceNumber: TextView
    private lateinit var rollDice: Button
    private lateinit var diceImageView: ImageView
    private val luckyNumber = 6/*roll()*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_game)
        uiInitialize()
        onRollDiceClick()
    }

    @SuppressLint("SetTextI18n")
    private fun onRollDiceClick() {
        rollDice.setOnClickListener {
            when {
                roll() == 1 -> {
                    diceImageView.setImageResource(R.drawable.dice_1)
                }
                roll() == 2 -> {
                    diceImageView.setImageResource(R.drawable.dice_2)
                }
                roll() == 3 -> {
                    diceImageView.setImageResource(R.drawable.dice_3)
                }
                roll() == 4 -> {
                    diceImageView.setImageResource(R.drawable.dice_4)
                }
                roll() == 5 -> {
                    diceImageView.setImageResource(R.drawable.dice_5)
                }
                else -> {
                    diceImageView.setImageResource(R.drawable.dice_6)
                }
            }

            /*if (luckyNumber == roll())
                diceNumber.text = "Congratulations! you won the game by rolling " +
                        "${roll()}."
            else{
                diceNumber.text = "You loose! you rolled " +
                        "${roll()}."
            }*/
            /*Using when statement*/
            /*when (roll()) {
                luckyNumber -> diceNumber.text = "You won"
                1 -> diceNumber.text = "You din't win"
                2 -> diceNumber.text = "You din't win"
                3 -> diceNumber.text = "You din't win"
                4 -> diceNumber.text = "You din't win"
                5 -> diceNumber.text = "You din't win"
            }*/
        }
    }

    private fun roll(): Int {
        return (1..6).random()
    }

    private fun uiInitialize() {
        diceNumber = findViewById(R.id.diceNumber)
        rollDice = findViewById(R.id.rollDice)
        diceImageView = findViewById(R.id.diceImage)
    }
}