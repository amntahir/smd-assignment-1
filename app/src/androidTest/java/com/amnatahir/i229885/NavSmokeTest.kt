package com.amnatahir.i229885

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.google.common.truth.Truth.assertThat

@RunWith(AndroidJUnit4::class)
class NavSmokeTest {
    @get:Rule
    val rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun app_launches() {
        assertThat(true).isTrue()
    }
}
