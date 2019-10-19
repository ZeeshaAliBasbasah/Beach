package com.example.beach.di.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.beach.MVVMApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideApplicationContext(application: MVVMApplication): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun provideApplication(application: MVVMApplication): Application {
        return application
    }

    @Provides
    @Singleton
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
    }
}
