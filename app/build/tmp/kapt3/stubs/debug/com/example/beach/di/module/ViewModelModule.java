package com.example.beach.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH!\u00a2\u0006\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/beach/di/module/ViewModelModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/example/beach/di/ViewModelFactory;", "bindViewModelFactory$app_debug", "flightViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/example/beach/features/viewmodel/FlightViewModel;", "flightViewModel$app_debug", "hotelViewModel", "Lcom/example/beach/features/viewmodel/HotelViewModel;", "hotelViewModel$app_debug", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.beach.di.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.beach.di.annotations.ViewModelKey(value = com.example.beach.features.viewmodel.FlightViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel flightViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.beach.features.viewmodel.FlightViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.beach.di.annotations.ViewModelKey(value = com.example.beach.features.viewmodel.HotelViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel hotelViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.beach.features.viewmodel.HotelViewModel viewModel);
    
    public ViewModelModule() {
        super();
    }
}