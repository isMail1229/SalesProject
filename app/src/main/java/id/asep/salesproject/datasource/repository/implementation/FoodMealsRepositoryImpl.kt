package id.asep.salesproject.datasource.repository.implementation

import com.haroldadmin.cnradapter.NetworkResponse
import id.asep.salesproject.datasource.remote.services.FoodMealsServices
import id.asep.salesproject.datasource.repository.FoodMealsRepository
import retrofit2.Retrofit

class FoodMealsRepositoryImpl(
    private val retrofit: Retrofit
) : FoodMealsRepository {

    override suspend fun getLatesFoodMeals() {
        val response = retrofit.create(FoodMealsServices::class.java).getLatesMeals()
        if (response is NetworkResponse.Success) {
            val resultResponse = response.body.meals
            if (resultResponse.size > 0L) {
                resultResponse.forEach { meal ->
                    // insert data meal to local db here
                }
            }
        }
    }

}