package com.example.dwajot.daggerapp.injection.module

import com.example.dwajot.daggerapp.entity.AppTime
import com.example.dwajot.daggerapp.injection.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
open class AppModule {

    @AppScope
    @Provides
    fun appTime(): AppTime = AppTime
}