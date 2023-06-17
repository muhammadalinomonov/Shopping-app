package uz.gita.shop_app.ui.screen.main.addproduct;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract;", "", "Direction", "Intent", "SideEffect", "UiState", "ViewModel", "app_debug"})
public abstract interface AddProductScreenContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent;", "", "AddCategory", "AddProduct", "Back", "LoadCategories", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent$AddCategory;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent$AddProduct;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent$Back;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent$LoadCategories;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent$Back;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent;", "()V", "app_debug"})
        public static final class Back implements uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent.Back INSTANCE = null;
            
            private Back() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent$LoadCategories;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent;", "()V", "app_debug"})
        public static final class LoadCategories implements uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent.LoadCategories INSTANCE = null;
            
            private LoadCategories() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent$AddCategory;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent;", "category", "", "(Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class AddCategory implements uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String category = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent.AddCategory copy(@org.jetbrains.annotations.NotNull
            java.lang.String category) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public AddCategory(@org.jetbrains.annotations.NotNull
            java.lang.String category) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getCategory() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0019"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent$AddProduct;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent;", "productName", "", "price", "description", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getDescription", "getPrice", "getProductName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class AddProduct implements uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String productName = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String price = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String description = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String category = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent.AddProduct copy(@org.jetbrains.annotations.NotNull
            java.lang.String productName, @org.jetbrains.annotations.NotNull
            java.lang.String price, @org.jetbrains.annotations.NotNull
            java.lang.String description, @org.jetbrains.annotations.NotNull
            java.lang.String category) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public AddProduct(@org.jetbrains.annotations.NotNull
            java.lang.String productName, @org.jetbrains.annotations.NotNull
            java.lang.String price, @org.jetbrains.annotations.NotNull
            java.lang.String description, @org.jetbrains.annotations.NotNull
            java.lang.String category) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getProductName() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getPrice() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getDescription() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getCategory() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Direction;", "", "back", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Direction {
        
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object back(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$UiState;", "", "Categories", "Loading", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$UiState$Categories;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$UiState$Loading;", "app_debug"})
    public static abstract interface UiState {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$UiState$Loading;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$UiState;", "()V", "app_debug"})
        public static final class Loading implements uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.UiState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$UiState$Categories;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$UiState;", "list", "", "", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Categories implements uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.UiState {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<java.lang.String> list = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.UiState.Categories copy(@org.jetbrains.annotations.NotNull
            java.util.List<java.lang.String> list) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Categories(@org.jetbrains.annotations.NotNull
            java.util.List<java.lang.String> list) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<java.lang.String> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<java.lang.String> getList() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$SideEffect;", "", "HasError", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$SideEffect$HasError;", "app_debug"})
    public static abstract interface SideEffect {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$SideEffect$HasError;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$SideEffect;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class HasError implements uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.SideEffect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.SideEffect.HasError copy(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public HasError(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$ViewModel;", "Lorg/orbitmvi/orbit/ContainerHost;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$UiState;", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$SideEffect;", "onEventDispatcher", "", "intent", "Luz/gita/shop_app/ui/screen/main/addproduct/AddProductScreenContract$Intent;", "app_debug"})
    public static abstract interface ViewModel extends org.orbitmvi.orbit.ContainerHost<uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.UiState, uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.SideEffect> {
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.shop_app.ui.screen.main.addproduct.AddProductScreenContract.Intent intent);
    }
}