package com.byiryu.baseadapter.data

data class Fruit constructor(
    var title : String? = null,
    var id :Int = -1
){

    override fun toString(): String {
        return "Fruit(title=$title, id=$id)"
    }
}