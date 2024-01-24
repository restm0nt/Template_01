package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CategoryDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_detail)

        val img = findViewById<ImageView>(R.id.dtimg)
        val txt = findViewById<TextView>(R.id.dttext)

        img.setImageResource(intent.getIntExtra("IMG",0))
        txt.text = intent.getStringExtra("TEXT")
    }
}