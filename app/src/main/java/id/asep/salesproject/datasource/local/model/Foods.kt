package id.asep.salesproject.datasource.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import id.asep.salesproject.utils.Constants

@Entity(tableName = Constants.FOOD_TABLE_NAME)
data class Foods(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "server_id") val serverId: Long,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "tag") val tag: String,
    @ColumnInfo(name = "thumbnail") val thumbnail: String,
    @ColumnInfo(name = "category") val category: String,
    @ColumnInfo(name = "area") val area: String
)