package com.example.beach.features.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.beach.core.BaseResponse
import com.example.beach.core.BaseViewModel
import com.example.beach.features.model.Hotel
import com.example.beach.features.repository.HotelRepo
import javax.inject.Inject

class HotelViewModel @Inject constructor(private val repo: HotelRepo) : BaseViewModel() {

    private lateinit var hotel: LiveData<BaseResponse<Hotel>>
    val hotelName = MutableLiveData<String>()
    val hotelAddress = MutableLiveData<String>()
    val hotelDescription = MutableLiveData<String>()
    val rating = MutableLiveData<Int>()

    fun getHotel(): LiveData<BaseResponse<Hotel>> {

        if (!::hotel.isInitialized) {
            hotel = repo.fetchFromNetwork()
        }
        return hotel
    }

    fun displayData(hotel: Hotel) {
        hotelName.value = hotel.name
        hotelAddress.value = hotel.hotel_location
        hotelDescription.value = hotel.description
        rating.value = hotel.rating

    }
}