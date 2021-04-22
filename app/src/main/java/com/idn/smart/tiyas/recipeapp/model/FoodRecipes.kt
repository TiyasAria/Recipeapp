package com.idn.smart.tiyas.recipeapp.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class FoodRecipes(
    @SerializedName("categories")
    val categories: List<Category>?
) : Parcelable