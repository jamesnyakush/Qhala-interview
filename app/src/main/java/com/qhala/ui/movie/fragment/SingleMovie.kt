package com.qhala.ui.movie.fragment

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.qhala.R
import com.qhala.data.db.entity.Movie
import com.qhala.databinding.SingleMovieFragmentBinding
import com.qhala.util.loadImage
import com.qhala.util.simpleFormatedDate
import com.qhala.util.simpleFormatedDates
import dagger.hilt.android.AndroidEntryPoint




@AndroidEntryPoint
class SingleMovie : Fragment(R.layout.single_movie_fragment) {

    private lateinit var binding: SingleMovieFragmentBinding

    private val args: SingleMovieArgs by navArgs()

    private lateinit var movie: Movie

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = SingleMovieFragmentBinding.bind(view)

        movie = args.movie

        Glide.with(this)
            .load(loadImage(movie.backdrop_path))
            .transition(DrawableTransitionOptions.withCrossFade())
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(binding.banner)

        binding.title.text = movie.title
        binding.overview.text = movie.overview
        binding.release.text = movie.release_date
        binding.voteAverage.rating = movie.vote_average.toFloat()
    }
}