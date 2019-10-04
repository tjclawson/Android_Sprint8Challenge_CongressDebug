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
        val PARTY_TEXT = "Republican"
        val DISTRICT_TEXT = "GA - District 12"
        val PHONE_TEXT = "202-225-2823"

    }

    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun detailTitle() {

        onView(withId(R.id.layout_list)).perform(click(0, 0))

        onView(withId(R.id.profile_name)).check(matches(withText(NAME_TEXT)))

    }

    @Test
    fun detailParty() {

        onView(withId(R.id.layout_list)).perform(click(0, 0))

        onView(withId(R.id.profile_party)).check(matches(withText(PARTY_TEXT)))

    }

    @Test
    fun detailDistrict() {

        onView(withId(R.id.layout_list)).perform(click(0, 0))

        onView(withId(R.id.profile_district)).check(matches(withText(DISTRICT_TEXT)))

    }

    @Test
    fun detailPhone() {

        onView(withId(R.id.layout_list)).perform(click(0, 0))

        onView(withId(R.id.profile_phone)).check(matches(withText(PHONE_TEXT)))

    }
}