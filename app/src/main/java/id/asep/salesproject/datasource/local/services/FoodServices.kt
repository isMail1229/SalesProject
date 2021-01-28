package id.asep.salesproject.datasource.local.services

import id.asep.salesproject.datasource.local.model.Category
import id.asep.salesproject.datasource.local.model.Country
import id.asep.salesproject.datasource.local.model.Foods
import id.asep.salesproject.datasource.local.model.Ingredients

interface FoodServices {

    suspend fun insertFood(foods: Foods): Long

    suspend fun insertistFood(listFood: List<Foods>): LongArray

    suspend fun updateFood(foods: Foods): Int

    suspend fun insertCategory(category: Category): Long

    suspend fun insertListCategory(listCategory: List<Category>): LongArray

    suspend fun updateCategory(category: Category): Int

    suspend fun insertCountry(country: Country): Long

    suspend fun insertListCountry(listCountry: List<Country>): LongArray

    suspend fun updateCountry(country: Country): Int

    suspend fun insertIngredient(ingredients: Ingredients): Long

    suspend fun inserListIngredient(listIngredient: List<Ingredients>): LongArray

    suspend fun updateIngredient(ingredients: Ingredients): Int
}