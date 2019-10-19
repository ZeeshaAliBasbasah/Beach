package com.example.beach.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton
import com.example.beach.MVVMApplication
import com.example.beach.di.module.ActivityBuilder
import com.example.beach.di.module.AppModule
import com.example.beach.di.module.NetworkModule


@Singleton
@Component(modules = [AppModule::class,
    AndroidSupportInjectionModule::class,
    NetworkModule::class, ActivityBuilder::class])

interface AppComponent : AndroidInjector<MVVMApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MVVMApplication>()
}
