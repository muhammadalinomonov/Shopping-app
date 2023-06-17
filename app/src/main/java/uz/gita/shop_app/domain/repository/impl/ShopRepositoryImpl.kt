package uz.gita.shop_app.domain.repository.impl

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import uz.gita.shop_app.data.model.CategoryData
import uz.gita.shop_app.data.model.ProductData
import uz.gita.shop_app.domain.repository.ShopRepository
import uz.gita.shopappexam.data.locale.SharedPref
import javax.inject.Inject


class ShopRepositoryImpl @Inject constructor() : ShopRepository {
    private val db = Firebase.firestore

    private var hasCategory = false
    private val list = arrayListOf<ProductData>()

    @Inject
    lateinit var sharedPref: SharedPref

    override fun getAllProducts(name: String): Flow<Result<List<CategoryData>>> = flow {
        emit(getList(name))
    }

    override fun getOwnProducts(): Flow<Result<List<ProductData>>> = flow {
        emit(Result.success(list))
    }


    override fun addProduct(productData: ProductData): Flow<Result<Unit>> = flow {
        Log.d("AAA", "addProduct")
        try {
            Log.d("AAA", "addProduct try")
            val a = db.collection("category")
                .get()
                .await()

            a.documents.forEach {
                if (productData.category == it.get("name")) {
                    hasCategory = true
                    it.reference.collection("items")
                        .add(productData)
                        .await()
                }
            }
            if (!hasCategory) {
                var documentId = ""
                db.collection("category")
                    .add(MyDocument(0, productData.category))
                    .addOnSuccessListener { it ->
                        documentId = it.id
                        db.collection("category").document(documentId)
                            .collection("items")
                            .add(productData)
                    }
                    .await()

                a.documents.forEach {
                    if (productData.category == it.get("name")) {
                        it.reference.collection("items")
                            .add(productData)
                            .await()
                    }
                }
            }
            emit(Result.success(Unit))

        } catch (e: Exception) {
            emit(Result.failure(e))
        }
    }

    override fun addCategory(name: String): Flow<Result<List<String>>> = flow {
        try {
            Log.d("bbb", "addProduct try")
            val a = db.collection("category")
                .get()
                .await()

            db.collection("category")
                .add(MyDocument(0, name))
                .await()

            val resultList = arrayListOf<String>()

            a.documents.forEach { it ->

                resultList.add(it.get("name") as String)
            }

            emit(Result.success(resultList))

        } catch (e: Exception) {
            emit(Result.failure(e))
        }
    }

    override fun getCategories(): Flow<Result<List<String>>> = flow {
        try {
            val a = db.collection("category")
                .get()
                .await()
            val resultList = arrayListOf<String>()

            a.documents.forEach { it ->
                resultList.add(
                    it.get("name") as String
                )
            }
            emit(Result.success(resultList))
        } catch (e: Exception) {
            emit(Result.failure(e))
        }
    }


    private suspend fun getList(name: String): Result<List<CategoryData>> {
        try {
            val a = db.collection("category")
                .get()
                .await()
            val resultList = arrayListOf<CategoryData>()

            a.documents.forEach { it ->
                val productList = arrayListOf<ProductData>()

                val subCollection = it.reference.collection("items")
                    .get()
                    .await()

                subCollection.forEach { product ->
                    productList.add(product.toObject(ProductData::class.java))
                    if (productList.last().userId == sharedPref.email && !list.contains(
                            productList.last()
                        )
                    ) {
                        list.add(product.toObject(ProductData::class.java))
                    }
                }

                if ((it.get("name") as String).startsWith(name)) {
                    resultList.add(
                        CategoryData(
                            id = it.get("id") as Long,
                            name = it.get("name") as String,
                            items = productList
                        )
                    )
                }
            }
            return Result.success(resultList)
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }

}

data class MyDocument(val id: Long = 0, val name: String = "")
