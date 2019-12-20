package com.byiryu.baseadapter.ui.main

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.byiryu.baseadapter.data.Fruit
import com.byiryu.baseadapter.databinding.ViewMainItemBinding

class MainHolder constructor(itemView : View): RecyclerView.ViewHolder(itemView){
     private val  binding : ViewMainItemBinding = DataBindingUtil.bind(itemView)!!

    fun onBind(fruit: Fruit, viewModel: MainViewModel){
        binding.viewModel = viewModel
        binding.title.text = fruit.title

    }

}