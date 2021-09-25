package com.example.kotlinone

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  tv: TextView
    lateinit var  bt1: Button
    lateinit var  bt2: Button
    lateinit var  bt3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView)
        bt1 = findViewById(R.id.button)
        bt2= findViewById(R.id.button2)
        bt3= findViewById(R.id.button3)

        bt1.setOnClickListener {

            tv.text = "the pink button clicked"
            tv.setTextColor(Color.parseColor("#E39C8D"))
        }
        bt2.setOnClickListener{
            tv.setTextColor(Color.parseColor("#b5f09d"))
            tv.text = "the green button clicked"
        }
        bt3.setOnClickListener {
            tv.setTextColor(Color.parseColor("#659db4"))
            tv.text = "the blue button clicked"
        }





    }
}