package com.example.dwajot.daggerapp.injection.module

import com.example.dwajot.daggerapp.FirstActivity
import com.example.dwajot.daggerapp.SecondActivity
import com.example.dwajot.daggerapp.injection.scope.FirstActivityScope
import com.example.dwajot.daggerapp.injection.scope.SecondActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @FirstActivityScope
    @ContributesAndroidInjector(modules = arrayOf(FirstActivityModule::class))
    abstract fun bindFirstActivity(): FirstActivity

    @SecondActivityScope
    @ContributesAndroidInjector(modules = arrayOf(SecondActivityModule::class))
    abstract fun bindSecondActivity(): SecondActivity

}