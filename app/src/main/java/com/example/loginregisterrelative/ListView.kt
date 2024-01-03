package com.example.loginregisterrelative

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListView : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val buttonClick = findViewById<Button>(R.id.balik)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })

        val listview = findViewById<ListView>(R.id.listview)

        val list: MutableList<String?> = ArrayList()
        list.add("Titanium")
        list.add("Billed")
        list.add("Damper")
        list.add("Knalpot")
        list.add("Shockbreaker")


        val arrayAdapter: ArrayAdapter<*> =
            ArrayAdapter<Any?>(applicationContext, android.R.layout.simple_list_item_1,
                list as List<Any?>
            )
        listview.adapter = arrayAdapter

        listview.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                if (position == 0) {
                    startActivity(Intent(this@ListView, titanium::class.java))
                } else if (position == 1) {
                    startActivity(Intent(this@ListView, billed::class.java))
                } else if (position == 2) {
                    startActivity(Intent(this@ListView, damper::class.java))
                } else if (position == 3) {
                    startActivity(Intent(this@ListView, knalpot::class.java))
                } else if (position == 4) {
                    startActivity(Intent(this@ListView, shockbreaker::class.java))
                } else {
                }
            }
    }
}