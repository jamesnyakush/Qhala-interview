package com.qhala.ui.movie.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.qhala.R
import com.qhala.data.db.entity.Movie
import com.qhala.databinding.PopularMovieFragmentBinding
import com.qhala.ui.movie.adapter.MovieAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PopularMovie : Fragment(R.layout.popular_movie_fragment) {

    private lateinit var binding: PopularMovieFragmentBinding

    val gen = listOf(
        1,
        2,
        3
    )
    val movies = listOf(
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Kifuua inauma",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222),
        Movie(true,"",gen,1,"Tom Clancy's Without Remorse","Tom Clancy's Without Remorse","Tom Clancy's Without Remorse",5972.653,"","2021-04-29","Tom Clancy's Without Remorse",false,2.2,2222)
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = PopularMovieFragmentBinding.bind(view)

        binding.recyclerViewMovies.apply {
            layoutManager = LinearLayoutManager(requireContext())
            hasFixedSize()
            adapter = MovieAdapter(movies)
        }
    }
}