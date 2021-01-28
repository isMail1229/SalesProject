package id.asep.salesproject.datasource.remote.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseMeals<T>(
        val meals: List<T>
)