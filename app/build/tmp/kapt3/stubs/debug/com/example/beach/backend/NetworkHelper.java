package com.example.beach.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ,\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\r0\f\"\u0004\b\u0000\u0010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00110\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/beach/backend/NetworkHelper;", "", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "dispose", "", "serviceCall", "Landroidx/lifecycle/LiveData;", "Lcom/example/beach/core/BaseResponse;", "T", "call", "Lio/reactivex/Single;", "Lretrofit2/Response;", "app_debug"})
public final class NetworkHelper {
    @org.jetbrains.annotations.Nullable()
    private io.reactivex.disposables.Disposable disposable;
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.Disposable getDisposable() {
        return null;
    }
    
    public final void setDisposable(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.Disposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>androidx.lifecycle.LiveData<com.example.beach.core.BaseResponse<T>> serviceCall(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<retrofit2.Response<T>> call) {
        return null;
    }
    
    public final void dispose() {
    }
    
    @javax.inject.Inject()
    public NetworkHelper() {
        super();
    }
}