package com.example.beach.features.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/beach/features/viewmodel/FlightViewModel;", "Lcom/example/beach/core/BaseViewModel;", "repo", "Lcom/example/beach/features/repository/FlightRepo;", "(Lcom/example/beach/features/repository/FlightRepo;)V", "albums", "Landroidx/lifecycle/LiveData;", "Lcom/example/beach/core/BaseResponse;", "Lcom/example/beach/features/model/BaseFlight;", "getFlight", "app_debug"})
public final class FlightViewModel extends com.example.beach.core.BaseViewModel {
    private androidx.lifecycle.LiveData<com.example.beach.core.BaseResponse<com.example.beach.features.model.BaseFlight>> albums;
    private final com.example.beach.features.repository.FlightRepo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.beach.core.BaseResponse<com.example.beach.features.model.BaseFlight>> getFlight() {
        return null;
    }
    
    @javax.inject.Inject()
    public FlightViewModel(@org.jetbrains.annotations.NotNull()
    com.example.beach.features.repository.FlightRepo repo) {
        super();
    }
}