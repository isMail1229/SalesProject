package id.asep.salesproject.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import id.asep.salesproject.datasource.local.model.Ingredients

@Dao
interface IngredientsDAO {

    @Insert
    suspend fun insert(ingredients: Ingredients): Long

    @Insert
    suspend fun insert(ingredients: List<Ingredients>): LongArray

    @Update
    suspend fun update(ingredients: Ingredients): Int
}