package id.asep.salesproject.datasource.remote.model

data class ResponseError(
    val id: Long? = 404L,
    val errorMessage: String? = "Api Call Failure"
)