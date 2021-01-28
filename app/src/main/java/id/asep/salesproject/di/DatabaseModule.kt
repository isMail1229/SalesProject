package id.asep.salesproject.di

import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.asep.salesproject.BaseApplication
import id.asep.salesproject.datasource.local.FoodMealDatabase
import id.asep.salesproject.datasource.local.dao.CategoryDAO
import id.asep.salesproject.datasource.local.dao.CountryDAO
import id.asep.salesproject.datasource.local.dao.FoodDAO
import id.asep.salesproject.datasource.local.dao.IngredientsDAO
import id.asep.salesproject.utils.Constants
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(app: BaseApplication): FoodMealDatabase {
        return Room.databaseBuilder(
            app,
            FoodMealDatabase::class.java,
            Constants.DATABASE_NAME
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideFoodDAO(db: FoodMealDatabase): FoodDAO {
        return db.foodMealsDAO()
    }

    @Singleton
    @Provides
    fun provideIngredientDAO(db: FoodMealDatabase): IngredientsDAO {
        return db.ingredientsDAO()
    }

    @Singleton
    @Provides
    fun provideCountryDAO(db: FoodMealDatabase): CountryDAO {
        return db.countryDAO()
    }

    @Singleton
    @Provides
    fun provideCategoryDAO(db: FoodMealDatabase): CategoryDAO {
        return db.categoryDAO()
    }
}