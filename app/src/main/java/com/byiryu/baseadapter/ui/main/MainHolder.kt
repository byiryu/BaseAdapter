package com.byiryu.baseadapter.ui.main

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.byiryu.baseadapter.data.Fruit
import com.byiryu.baseadapter.databinding.ViewMainItemBinding
import com.byiryu.baseadapter.ui.baase.BaseViewHolder

class MainHolder constructor(itemView : View): BaseViewHolder<ViewMainItemBinding>(itemView){

    fun onBind(fruit: Fruit, viewModel: MainViewModel){
        binding.viewModel = viewModel
        binding.title.text = fruit.title

    }

}