package com.byiryu.baseadapter.ui.baase

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T, VH : RecyclerView.ViewHolder?> constructor(callback: Callback<T>): ListAdapter<T, VH>(callback)
abstract class Callback<T> : DiffUtil.ItemCallback<T>(){
    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }
}