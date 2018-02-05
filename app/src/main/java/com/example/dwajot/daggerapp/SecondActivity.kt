package com.example.dwajot.daggerapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dwajot.daggerapp.entity.AppTime
import com.example.dwajot.daggerapp.entity.SecondActivityTime
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_second.*
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    @Inject lateinit var appTime : AppTime
    @Inject lateinit var secondActivityTime : SecondActivityTime

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        AndroidInjection.inject(this)
        tvAppTime.text = appTime.time
        tvSecondActivityTime.text = secondActivityTime.time
    }
}
