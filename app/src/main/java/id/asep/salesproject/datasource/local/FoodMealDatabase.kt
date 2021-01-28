package id.asep.salesproject.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import id.asep.salesproject.datasource.local.dao.CategoryDAO
import id.asep.salesproject.datasource.local.dao.CountryDAO
import id.asep.salesproject.datasource.local.dao.FoodDAO
import id.asep.salesproject.datasource.local.dao.IngredientsDAO
import id.asep.salesproject.datasource.local.model.Category
import id.asep.salesproject.datasource.local.model.Country
import id.asep.salesproject.datasource.local.model.Foods
import id.asep.salesproject.datasource.local.model.Ingredients

@Database(
    entities = [
        Foods::class,
        Category::class,
        Ingredients::class,
        Country::class
    ],
    exportSchema = true,
    version = 1
)
abstract class FoodMealDatabase : RoomDatabase() {
    abstract fun foodMealsDAO(): FoodDAO
    abstract fun ingredientsDAO(): IngredientsDAO
    abstract fun countryDAO(): CountryDAO
    abstract fun categoryDAO(): CategoryDAO
}