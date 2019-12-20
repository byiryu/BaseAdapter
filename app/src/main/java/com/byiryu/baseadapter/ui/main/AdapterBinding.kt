package com.byiryu.baseadapter.ui.main

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.byiryu.baseadapter.data.Fruit

@BindingAdapter("app:items")
fun setItems(recyclerView: RecyclerView, items : List<Fruit>){
    (recyclerView.adapter as MainAdapter).submitList(items)
}