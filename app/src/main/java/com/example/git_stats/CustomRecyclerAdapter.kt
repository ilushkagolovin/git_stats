package com.example.git_stats

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.git_stats.model.repositories.Item
import kotlinx.android.synthetic.main.recyclerview_item.view.*

class CustomRecyclerAdapter(private val repositoriesNames: List<String>) :
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    var listUsername = emptyList<Item>()


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.reposiories_name.text = listUsername[position].name
    }

    override fun getItemCount(): Int {
        return listUsername.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setListUser(list: List<Item>){
        listUsername = list
        notifyDataSetChanged()
    }



}