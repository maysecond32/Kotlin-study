package com.example.kotlinestudy

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_main.view.*

class MainViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
    fun bind(item : Item){
        itemView.item_tv_id.text = item.id.toString()
        itemView.item_tv_name.text = item.name
    }
}