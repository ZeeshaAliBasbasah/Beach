package com.example.beach.features.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.example.beach.apicalls.ServiceGateway
import com.example.beach.backend.NetworkHelper
import com.example.beach.core.BaseResponse
import com.example.beach.features.model.BaseFlight
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class FlightRepo @Inject constructor(
    private val serviceGateway: ServiceGateway,
    private val networkHelper: NetworkHelper
) {

    private val liveFlight = MediatorLiveData<BaseResponse<BaseFlight>>()

    fun fetchFromNetwork(): LiveData<BaseResponse<BaseFlight>> {

        val networkSource = networkHelper.serviceCall(serviceGateway.getFlight())

        liveFlight.addSource(networkSource) { response ->
            response?.data?.let {
                liveFlight.value = response
            }
        }

        return liveFlight
    }
}