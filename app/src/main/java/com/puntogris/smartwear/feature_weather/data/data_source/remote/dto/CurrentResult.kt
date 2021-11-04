package com.puntogris.smartwear.feature_weather.data.data_source.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrentResult(

    @SerialName("temp")
    val temperature: Float,

    @SerialName("weather")
    val weather: List<WeatherDetailsResult>

)