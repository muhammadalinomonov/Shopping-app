package uz.gita.shop_app.domain.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016\u00f8\u0001\u0000J%\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00100\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016\u00f8\u0001\u0000J0\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00140\u00100\u000fH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001c"}, d2 = {"Luz/gita/shop_app/domain/repository/impl/ShopRepositoryImpl;", "Luz/gita/shop_app/domain/repository/ShopRepository;", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "list", "Ljava/util/ArrayList;", "Luz/gita/shop_app/data/model/ProductData;", "sharedPref", "Luz/gita/shopappexam/data/locale/SharedPref;", "getSharedPref", "()Luz/gita/shopappexam/data/locale/SharedPref;", "setSharedPref", "(Luz/gita/shopappexam/data/locale/SharedPref;)V", "addProduct", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "productData", "getAllProducts", "", "Luz/gita/shop_app/data/model/CategoryData;", "name", "", "getList", "getList-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOwnProducts", "app_debug"})
public final class ShopRepositoryImpl implements uz.gita.shop_app.domain.repository.ShopRepository {
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
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
}