package com.example.dagger

import dagger.Component

@Component(modules = [DataSourceModule::class])
interface DataSourceComponent {
    fun inject(mainActivity: MainActivity)
}