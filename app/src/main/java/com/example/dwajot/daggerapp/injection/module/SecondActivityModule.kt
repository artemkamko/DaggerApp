package com.example.dwajot.daggerapp.injection.module

import com.example.dwajot.daggerapp.entity.SecondActivityTime
import com.example.dwajot.daggerapp.injection.scope.SecondActivityScope
import dagger.Module
import dagger.Provides

@Module
open class SecondActivityModule {

    @SecondActivityScope
    @Provides
    fun secondActivityTime () : SecondActivityTime = SecondActivityTime
}