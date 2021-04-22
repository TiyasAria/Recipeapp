package com.idn.smart.tiyas.recipeapp.helper

import com.idn.smart.tiyas.recipeapp.model.FoodRecipes
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("categories")
    fun getRecipe() : Call<FoodRecipes>
}