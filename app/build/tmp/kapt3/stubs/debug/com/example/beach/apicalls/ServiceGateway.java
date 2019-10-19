package com.example.beach.apicalls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/beach/apicalls/ServiceGateway;", "", "getFlight", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Lcom/example/beach/features/model/BaseFlight;", "getHotel", "Lcom/example/beach/features/model/Hotel;", "app_debug"})
public abstract interface ServiceGateway {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "bFnZQEx0")
    public abstract io.reactivex.Single<retrofit2.Response<com.example.beach.features.model.BaseFlight>> getFlight();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "f0Tm6bfy")
    public abstract io.reactivex.Single<retrofit2.Response<com.example.beach.features.model.Hotel>> getHotel();
}