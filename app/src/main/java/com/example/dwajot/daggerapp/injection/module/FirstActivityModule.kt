package com.example.dwajot.daggerapp.injection.module

import com.example.dwajot.daggerapp.entity.FirstActivityTime
import com.example.dwajot.daggerapp.injection.scope.FirstActivityScope
import dagger.Module
import dagger.Provides

@Module
open class FirstActivityModule {

    @FirstActivityScope
    @Provides
    fun firstActivityTime(): FirstActivityTime = FirstActivityTime
}