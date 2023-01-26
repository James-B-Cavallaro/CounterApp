package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.counter)
        val textView = findViewById<TextView>(R.id.total)
        val upgrade = findViewById<Button>(R.id.upgradeBtn)
        button.setOnClickListener {
            counter++
            textView.text = counter.toString()

            if(counter >= 100) {
                upgrade.visibility = View.VISIBLE

                upgrade.setOnClickListener {
                    button.text = "Add 2"
                    button.setOnClickListener {
                        counter += 2
                        textView.text = counter.toString()
                    }
                    upgrade.visibility = View.INVISIBLE
                }
            }

        }
    }
    var counter = 0
}