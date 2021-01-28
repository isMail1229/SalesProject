package id.asep.salesproject.datasource.remote.services

import com.haroldadmin.cnradapter.NetworkResponse
import id.asep.salesproject.datasource.remote.model.Meal
import id.asep.salesproject.datasource.remote.model.ResponseError
import id.asep.salesproject.datasource.remote.model.ResponseMeals
import retrofit2.http.GET

interface FoodMealsServices {

    @GET("/latest.php")
    suspend fun getLatesMeals(): NetworkResponse<ResponseMeals<Meal>, ResponseError>
}