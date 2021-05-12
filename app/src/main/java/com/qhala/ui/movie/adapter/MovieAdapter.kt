package com.qhala.ui.movie.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qhala.data.db.entity.Movie
import com.qhala.databinding.ItemMoviesBinding

class MovieAdapter(
    private val movies: List<Movie>
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MovieViewHolder(
        ItemMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) = with(holder.binding) {
        val movie = movies[position]

        title.text = movie.title
        releaseDate.text = movie.release_date
        star.text = movie.vote_average.toString()
    }

    override fun getItemCount() = movies.size

    class MovieViewHolder(val binding: ItemMoviesBinding) : RecyclerView.ViewHolder(binding.root)
}