package com.lambdaschool.congressdata

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class UIDetailTest {

    companion object {
        val LIST_ITEM_ID = 0
        val NAME_TEXT = "Rick Allen"

    }

    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun detailTitle() {

        onView(withId(R.id.layout_list)).perform(click(0, 0))

        onView(withId(R.id.profile_name)).check(matches(withText(NAME_TEXT)))

    }
}