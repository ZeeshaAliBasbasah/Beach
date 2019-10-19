package com.example.beach.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.beach.di.ViewModelFactory
import com.example.beach.di.annotations.ViewModelKey
import com.example.beach.features.viewmodel.FlightViewModel
import com.example.beach.features.viewmodel.HotelViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(FlightViewModel::class)
    internal abstract fun flightViewModel(viewModel: FlightViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HotelViewModel::class)
    internal abstract fun hotelViewModel(viewModel: HotelViewModel): ViewModel
}