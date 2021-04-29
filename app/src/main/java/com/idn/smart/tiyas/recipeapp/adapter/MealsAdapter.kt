package com.idn.smart.tiyas.recipeapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.idn.smart.tiyas.recipeapp.R
import com.idn.smart.tiyas.recipeapp.databinding.ItemResipeBinding
import com.idn.smart.tiyas.recipeapp.model.DetailRecipes

class MealsAdapter(var context : Context, var listMeals : List<DetailRecipes>) : RecyclerView.Adapter<MealsAdapter.MealsViewHolder>(){
    inner class MealsViewHolder(view : View) : RecyclerView.ViewHolder(view)  {
        private val itemBinding = ItemResipeBinding.bind(view)

        fun bind(recipes: DetailRecipes) {
            with(itemView) {
                itemBinding.tvNameItem.text = recipes.meals!![0].strMeal
                itemBinding.tvAsal.text = recipes.meals[0].strArea

                Glide.with(context)
                        .load(recipes.meals[0].strImageSource)
                        .into(itemBinding.ivItemMeals)

                itemView.setOnClickListener {

                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealsAdapter.MealsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_resipe, parent , false)
        return MealsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MealsAdapter.MealsViewHolder, position: Int) {
        holder.bind(listMeals[position])
    }

    override fun getItemCount(): Int = listMeals.size
}