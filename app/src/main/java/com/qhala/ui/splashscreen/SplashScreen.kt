package com.qhala.ui.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qhala.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen_activity)
    }
}