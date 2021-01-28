package id.asep.salesproject.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import id.asep.salesproject.datasource.local.model.Foods

@Dao
interface FoodDAO {

    @Insert
    suspend fun insert(foods: Foods): Long

    @Insert
    suspend fun insert(foods: List<Foods>): LongArray

    @Update
    suspend fun update(foods: Foods): Int
}