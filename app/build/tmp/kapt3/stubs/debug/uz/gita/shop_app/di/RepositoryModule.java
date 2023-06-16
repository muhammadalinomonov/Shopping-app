package uz.gita.shop_app.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Luz/gita/shop_app/di/RepositoryModule;", "", "bindAuthRepository", "Luz/gita/shop_app/domain/repository/AuthRepository;", "impl", "Luz/gita/shop_app/domain/repository/impl/AuthRepositoryImpl;", "bindShopRepository", "Luz/gita/shop_app/domain/repository/ShopRepository;", "Luz/gita/shop_app/domain/repository/impl/ShopRepositoryImpl;", "app_debug"})
@dagger.Module
public abstract interface RepositoryModule {
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.shop_app.domain.repository.AuthRepository bindAuthRepository(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.domain.repository.impl.AuthRepositoryImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.shop_app.domain.repository.ShopRepository bindShopRepository(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.domain.repository.impl.ShopRepositoryImpl impl);
}