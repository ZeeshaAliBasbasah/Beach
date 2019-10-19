package com.example.beach.features.viewmodel

import androidx.lifecycle.LiveData
import com.example.beach.core.BaseResponse
import com.example.beach.core.BaseViewModel
import com.example.beach.features.model.Hotel
import com.example.beach.features.repository.HotelRepo
import javax.inject.Inject

class HotelViewModel @Inject constructor(private val repo: HotelRepo) : BaseViewModel() {

    private lateinit var hotel: LiveData<BaseResponse<Hotel>>

    fun getHotel(): LiveData<BaseResponse<Hotel>> {

        if (!::hotel.isInitialized) {
            hotel = repo.fetchFromNetwork()
        }
        return hotel
    }
}