package com.example.demoapp1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var incrementButton: Button
    private lateinit var textDisplayedValue: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incrementButton = findViewById(R.id.incrementButton)
        textDisplayedValue = findViewById(R.id.textDisplayedValue)

        incrementButton.setOnClickListener {
            val originalCountValue = textDisplayedValue.text.toString()
            var incrementedValue = Integer.valueOf(originalCountValue).inc()
            textDisplayedValue.text = incrementedValue.toString()
        }

    }
}