package com.example.beach.features.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/beach/features/repository/HotelRepo;", "", "serviceGateway", "Lcom/example/beach/apicalls/ServiceGateway;", "networkHelper", "Lcom/example/beach/backend/NetworkHelper;", "(Lcom/example/beach/apicalls/ServiceGateway;Lcom/example/beach/backend/NetworkHelper;)V", "liveHotel", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/beach/core/BaseResponse;", "Lcom/example/beach/features/model/Hotel;", "fetchFromNetwork", "Landroidx/lifecycle/LiveData;", "app_debug"})
@javax.inject.Singleton()
public final class HotelRepo {
    private final androidx.lifecycle.MediatorLiveData<com.example.beach.core.BaseResponse<com.example.beach.features.model.Hotel>> liveHotel = null;
    private final com.example.beach.apicalls.ServiceGateway serviceGateway = null;
    private final com.example.beach.backend.NetworkHelper networkHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.beach.core.BaseResponse<com.example.beach.features.model.Hotel>> fetchFromNetwork() {
        return null;
    }
    
    @javax.inject.Inject()
    public HotelRepo(@org.jetbrains.annotations.NotNull()
    com.example.beach.apicalls.ServiceGateway serviceGateway, @org.jetbrains.annotations.NotNull()
    com.example.beach.backend.NetworkHelper networkHelper) {
        super();
    }
}