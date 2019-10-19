package com.example.beach.features.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/beach/features/adapter/FlightAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/beach/features/adapter/FlightAdapter$FlightsViewHolder;", "flights", "", "Lcom/example/beach/features/model/Flight;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "p1", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FlightsViewHolder", "app_debug"})
public final class FlightAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.beach.features.adapter.FlightAdapter.FlightsViewHolder> {
    private java.util.List<? extends com.example.beach.features.model.Flight> flights;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.beach.features.adapter.FlightAdapter.FlightsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.beach.features.adapter.FlightAdapter.FlightsViewHolder holder, int p1) {
    }
    
    public FlightAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.beach.features.model.Flight> flights, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/beach/features/adapter/FlightAdapter$FlightsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Lcom/example/beach/features/adapter/FlightAdapter;Landroidx/databinding/ViewDataBinding;)V", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "bind", "", "flight", "Lcom/example/beach/features/model/Flight;", "app_debug"})
    public final class FlightsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.databinding.ViewDataBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.beach.features.model.Flight flight) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ViewDataBinding getBinding() {
            return null;
        }
        
        public FlightsViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
    }
}