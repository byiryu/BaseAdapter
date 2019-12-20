package com.byiryu.baseadapter.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.byiryu.baseadapter.R
import com.byiryu.baseadapter.data.Fruit
import com.byiryu.baseadapter.ui.baase.BaseAdapter
import com.byiryu.baseadapter.ui.baase.Callback

class MainAdapter(private val viewModel : MainViewModel) : BaseAdapter<Fruit, MainHolder>(object : Callback<Fruit>(){

    override fun areItemsTheSame(oldItem: Fruit, newItem: Fruit): Boolean {
        return oldItem.id == newItem.id
    }

}){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_main_item,parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        var item = getItem(position)
        holder.onBind(item, viewModel)
    }

}