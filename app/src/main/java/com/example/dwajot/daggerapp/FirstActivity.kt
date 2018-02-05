package com.example.dwajot.daggerapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.dwajot.daggerapp.entity.AppTime
import com.example.dwajot.daggerapp.entity.FirstActivityTime
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_first.*
import javax.inject.Inject

class FirstActivity : AppCompatActivity() {
    @Inject
    lateinit var appTime: AppTime
    @Inject
    lateinit var firstActivityTime: FirstActivityTime

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        AndroidInjection.inject(this)
        tvAppTime.text = appTime.time
        tvFirstActivityTime.text = firstActivityTime.time
        btnNextActivity.setOnClickListener {
            val intent = Intent(baseContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
