package com.example.beach.features.repository

import androidx.lifecycle.MediatorLiveData
import com.example.beach.BaseTest
import com.example.beach.apicalls.ServiceGateway
import com.example.beach.backend.NetworkHelper
import com.example.beach.core.BaseResponse
import com.example.beach.features.model.BaseFlight
import com.example.beach.features.model.Hotel
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito

class HotelRepoTest : BaseTest() {

    @InjectMocks
    lateinit var hotelRepo: HotelRepo

    @Mock
    lateinit var serviceGateway: ServiceGateway

    @Mock
    lateinit var networkHelper: NetworkHelper

    @Mock
    lateinit var liveHotel: MediatorLiveData<BaseResponse<Hotel>>

    @Test
    fun `Fetch Album Success`() {

        val baseFlight = Mockito.mock(Hotel::class.java)

        val responseObj = BaseResponse<Hotel>()
        responseObj.data = baseFlight

        liveHotel.value = responseObj

        Mockito.`when`(networkHelper.serviceCall(serviceGateway.getHotel())).thenReturn(liveHotel)
        hotelRepo.fetchFromNetwork()

        verify(liveHotel).value = responseObj
    }
}