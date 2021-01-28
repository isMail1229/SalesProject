package id.asep.salesproject.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import id.asep.salesproject.datasource.local.model.Country

@Dao
interface CountryDAO {

    @Insert
    suspend fun insert(country: Country): Long

    @Update
    suspend fun update(country: Country): Int


}