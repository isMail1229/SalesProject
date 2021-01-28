package id.asep.salesproject.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import id.asep.salesproject.datasource.local.model.Category

@Dao
interface CategoryDAO {

    @Insert
    suspend fun insert(category: Category): Long

    @Insert
    suspend fun insert(category: List<Category>): LongArray

    @Update
    suspend fun update(category: Category): Int
}