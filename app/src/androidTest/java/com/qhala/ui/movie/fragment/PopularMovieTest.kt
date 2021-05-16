package com.qhala.ui.movie.fragment

import android.view.View
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import com.agoda.kakao.recycler.KRecyclerItem
import com.agoda.kakao.recycler.KRecyclerView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.screen.Screen.Companion.onScreen
import com.agoda.kakao.text.KTextView
import com.qhala.R
import com.qhala.ui.movie.activity.Movie
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.hamcrest.Matcher
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

private const val LIST_SIZE = 20

@MediumTest
@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class PopularMovieTest {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val activityScenarioRule = ActivityScenarioRule(Movie::class.java)


    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun on_start_recycler_has_20_items() {
        onScreen<PopularMovieScreen> {
            movieList {
                hasSize(LIST_SIZE)
            }
        }
    }


    @Test
    fun movie_info_isDisplayed() {
        onScreen<PopularMovieScreen> {
            movieList {
                isDisplayed()
                firstChild<PopularMovieScreen.MovieItem> {
                    isVisible()
                    title { hasText("Godzilla vs. Kong") }
                    date { hasText("2021-03-24") }
                    star { hasText("8.1") }
                }
            }
        }
        Unit
        Screen.idle(3000)
    }
}

class PopularMovieScreen : Screen<PopularMovieScreen>() {
    val movieList = KRecyclerView(
        builder = { withId(R.id.recycler_view_movies) },
        itemTypeBuilder = {
            itemType(::MovieItem)
        }
    )

    internal class MovieItem(parent: Matcher<View>) : KRecyclerItem<MovieItem>(parent) {
        val title = KTextView(parent) { withId(R.id.title) }
        val date = KTextView(parent) { withId(R.id.release_date) }
        val star = KTextView(parent) { withId(R.id.star) }
    }
}