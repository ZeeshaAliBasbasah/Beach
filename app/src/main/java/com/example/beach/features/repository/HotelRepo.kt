package com.example.beach.features.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.example.beach.apicalls.ServiceGateway
import com.example.beach.backend.NetworkHelper
import com.example.beach.core.BaseResponse
import com.example.beach.features.model.Hotel
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class HotelRepo @Inject constructor(
    private val serviceGateway: ServiceGateway,
    private val networkHelper: NetworkHelper
) {

    private val liveHotel = MediatorLiveData<BaseResponse<Hotel>>()

    fun fetchFromNetwork(): LiveData<BaseResponse<Hotel>> {

        val networkSource = networkHelper.serviceCall(serviceGateway.getHotel())

        liveHotel.addSource(networkSource) { response ->
            response?.data?.let {
                liveHotel.value = response
            }
        }

        return liveHotel
    }
}