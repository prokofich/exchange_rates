package com.example.urrency_rate_app.data_repository

import com.example.urrency_rate_app.data_api.RetrofitInstance
import com.example.urrency_rate_app.model_beznal.Beznal
import com.example.urrency_rate_app.model_beznal.BeznalItem
import com.example.urrency_rate_app.model_nal.Nalichka
import com.example.urrency_rate_app.model_nal.NalichkaItem
import retrofit2.Response
import retrofit2.Retrofit

class Repository {

    suspend fun getNal():Response<Nalichka>{ //прерываемая реализованная функция получения ответа на запрос
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal():Response<Beznal>{ //прерываемая реализованная функция получения ответа на запрос
        return RetrofitInstance.api.getBeznalMoneys()
    }

}