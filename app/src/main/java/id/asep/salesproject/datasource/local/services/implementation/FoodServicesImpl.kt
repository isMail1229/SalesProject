package id.asep.salesproject.datasource.local.services.implementation

import id.asep.salesproject.datasource.local.dao.CategoryDAO
import id.asep.salesproject.datasource.local.dao.CountryDAO
import id.asep.salesproject.datasource.local.dao.FoodDAO
import id.asep.salesproject.datasource.local.dao.IngredientsDAO
import id.asep.salesproject.datasource.local.model.Category
import id.asep.salesproject.datasource.local.model.Country
import id.asep.salesproject.datasource.local.model.Foods
import id.asep.salesproject.datasource.local.model.Ingredients
import id.asep.salesproject.datasource.local.services.FoodServices

class FoodServicesImpl(
    private val foodDAO: FoodDAO,
    private val categoryDAO: CategoryDAO,
    private val countryDAO: CountryDAO,
    private val ingredientsDAO: IngredientsDAO
) : FoodServices {

    override suspend fun insertFood(foods: Foods): Long {
        return foodDAO.insert(foods)
    }

    override suspend fun insertistFood(listFood: List<Foods>): LongArray {
        return foodDAO.insert(listFood)
    }

    override suspend fun updateFood(foods: Foods): Int {
        return foodDAO.update(foods)
    }

    override suspend fun insertCategory(category: Category): Long {
        return categoryDAO.insert(category)
    }

    override suspend fun insertListCategory(listCategory: List<Category>): LongArray {
        return categoryDAO.insert(listCategory)
    }

    override suspend fun updateCategory(category: Category): Int {
        return categoryDAO.update(category)
    }

    override suspend fun insertCountry(country: Country): Long {
        return countryDAO.insert(country)
    }

    override suspend fun insertListCountry(listCountry: List<Country>): LongArray {
        return countryDAO.insert(listCountry)
    }

    override suspend fun updateCountry(country: Country): Int {
        return countryDAO.update(country)
    }

    override suspend fun insertIngredient(ingredients: Ingredients): Long {
        return ingredientsDAO.insert(ingredients)
    }

    override suspend fun inserListIngredient(listIngredient: List<Ingredients>): LongArray {
        return ingredientsDAO.insert(listIngredient)
    }

    override suspend fun updateIngredient(ingredients: Ingredients): Int {
        return ingredientsDAO.update(ingredients)
    }


}