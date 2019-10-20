package com.example.beach.features.repository

import androidx.lifecycle.MediatorLiveData
import com.example.beach.BaseTest
import com.example.beach.apicalls.ServiceGateway
import com.example.beach.backend.NetworkHelper
import com.example.beach.core.BaseResponse
import com.example.beach.features.model.BaseFlight
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito

class FlightRepoTest : BaseTest() {

    @InjectMocks
    lateinit var flightRepo: FlightRepo

    @Mock
    lateinit var serviceGateway: ServiceGateway

    @Mock
    lateinit var networkHelper: NetworkHelper

    @Mock
    lateinit var liveFlight: MediatorLiveData<BaseResponse<BaseFlight>>

    @Test
    fun `Fetch Album Success`() {

        val baseFlight = Mockito.mock(BaseFlight::class.java)

        val responseObj = BaseResponse<BaseFlight>()
        responseObj.data = baseFlight

        liveFlight.value = responseObj

        Mockito.`when`(networkHelper.serviceCall(serviceGateway.getFlight())).thenReturn(liveFlight)
        flightRepo.fetchFromNetwork()

        verify(liveFlight).value = responseObj
    }
}