package uz.gita.shop_app.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.shop_app.data.model.CategoryData
import uz.gita.shop_app.data.model.ProductData

interface ShopRepository {
    fun getAllProducts(name:String): Flow<Result<List<CategoryData>>>
    fun getOwnProducts(): Flow<Result<List<ProductData>>>
    fun addProduct(productData: ProductData): Flow<Result<Unit>>

}