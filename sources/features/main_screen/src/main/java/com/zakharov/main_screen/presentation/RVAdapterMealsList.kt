package com.zakharov.main_screen.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zakharov.main_screen.data.entities.Meal
import com.zakharov.main_screen.databinding.RvItemMealBinding

class RVAdapterMealsList(
    private val onClick: (Meal) -> Unit
) : RecyclerView.Adapter<MealsListViewHolder>() {

    private val meals: MutableList<Meal> = emptyList<Meal>().toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealsListViewHolder {
        val binding = RvItemMealBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MealsListViewHolder(binding)
    }

    override fun getItemCount() = meals.size

    override fun onBindViewHolder(holder: MealsListViewHolder, position: Int) {
        val item = meals[position]
        holder.binding.root.setOnClickListener {
            onClick(item)
        }
        Glide.with(holder.binding.root.context)
            .load(item.pictureURL)
            .into(holder.binding.photo)
        holder.binding.sourceName.text = item.name
    }

    fun addItems(mealsList: List<Meal>) {
        meals.addAll(mealsList)
    }
}

class MealsListViewHolder(val binding: RvItemMealBinding) : RecyclerView.ViewHolder(binding.root)
