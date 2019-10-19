package com.example.beach.features.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/example/beach/features/activity/FlightActivity;", "Lcom/example/beach/core/BaseActivity;", "Lcom/example/beach/databinding/ActivityMainBinding;", "Lcom/example/beach/features/viewmodel/FlightViewModel;", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getLayoutRes", "", "getVMFactory", "hideProgressBar", "", "inflateRecyclerView", "albums", "", "Lcom/example/beach/features/model/Flight;", "initViewModel", "viewModel", "onInject", "showError", "message", "", "showProgressBar", "app_debug"})
public final class FlightActivity extends com.example.beach.core.BaseActivity<com.example.beach.databinding.ActivityMainBinding, com.example.beach.features.viewmodel.FlightViewModel> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.ViewModelProvider.Factory getVMFactory() {
        return null;
    }
    
    @java.lang.Override()
    public void onInject() {
    }
    
    @java.lang.Override()
    public void initViewModel(@org.jetbrains.annotations.NotNull()
    com.example.beach.features.viewmodel.FlightViewModel viewModel) {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    private final void showProgressBar() {
    }
    
    private final void inflateRecyclerView(java.util.List<? extends com.example.beach.features.model.Flight> albums) {
    }
    
    private final void hideProgressBar() {
    }
    
    public FlightActivity() {
        super(null);
    }
}