package com.example.urrency_rate_app.data_api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy { //сам объект ретрофита
        Retrofit.Builder()
            .baseUrl("https://api.privatbank.ua/") //сылка на банк,откуда беру курс
            .addConverterFactory(GsonConverterFactory.create()) //конвертация
            .build()
    }

    val api:ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

}