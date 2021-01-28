package id.asep.salesproject.datasource.repository.mapper

import id.asep.salesproject.datasource.local.model.Category
import id.asep.salesproject.datasource.local.model.Country
import id.asep.salesproject.datasource.local.model.Foods
import id.asep.salesproject.datasource.remote.model.Meal


fun Meal.toFoodEntity(rowId: Long = 0L): Foods {
    return Foods(
        id = rowId,
        name = this.name ?: "",
        serverId = this.id ?: -1L,
        tag = this.tags ?: "",
        area = this.area ?: "",
        thumbnail = this.thumbnail ?: "",
        category = this.category ?: ""
    )
}

fun Meal.toCategory(rowId: Long = 0L): Category {
    return Category(
        id = rowId,
        foodId = this.id ?: -1L,
        nameCategory = this.category ?: "",
    )
}

fun Meal.toCountry(rowId: Long = 0L): Country {
    return Country(
        id = rowId,
        foodId = this.id ?: -1L,
        nameCountry = this.area ?: ""
    )
}