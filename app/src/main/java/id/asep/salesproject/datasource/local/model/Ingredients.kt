package id.asep.salesproject.datasource.local.model

data class Ingredients(
    val id : Long,
    val foodId : Long,
    val nameIngredient : String?,
    val nameMeasure : String?
)