package com.example.dagger

import android.app.Application

class App : Application()  {

    lateinit var dataSourceComponent: DataSourceComponent

    override fun onCreate() {
        super.onCreate()

       dataSourceComponent = DaggerDataSourceComponent
                               .builder()
                               .build()
    }
}