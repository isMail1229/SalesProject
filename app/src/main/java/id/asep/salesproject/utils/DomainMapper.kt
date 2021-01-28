package id.asep.salesproject.utils
/* Mapper from https://github.com/mitchtabian */

interface DomainMapper<T, DomainModel> {

    fun mapToDomainModel(model: T): DomainModel
    fun mapFromDomainModel(domainModel: DomainModel): T

}