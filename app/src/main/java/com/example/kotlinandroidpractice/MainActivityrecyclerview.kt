package com.example.kotlinandroidpractice

import Todo
import TodoAdapter
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivityrecyclerview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityrecyclerview)

        val rvTodos = findViewById<RecyclerView>(R.id.rvTodos)
        val btnAddTodo = findViewById<Button>(R.id.btnAddTodo)
        val etTodo = findViewById<EditText>(R.id.etTodo)

        val todoList = mutableListOf(
            Todo("Follow AndroidDevs", false),
            Todo("Learn RecyclerView", true),
            Todo("Feed my cat", false),
            Todo("Prank my boss", false),
            Todo("Eat some curry", false)
        )

        val adapter = TodoAdapter(todoList)

        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title = etTodo.text.toString()

            if (title.isNotEmpty()) {
                val todo = Todo(title)
                todoList.add(todo)
                adapter.notifyItemInserted(todoList.size - 1)
                etTodo.text.clear()
            }
        }
    }
}