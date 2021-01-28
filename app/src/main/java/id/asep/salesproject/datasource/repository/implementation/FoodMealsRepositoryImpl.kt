package id.asep.salesproject.datasource.repository.implementation

import com.haroldadmin.cnradapter.NetworkResponse
import id.asep.salesproject.datasource.local.model.Ingredients
import id.asep.salesproject.datasource.local.services.FoodServices
import id.asep.salesproject.datasource.remote.model.Meal
import id.asep.salesproject.datasource.remote.services.FoodMealsServices
import id.asep.salesproject.datasource.repository.FoodMealsRepository
import id.asep.salesproject.datasource.repository.mapper.toFoodEntity
import retrofit2.Retrofit

class FoodMealsRepositoryImpl(
    private val retrofit: Retrofit,
    private val foodServices: FoodServices
) : FoodMealsRepository {

    override suspend fun getLatesFoodMeals() {
        val response = retrofit.create(FoodMealsServices::class.java).getLatesMeals()
        if (response is NetworkResponse.Success) {
            val resultResponse = response.body.meals
            if (resultResponse.size > 0L) {
                val listIngredients = mutableListOf<Ingredients>()
                resultResponse.forEach { meal ->
                    storeFoodToEntity(meal)

                    val ingredient1 =
                        setDataIngredients(meal.ingredient1, meal.measure1, meal.id ?: -1L)
                    listIngredients.add(ingredient1 ?: return@forEach)

                    val ingredient2 =
                        setDataIngredients(meal.ingredient2, meal.measure2, meal.id ?: -1L)
                    listIngredients.add(ingredient2 ?: return@forEach)

                    val ingredient3 =
                        setDataIngredients(meal.ingredient3, meal.measure3, meal.id ?: -1L)
                    listIngredients.add(ingredient3 ?: return@forEach)

                    val ingredient4 =
                        setDataIngredients(meal.ingredient4, meal.measure4, meal.id ?: -1L)
                    listIngredients.add(ingredient4 ?: return@forEach)

                    val ingredient5 =
                        setDataIngredients(meal.ingredient5, meal.measure5, meal.id ?: -1L)
                    listIngredients.add(ingredient5 ?: return@forEach)

                    val ingredient6 =
                        setDataIngredients(meal.ingredient6, meal.measure6, meal.id ?: -1L)
                    listIngredients.add(ingredient6 ?: return@forEach)

                    val ingredient7 =
                        setDataIngredients(meal.ingredient7, meal.measure7, meal.id ?: -1L)
                    listIngredients.add(ingredient7 ?: return@forEach)

                    val ingredient8 =
                        setDataIngredients(meal.ingredient8, meal.measure8, meal.id ?: -1L)
                    listIngredients.add(ingredient8 ?: return@forEach)

                    val ingredient9 =
                        setDataIngredients(meal.ingredient9, meal.measure9, meal.id ?: -1L)
                    listIngredients.add(ingredient9 ?: return@forEach)

                    val ingredient10 =
                        setDataIngredients(meal.ingredient10, meal.measure10, meal.id ?: -1L)
                    listIngredients.add(ingredient10 ?: return@forEach)
                    val ingredient11 =
                        setDataIngredients(meal.ingredient11, meal.measure11, meal.id ?: -1L)
                    listIngredients.add(ingredient11 ?: return@forEach)

                    val ingredient12 =
                        setDataIngredients(meal.ingredient12, meal.measure12, meal.id ?: -1L)
                    listIngredients.add(ingredient12 ?: return@forEach)

                    val ingredient13 =
                        setDataIngredients(meal.ingredient13, meal.measure13, meal.id ?: -1L)
                    listIngredients.add(ingredient13 ?: return@forEach)
                    val ingredient14 =
                        setDataIngredients(meal.ingredient14, meal.measure14, meal.id ?: -1L)
                    listIngredients.add(ingredient14 ?: return@forEach)

                    val ingredient15 =
                        setDataIngredients(meal.ingredient15, meal.measure15, meal.id ?: -1L)
                    listIngredients.add(ingredient15 ?: return@forEach)

                    val ingredient16 =
                        setDataIngredients(meal.ingredient16, meal.measure16, meal.id ?: -1L)
                    listIngredients.add(ingredient16 ?: return@forEach)

                    val ingredient17 =
                        setDataIngredients(meal.ingredient17, meal.measure17, meal.id ?: -1L)
                    listIngredients.add(ingredient17 ?: return@forEach)

                    val ingredient18 =
                        setDataIngredients(meal.ingredient18, meal.measure18, meal.id ?: -1L)
                    listIngredients.add(ingredient18 ?: return@forEach)

                    val ingredient19 =
                        setDataIngredients(meal.ingredient19, meal.measure19, meal.id ?: -1L)
                    listIngredients.add(ingredient19 ?: return@forEach)

                    val ingredient20 =
                        setDataIngredients(meal.ingredient20, meal.measure20, meal.id ?: -1L)
                    listIngredients.add(ingredient20 ?: return@forEach)
                }

                storeFoodIngredient(listIngredients)
            }
        }
    }

    private suspend fun storeFoodToEntity(meal: Meal) {
        val dataFood = meal.toFoodEntity()
        foodServices.insertFood(dataFood)
    }

    private suspend fun storeFoodIngredient(listIngredients: MutableList<Ingredients>) {
        foodServices.inserListIngredient(listIngredients)
    }

    private fun setDataIngredients(
        ingredient: String?,
        measure: String?,
        mealId: Long
    ): Ingredients? {
        if (ingredient?.isNotEmpty() == true) {
            if (measure?.isNotEmpty() == true) {
                return Ingredients(
                    0L,
                    foodId = mealId,
                    nameIngredient = ingredient,
                    nameMeasure = measure
                )
            }
        }
        return null
    }

}