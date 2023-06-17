package uz.gita.shop_app.domain.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00f8\u0001\u0000J\u001f\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0016\u00f8\u0001\u0000J%\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00f8\u0001\u0000J\u001d\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u0011H\u0016\u00f8\u0001\u0000J0\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00130\u00120\u0011H\u0016\u00f8\u0001\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006 "}, d2 = {"Luz/gita/shop_app/domain/repository/impl/ShopRepositoryImpl;", "Luz/gita/shop_app/domain/repository/ShopRepository;", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "hasCategory", "", "list", "Ljava/util/ArrayList;", "Luz/gita/shop_app/data/model/ProductData;", "sharedPref", "Luz/gita/shopappexam/data/locale/SharedPref;", "getSharedPref", "()Luz/gita/shopappexam/data/locale/SharedPref;", "setSharedPref", "(Luz/gita/shopappexam/data/locale/SharedPref;)V", "addCategory", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "", "name", "addProduct", "", "productData", "getAllProducts", "Luz/gita/shop_app/data/model/CategoryData;", "getCategories", "getList", "getList-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOwnProducts", "app_debug"})
public final class ShopRepositoryImpl implements uz.gita.shop_app.domain.repository.ShopRepository {
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    private boolean hasCategory = false;
    private final java.util.ArrayList<uz.gita.shop_app.data.model.ProductData> list = null;
    @javax.inject.Inject
    public uz.gita.shopappexam.data.locale.SharedPref sharedPref;
    
    @javax.inject.Inject
    public ShopRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.shopappexam.data.locale.SharedPref getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull
    uz.gita.shopappexam.data.locale.SharedPref p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.shop_app.data.model.CategoryData>>> getAllProducts(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.shop_app.data.model.ProductData>>> getOwnProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<kotlin.Unit>> addProduct(@org.jetbrains.annotations.NotNull
    uz.gita.shop_app.data.model.ProductData productData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<java.lang.String>>> addCategory(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<java.lang.String>>> getCategories() {
        return null;
    }
}