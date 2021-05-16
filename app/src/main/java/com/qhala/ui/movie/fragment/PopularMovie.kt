package com.qhala.ui.movie.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.qhala.R
import com.qhala.data.db.entity.Movie
import com.qhala.data.repository.Resource
import com.qhala.databinding.PopularMovieFragmentBinding
import com.qhala.ui.movie.adapter.MovieAdapter
import com.qhala.ui.movie.viewmodel.MovieViewModel
import com.qhala.util.Keys
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import timber.log.Timber

@AndroidEntryPoint
class PopularMovie : Fragment(R.layout.popular_movie_fragment) {

    private lateinit var binding: PopularMovieFragmentBinding

    private val viewModel by viewModels<MovieViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = PopularMovieFragmentBinding.bind(view)

        observeMovies()
        viewModel.fetchMovies(Keys.apiKey())

        observeMoviesOffline()

    }


    private fun observeMovies() {
        viewModel.movieResponse.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Success -> {
                    lifecycleScope.launch {

                        viewModel.saveMovie(it.value.results)
                      
                        recyclerMovies(it.value.results)

                    }
                }
                is Resource.Failure -> {
                    Timber.d("Failed Fetching")
                }
                else -> Timber.d("No Internet")
            }
        })
    }

    private fun observeMoviesOffline() {
        viewModel.fetchMoviesOffline.observe(viewLifecycleOwner, {
            recyclerMovies(it)
        })
    }

    private fun recyclerMovies(movie: List<Movie>) {
        binding.recyclerViewMovies.apply {
            layoutManager = LinearLayoutManager(requireContext())
            hasFixedSize()
            adapter = MovieAdapter(movie)
        }
    }
}