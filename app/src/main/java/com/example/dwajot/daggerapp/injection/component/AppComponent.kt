package com.example.dwajot.daggerapp.injection.component

import android.app.Application
import com.example.dwajot.daggerapp.App
import com.example.dwajot.daggerapp.injection.module.ActivityBindingModule
import com.example.dwajot.daggerapp.injection.module.AppModule
import com.example.dwajot.daggerapp.injection.scope.AppScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@AppScope
@Component(modules = arrayOf(AppModule::class, ActivityBindingModule::class, AndroidInjectionModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}