package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollbtn)

        val imageview: ImageView = findViewById(R.id.imageView)
        val imageview2: ImageView = findViewById(R.id.imageView2)
        val textview: TextView = findViewById(R.id.textView)
        rollButton.setOnClickListener {
            var c: Int = (1..6).random()
            when (c) {
                1 -> imageview.setImageResource(R.drawable.dice_1)
                2 -> imageview.setImageResource(R.drawable.dice_2)
                3 -> imageview.setImageResource(R.drawable.dice_3)
                4 -> imageview.setImageResource(R.drawable.dice_4)
                5 -> imageview.setImageResource(R.drawable.dice_5)
                6 -> imageview.setImageResource(R.drawable.dice_6)
                else -> imageview.setImageResource(R.drawable.dice_6)

            }

            var d: Int = (1..6).random()
            when (d) {
                1 -> imageview2.setImageResource(R.drawable.dice_1)
                2 -> imageview2.setImageResource(R.drawable.dice_2)
                3 -> imageview2.setImageResource(R.drawable.dice_3)
                4 -> imageview2.setImageResource(R.drawable.dice_4)
                5 -> imageview2.setImageResource(R.drawable.dice_5)
                6 -> imageview2.setImageResource(R.drawable.dice_6)
                else -> imageview2.setImageResource(R.drawable.dice_6)

            }
            if (c>d){
               textview.text="Winner: Player 1"
            }
            else if (c==d){
                textview.text="Match Draw"
            }
            else{
                textview.text="Winner: Player 2"
            }


        }
    }
}
