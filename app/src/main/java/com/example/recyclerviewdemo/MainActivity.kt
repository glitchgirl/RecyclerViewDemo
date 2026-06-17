package com.example.recyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private val programmingLanguages = arrayOf(
        "Java",
        "Kotlin",
        "Python",
        "C#",
        "C++",
        "C",
        "Cobol",
        "Scratch",
        "visual basic",
        "html",
        "css",
        "sql",
        "JavaScript",
        "TypeScript",
        "Swift",
        "Go",
        "Rust",
        "PHP"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager =
            LinearLayoutManager(this)

        recyclerView.adapter =
            CustomAdapter(programmingLanguages)
    }
}