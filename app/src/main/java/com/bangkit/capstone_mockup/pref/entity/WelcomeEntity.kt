package com.bangkit.capstone_mockup.pref.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class WelcomeEntity(
    var isActive: Boolean? = false,
) : Parcelable