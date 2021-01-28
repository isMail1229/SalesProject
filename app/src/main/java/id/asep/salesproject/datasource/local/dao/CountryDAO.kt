package id.asep.salesproject.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import id.asep.salesproject.datasource.local.model.Country

@Dao
interface CountryDAO {

    @Insert
    suspend fun insert(country: Country): Long

    @Insert
    suspend fun insert(country: List<Country>): LongArray

    @Update
    suspend fun update(country: Country): Int


}