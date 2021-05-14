package com.qhala.ui.movie.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.qhala.data.db.entity.Movie
import com.qhala.data.network.MovieResponse
import com.qhala.data.repository.MovieRepository
import com.qhala.data.repository.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val repository: MovieRepository
) : ViewModel() {

    private val _movieResponse: MutableLiveData<Resource<MovieResponse>> = MutableLiveData()

    val movieResponse: LiveData<Resource<MovieResponse>>
        get() = _movieResponse

    fun fetchCourses(key: String) = viewModelScope.launch {
        _movieResponse.value = Resource.Loading
        _movieResponse.value = repository.getMovies(key)
    }

    fun saveMovie(movies: List<Movie>) = viewModelScope.launch {
        repository.saveMovie(movies)
    }

    fun fetchMovies() {
        repository.fetchMovies()
    }

}