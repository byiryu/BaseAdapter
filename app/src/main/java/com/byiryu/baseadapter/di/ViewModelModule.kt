package com.byiryu.baseadapter.di

import com.byiryu.baseadapter.ui.main.MainAdapter
import com.byiryu.baseadapter.ui.main.MainViewModel
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


var viewModelModule = module {
    viewModel {
        MainViewModel()
    }

}

