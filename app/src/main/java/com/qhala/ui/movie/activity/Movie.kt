package com.qhala.ui.movie.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.viewModels
import com.qhala.R
import com.qhala.databinding.MovieActivityBinding
import com.qhala.ui.movie.viewmodel.MovieViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Movie : AppCompatActivity() {
    private var nightModeActive = false

    private val viewModel by viewModels<MovieViewModel>()

    private lateinit var binding: MovieActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MovieActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observeDarkTheme()
    }

    private fun observeDarkTheme() {
        viewModel.darkThemeEnabled.observe(this) { nightModeActive ->
            this.nightModeActive = nightModeActive

            val defaultMode = if (nightModeActive) {
                AppCompatDelegate.MODE_NIGHT_YES
            } else {
                AppCompatDelegate.MODE_NIGHT_NO
            }

            AppCompatDelegate.setDefaultNightMode(defaultMode)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.overflow_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.dayNightMode) {
            viewModel.toggleNightMode()
        }
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        if (nightModeActive) {
            menu?.findItem(R.id.dayNightMode)?.setIcon(R.drawable.icn_night_mode)
        } else {
            menu?.findItem(R.id.dayNightMode)?.setIcon(R.drawable.icn_light_mode)
        }
        return true
    }
}