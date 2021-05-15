package com.qhala.ui.movie.viewmodel

import androidx.lifecycle.*
import com.qhala.data.db.entity.Movie
import com.qhala.data.network.MovieResponse
import com.qhala.data.repository.MovieRepository
import com.qhala.data.repository.Resource
import com.qhala.util.PrefsStore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val repository: MovieRepository,
    private val prefsStore: PrefsStore,
) : ViewModel() {

    private val _movieResponse: MutableLiveData<Resource<MovieResponse>> = MutableLiveData()

    val movieResponse: LiveData<Resource<MovieResponse>>
        get() = _movieResponse

    val darkThemeEnabled = prefsStore.isNightMode().asLiveData()

    fun fetchMovies(key: String) = viewModelScope.launch {
        _movieResponse.value = Resource.Loading
        _movieResponse.value = repository.getMovies(key)
    }

    fun saveMovie(movies: List<Movie>) = viewModelScope.launch {
        repository.saveMovie(movies)
    }

    fun fetchMoviesOffline() {
        repository.fetchMovies()
    }

    fun toggleNightMode() {
        viewModelScope.launch {
            prefsStore.toggleNightMode()
        }
    }

}