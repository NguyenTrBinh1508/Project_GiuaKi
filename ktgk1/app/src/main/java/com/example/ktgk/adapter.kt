package com.example.ktgk

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(var list : List<String> , val context: Context) : RecyclerView.Adapter<adapter.viewHolder>() {

    class viewHolder(view : View) : RecyclerView.ViewHolder(view){
        val text : TextView = view.findViewById(R.id.city)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.text.text = list[position]

val r = java.util.Random()
        val red: Int = r.nextInt(255 - 0 + 1) + 0
        val green: Int = r.nextInt(255 - 0 + 1) + 0
        val blue: Int = r.nextInt(255 - 0 + 1) + 0

        val draw = GradientDrawable()
        draw.setColor(Color.rgb(red, green, blue))
        holder.text.setBackground(draw)

    }

    override fun getItemCount(): Int {
       return list.size
    }
}