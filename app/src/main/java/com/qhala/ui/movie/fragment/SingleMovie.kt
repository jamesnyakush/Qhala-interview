package com.qhala.ui.movie.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.qhala.R
import com.qhala.databinding.SingleMovieFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SingleMovie : Fragment(R.layout.single_movie_fragment) {

    private lateinit var binding: SingleMovieFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding =SingleMovieFragmentBinding.bind(view)

    }
}