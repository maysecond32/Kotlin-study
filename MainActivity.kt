package com.example.kotlinestudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemList : MutableList<Item> = mutableListOf(
            Item(0, "item0"),
            Item(1, "item1"),
            Item(2, "item2"),
            Item(3, "item4"),
            Item(4, "item4")
        )

        val adapter = MainAdapter()
        main_rv.adapter = adapter
        adapter.init(itemList)
        main_rv.layoutManager = LinearLayoutManager(this)
    }
}