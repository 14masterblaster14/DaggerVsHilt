package com.example.dagger

import dagger.Module
import dagger.Provides

@Module
class DataSourceModule {

    @Provides
    fun providesDataSource(): DataSource{
        return DataSource()
    }
}