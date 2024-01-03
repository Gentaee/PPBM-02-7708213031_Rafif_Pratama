package com.example.loginregisterrelative

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog

class Menu2 : AppCompatActivity() {

    lateinit var btnShowBottomSheet: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val buttonClick = findViewById<TextView>(R.id.proms)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })
        val buttonClick1 = findViewById<TextView>(R.id.bokung)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,Menu3 ::class.java)
            startActivity(intent1)
            finish()


        })
        val buttonClick2 = findViewById<ImageView>(R.id.train)
        buttonClick2.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,Part ::class.java)
            startActivity(intent2)
            finish()


        })

        btnShowBottomSheet = findViewById(R.id.buttomsheet);

        btnShowBottomSheet.setOnClickListener{

            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.activity_bottomsheet, null)
            val btnClose = view.findViewById<Button>(R.id.idBtnDismiss)

            btnClose.setOnClickListener {
                dialog.dismiss()
            }

            dialog.setCancelable(false)
            dialog.setContentView(view)
            dialog.show()
        }

        val buttonClick4 = findViewById<ImageView>(R.id.order1)
        buttonClick4.setOnClickListener(View.OnClickListener {

            val intent4 = Intent(this,tablayout::class.java)
            startActivity(intent4)
            finish()

        })

    }
}