package com.example.beach.features.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\bJ\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/beach/features/viewmodel/HotelViewModel;", "Lcom/example/beach/core/BaseViewModel;", "repo", "Lcom/example/beach/features/repository/HotelRepo;", "(Lcom/example/beach/features/repository/HotelRepo;)V", "hotel", "Landroidx/lifecycle/LiveData;", "Lcom/example/beach/core/BaseResponse;", "Lcom/example/beach/features/model/Hotel;", "hotelAddress", "Landroidx/lifecycle/MutableLiveData;", "", "getHotelAddress", "()Landroidx/lifecycle/MutableLiveData;", "hotelDescription", "getHotelDescription", "hotelName", "getHotelName", "rating", "", "getRating", "displayData", "", "getHotel", "app_debug"})
public final class HotelViewModel extends com.example.beach.core.BaseViewModel {
    private androidx.lifecycle.LiveData<com.example.beach.core.BaseResponse<com.example.beach.features.model.Hotel>> hotel;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> hotelName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> hotelAddress = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> hotelDescription = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> rating = null;
    private final com.example.beach.features.repository.HotelRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHotelName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHotelAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHotelDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRating() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.beach.core.BaseResponse<com.example.beach.features.model.Hotel>> getHotel() {
        return null;
    }
    
    public final void displayData(@org.jetbrains.annotations.NotNull()
    com.example.beach.features.model.Hotel hotel) {
    }
    
    @javax.inject.Inject()
    public HotelViewModel(@org.jetbrains.annotations.NotNull()
    com.example.beach.features.repository.HotelRepo repo) {
        super();
    }
}