package id.asep.salesproject.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.asep.salesproject.datasource.repository.FoodMealsRepository
import id.asep.salesproject.datasource.repository.implementation.FoodMealsRepositoryImpl
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(
        retrofit: Retrofit
    ): FoodMealsRepository {
        return FoodMealsRepositoryImpl(
            retrofit
        )
    }
}