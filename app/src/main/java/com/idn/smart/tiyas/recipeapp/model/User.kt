package com.idn.smart.tiyas.recipeapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Users(
    private var uid : String = "0",
    private var name : String = "",
    private var email : String = "",
    private var photo : String = "",
    private var linkedIn : String = "",
    private var instagram : String = "",
) : Parcelable