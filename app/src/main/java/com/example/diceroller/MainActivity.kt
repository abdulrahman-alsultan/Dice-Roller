package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_roll)
        val image = findViewById<ImageView>(R.id.iv_dice)

        btn.setOnClickListener {
            when(Random.nextInt(6) + 1){
                1-> image.setImageResource(R.drawable.dice_1)
                2-> image.setImageResource(R.drawable.dice_2)
                3-> image.setImageResource(R.drawable.dice_3)
                4-> image.setImageResource(R.drawable.dice_4)
                5-> image.setImageResource(R.drawable.dice_5)
                else-> image.setImageResource(R.drawable.dice_6)
            }
        }
    }
}