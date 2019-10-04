package com.lambdaschool.congressdata

import junit.framework.Assert.assertEquals
import org.junit.Test

class OverviewUnitTest {

    //val personOverview = mock(CongresspersonOverview::class.java)
    val officialOverview = OfficialOverview("TYLER", "JAMES", "CLAWSON", "D", "NY", "1")


    @Test
    fun testDisplayName() {
        //val displayName = officialOverview.displayName
        val expected = "Tyler James Clawson"

        val result = officialOverview.displayName

        assertEquals(expected, result)
    }


}
