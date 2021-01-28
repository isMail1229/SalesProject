package id.asep.salesproject.datasource.repository

interface FoodMealsRepository {

    suspend fun getLatesFoodMeals()
}