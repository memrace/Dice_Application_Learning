package android.bignerdranch.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var imageRoll:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val roll_button: Button = findViewById(R.id.roll_button)
        roll_button.setOnClickListener{rollDice()}
        imageRoll = findViewById(R.id.dice_image)
    }

    private fun rollDice() {

        val randomInt = Random.nextInt(6)+1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageRoll.setImageResource(drawableResource)
        val roll_button_text = "Dice rolled!"
        val roll_button_duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, roll_button_text, roll_button_duration)
        toast.show()
    }
}
