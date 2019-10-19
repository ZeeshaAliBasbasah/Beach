package com.example.beach.di.module

import com.example.beach.features.activity.FlightActivity
import com.example.beach.di.annotations.ActivityScope
import com.example.beach.features.activity.HotelActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [(FragmentBuilder::class)])
    internal abstract fun bindFlightActivity(): FlightActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [(FragmentBuilder::class)])
    internal abstract fun bindHotelActivity(): HotelActivity

}
