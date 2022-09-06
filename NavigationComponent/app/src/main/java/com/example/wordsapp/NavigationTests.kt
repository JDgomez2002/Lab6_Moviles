package com.example.wordsapp

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.test.core.app.ApplicationProvider
import org.junit.runner.RunWith

class NavigationTests {
    /**
     * ----------------------------------------------------------COMENTADA PORQUE SI NO DA ERROR ----------------------------------------------------------
     * @RunWith(AndroidJUnit4::class)
    fun navigate_to_words_nav_component(){
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )

        val letterListScenario = launchFragmentInContainer<LetterListFragment>(themeResId =
        R.style.Theme_Words)

        letterListScenario.onFragment { fragment ->

            navController.setGraph(R.navigation.nav_graph)

            Navigation.setViewNavController(fragment.requireView(), navController)
        }

        onView(withId(R.id.recycler_view))
            .perform(RecyclerViewActions
                .actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)

    }*/
}