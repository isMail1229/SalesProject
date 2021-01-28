package id.asep.salesproject.datasource.local.model

data class Foods(
    val id: Long,
    val serverId: Long,
    val name: String,
    val tags: String,
    val thumbnail: String,
    val category: String,
    val area: String
)