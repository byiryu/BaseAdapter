package com.byiryu.baseadapter.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.byiryu.baseadapter.R
import com.byiryu.baseadapter.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private val viewModel : MainViewModel by viewModel()
    private val mainAdapter : MainAdapter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        init()

    }

    private fun  init(){

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.loadItem()

        setAdapter()

    }

    private fun setAdapter(){
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
//        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)
        binding.recyclerView.adapter = mainAdapter
    }
}
