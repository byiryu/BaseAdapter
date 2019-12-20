package com.byiryu.baseadapter.di

import com.byiryu.baseadapter.ui.main.MainAdapter
import org.koin.dsl.module

var activityModule = module {
    factory {
        MainAdapter(get())
    }
}

