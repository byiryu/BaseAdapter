package com.byiryu.baseadapter.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.byiryu.baseadapter.data.Fruit
import java.util.*
import kotlin.collections.ArrayList

class MainViewModel : ViewModel(){
    private val _items = MutableLiveData<List<Fruit>>().apply { value =
        Collections.emptyList()
    }
    val items : LiveData<List<Fruit>> = _items
    
    fun loadItem(){
        
        var item = ArrayList<Fruit>()
        item.add(Fruit("사과", 0))
        item.add(Fruit("복숭아", 1))
        item.add(Fruit("자두", 2))
        item.add(Fruit("바나나", 3))
        item.add(Fruit("포도", 4))
        item.add(Fruit("귤", 5))
        item.add(Fruit("오렌지", 6))
        item.add(Fruit("라임", 7))
        item.add(Fruit("레몬", 8))
        item.add(Fruit("귤", 9))

        _items.value = item

    }
    
    

}