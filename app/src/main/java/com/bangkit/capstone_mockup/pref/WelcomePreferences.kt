package com.bangkit.capstone_mockup.pref

import android.content.Context
import com.bangkit.capstone_mockup.pref.entity.WelcomeEntity

internal class WelcomePreferences (context: Context) {
    companion object {
        private const val PREFS_NAME = "WELCOME_PREF"
        private const val IS_ACTIVE = "IS_ACTIVE"
    }

    private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun setLaunchApp(value: WelcomeEntity) {
        val editor = preferences.edit()
        value.isActive?.let { editor.putBoolean(IS_ACTIVE, it) }
        editor.apply()
    }

    fun getLaunchApp(): WelcomeEntity {
        val model = WelcomeEntity()
        model.isActive = preferences.getBoolean(IS_ACTIVE, false)

        return model
    }
}