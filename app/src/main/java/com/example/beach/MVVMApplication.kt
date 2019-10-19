package com.example.beach

import com.example.beach.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MVVMApplication : DaggerApplication() {

    /*companion object {
        private lateinit var sInstance: MVVMApplication
        fun getInstance(): MVVMApplication {
            return sInstance
        }
    }
*/
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
            .builder()
            .create(this)
    }

    override fun onCreate() {
        super.onCreate()
        // sInstance = this
    }
}