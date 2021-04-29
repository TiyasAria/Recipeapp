package com.idn.smart.tiyas.recipeapp.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class DetailRecipes(
    @SerializedName("meals")
    val meals: List<MealX>?
) : Parcelable