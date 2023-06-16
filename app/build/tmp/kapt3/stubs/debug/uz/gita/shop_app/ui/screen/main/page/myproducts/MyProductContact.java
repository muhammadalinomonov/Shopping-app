package uz.gita.shop_app.ui.screen.main.page.myproducts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact;", "", "Intent", "Model", "SideEffect", "UiState", "app_debug"})
public abstract interface MyProductContact {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Intent;", "", "LoadData", "OpenAddProduct", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Intent$LoadData;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Intent$OpenAddProduct;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Intent$OpenAddProduct;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Intent;", "()V", "app_debug"})
        public static final class OpenAddProduct implements uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.Intent.OpenAddProduct INSTANCE = null;
            
            private OpenAddProduct() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Intent$LoadData;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Intent;", "()V", "app_debug"})
        public static final class LoadData implements uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.Intent.LoadData INSTANCE = null;
            
            private LoadData() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$UiState;", "", "Loading", "Products", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$UiState$Loading;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$UiState$Products;", "app_debug"})
    public static abstract interface UiState {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$UiState$Loading;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$UiState;", "()V", "app_debug"})
        public static final class Loading implements uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.UiState {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.UiState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$UiState$Products;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$UiState;", "list", "", "Luz/gita/shop_app/data/model/ProductData;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Products implements uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.UiState {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<uz.gita.shop_app.data.model.ProductData> list = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.UiState.Products copy(@org.jetbrains.annotations.NotNull
            java.util.List<uz.gita.shop_app.data.model.ProductData> list) {
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
            
            public Products(@org.jetbrains.annotations.NotNull
            java.util.List<uz.gita.shop_app.data.model.ProductData> list) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<uz.gita.shop_app.data.model.ProductData> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<uz.gita.shop_app.data.model.ProductData> getList() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$SideEffect;", "", "HasError", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$SideEffect$HasError;", "app_debug"})
    public static abstract interface SideEffect {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$SideEffect$HasError;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$SideEffect;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class HasError implements uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.SideEffect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.SideEffect.HasError copy(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Model;", "Lorg/orbitmvi/orbit/ContainerHost;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$UiState;", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$SideEffect;", "onEventDispatcher", "", "intent", "Luz/gita/shop_app/ui/screen/main/page/myproducts/MyProductContact$Intent;", "app_debug"})
    public static abstract interface Model extends org.orbitmvi.orbit.ContainerHost<uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.UiState, uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.SideEffect> {
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.shop_app.ui.screen.main.page.myproducts.MyProductContact.Intent intent);
    }
}