package com.amnatahir.i229885

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BottomBarTest {
    @get:Rule
    val rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun click_bottom_buttons_does_not_crash() {
        onView(withId(R.id.btnt1)).perform(click())
        onView(withId(R.id.btnt2)).perform(click())
        onView(withId(R.id.btnt3)).perform(click())
        onView(withId(R.id.btnt4)).perform(click())
        onView(withId(R.id.btnt5)).perform(click())
    }
}
