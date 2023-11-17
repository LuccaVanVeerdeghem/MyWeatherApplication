package com.example.taskapp.data

import com.example.myweatherapplication.data.ApiWeatherRepository
import com.example.myweatherapplication.data.WeatherRepository
import com.example.myweatherapplication.network.WeatherApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val weatherRepository: WeatherRepository
}

//container that takes care of dependencies
class DefaultAppContainer(): AppContainer{

    private val baseUrl = "https://api.weatherapi.com/v1/current.json?key=40d52432438b44ba8b5190616231511 "
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(
            Json.asConverterFactory("application/json".toMediaType())
        )
        .baseUrl(baseUrl)
        .build()

    private val retrofitService : WeatherApiService by lazy {
        retrofit.create(WeatherApiService::class.java)
    }


    override val weatherRepository: WeatherRepository by lazy {
        ApiWeatherRepository(retrofitService)
    }

}