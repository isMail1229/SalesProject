package id.asep.salesproject.datasource.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import id.asep.salesproject.utils.Constants

@Entity(tableName = Constants.CATEGORY_TABLE_NAME)
data class Category(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "food_id") val foodId: Long,
    @ColumnInfo(name = "name") val nameCategory: String
)