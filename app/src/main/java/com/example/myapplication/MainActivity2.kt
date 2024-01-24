package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val rv1 = findViewById<RecyclerView>(R.id.rv)

        rv1.layoutManager = GridLayoutManager(this,3)

        val data = ArrayList<Category>()
        data.add(Category(R.drawable.img_1, "Window"))
        data.add(Category(R.drawable.img_1, "Window"))
        data.add(Category(R.drawable.img_1, "Window"))
        data.add(Category(R.drawable.img_1, "Window"))
        data.add(Category(R.drawable.baseline_window_24, "Window"))
        data.add(Category(R.drawable.baseline_window_24, "Window"))
        data.add(Category(R.drawable.baseline_window_24, "Window"))
        data.add(Category(R.drawable.baseline_window_24, "Window"))
        data.add(Category(R.drawable.baseline_window_24, "Window"))
        data.add(Category(R.drawable.baseline_window_24, "Window"))
        data.add(Category(R.drawable.baseline_window_24, "Window"))
        data.add(Category(R.drawable.baseline_window_24, "Window"))
        data.add(Category(R.drawable.baseline_window_24, "Window"))

        val adapter = CategoryAdapter(data)

        rv1.adapter = adapter

        adapter.OnItemClickListener(object : CategoryAdapter.OnItemClickListener{
            override fun OnClickListener(position: Int) {
                val i = Intent(this@MainActivity2, CategoryDetail::class.java)
                i.putExtra("IMG", data[position].img)
                i.putExtra("TEXT", data[position].text)
                startActivity(i)
            }
        })
    }
}