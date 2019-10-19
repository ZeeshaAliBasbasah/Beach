package com.example.beach.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/beach/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/example/beach/MVVMApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {com.example.beach.di.module.AppModule.class, dagger.android.support.AndroidSupportInjectionModule.class, com.example.beach.di.module.NetworkModule.class, com.example.beach.di.module.ActivityBuilder.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.example.beach.MVVMApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/beach/di/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcom/example/beach/MVVMApplication;", "()V", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<com.example.beach.MVVMApplication> {
        
        public Builder() {
            super();
        }
    }
}