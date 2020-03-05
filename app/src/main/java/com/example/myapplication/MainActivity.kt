package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dice_image:ImageView = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice()
    {
        //val diceImage: ImageView = findViewById(R.id.dice_image)
        val randomInt = (1..6).random()
        //rollText.text = randomInt.toString()
        val drawableResources = when (randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_image.setImageResource(drawableResources)
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }

    //private fun countUp()
    //{
    //    val resultText: TextView = findViewById(R.id.result_text)

     //   if(resultText.text == "Hello World!")
     //   {
//        }
     //   else
     //   {
     //       var resultInt = resultText.text.toString().toInt()

     //       if(resultInt < 6)
     //       {
     //           resultInt++
      //          resultText.text = resultInt.toString()
     //       }
     //   }
    //}
}
