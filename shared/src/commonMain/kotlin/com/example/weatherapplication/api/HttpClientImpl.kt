package com.example.weatherapplication.api

import com.example.weatherapplication.api.model.ApiWeather
import com.example.weatherapplication.repository.RequestData
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*

class HttpClientImpl(
    private val endPoint: String,
    private val httpClient: HttpClient,
    private val apiKey: String
):RequestData {
    override suspend fun getCityItemFromApi(name: String): ApiWeather =
        httpClient.get{ api("/2.5/weather?q=$name&appid=$apiKey")}

    private fun HttpRequestBuilder.api(path: String){
        url{
            takeFrom(endPoint)
            encodedPath = path
        }
    }
}