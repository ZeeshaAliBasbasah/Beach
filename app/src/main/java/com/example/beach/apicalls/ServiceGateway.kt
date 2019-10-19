package com.example.beach.apicalls

import com.example.beach.features.model.BaseFlight
import com.example.beach.features.model.Flight
import com.example.beach.features.model.Hotel
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface ServiceGateway {
    @GET("bFnZQEx0")
    fun getFlight(): Single<Response<BaseFlight>>

    @GET("f0Tm6bfy")
    fun getHotel(): Single<Response<Hotel>>
}
