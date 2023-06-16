package uz.gita.shop_app.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.shop_app.domain.repository.AuthRepository
import uz.gita.shop_app.domain.repository.ShopRepository
import uz.gita.shop_app.domain.repository.impl.AuthRepositoryImpl
import uz.gita.shop_app.domain.repository.impl.ShopRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @[Binds Singleton]
    fun bindAuthRepository(impl: AuthRepositoryImpl): AuthRepository

    @[Binds Singleton]
    fun bindShopRepository(impl: ShopRepositoryImpl): ShopRepository

}