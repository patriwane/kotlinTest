package com.example.evoliris.mykotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Evoliris on 27/03/2018.
 */
public class Adapter(private val list: List<ItemRecycler>): RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = list.get(position).title
        holder.content.text = list.get(position).content
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_page, parent, false)

        return ViewHolder(v)
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val title: TextView
        val content: TextView
        init {
            title = v.findViewById(R.id.title);
            content = v.findViewById(R.id.content);
        }

    }

}