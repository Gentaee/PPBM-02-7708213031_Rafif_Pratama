package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.ncorti.slidetoact.SlideToActView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val slideToActView = findViewById<SlideToActView>(R.id.example)
        slideToActView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                Log.d("Gentaee", "slide1: " + view.text + ", id: " + view.id)

                val _intent = Intent(
                    this@MainActivity2, MainActivity::class.java
                )
                startActivity(_intent)
            }

        }

        val gotogaretiwes = findViewById<Button>(R.id.pintogaretiwes)
        gotogaretiwes.setOnClickListener {
            val intpindah = Intent(this, LoginActivity::class.java)
            startActivity(intpindah)
        }

    }}