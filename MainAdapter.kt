package com.example.kotlinestudy

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter () : RecyclerView.Adapter<MainViewHolder>(){

    var itemList = mutableListOf<Item>()
    
    fun init(list : MutableList<Item>){
        this.itemList = list
        notifyDataSetChanged()
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val viewHolder = MainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        )
        viewHolder.itemView.setOnClickListener{
            Log.d("item", itemList.size.toString())
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(itemList[position])
    }
}