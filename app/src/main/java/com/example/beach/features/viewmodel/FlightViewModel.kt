package com.example.beach.features.viewmodel

import androidx.lifecycle.LiveData
import com.example.beach.core.BaseResponse
import com.example.beach.core.BaseViewModel
import com.example.beach.features.model.BaseFlight
import com.example.beach.features.model.Flight
import com.example.beach.features.repository.FlightRepo
import javax.inject.Inject

class FlightViewModel @Inject constructor(private val repo: FlightRepo) : BaseViewModel() {

    private lateinit var albums: LiveData<BaseResponse<BaseFlight>>

    fun getFlight(): LiveData<BaseResponse<BaseFlight>> {

        if (!::albums.isInitialized) {
            albums = repo.fetchFromNetwork()
        }
        return albums
    }

}