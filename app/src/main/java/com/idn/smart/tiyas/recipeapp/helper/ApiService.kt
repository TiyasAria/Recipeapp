package com.idn.smart.tiyas.recipeapp.helper

import com.idn.smart.tiyas.recipeapp.model.FoodRecipes
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("filter")
    fun getRecipe(
            @Query("Seafood") seafood : String?,
    ) : Call<FoodRecipes>
}