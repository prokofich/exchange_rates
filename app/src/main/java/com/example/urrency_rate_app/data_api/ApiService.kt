package com.example.urrency_rate_app.data_api

import com.example.urrency_rate_app.model_beznal.Beznal
import com.example.urrency_rate_app.model_beznal.BeznalItem
import com.example.urrency_rate_app.model_nal.Nalichka
import com.example.urrency_rate_app.model_nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET
/*
интерфейс апи для отправки двух запросов
 */
interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys():Response<Nalichka> //запрос на наличку

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoneys():Response<Beznal> //запрос на безналичку

}