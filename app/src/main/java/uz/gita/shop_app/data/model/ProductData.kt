package uz.gita.shop_app.data.model

data class ProductData(
    val id: Long = 0,
    val userId: String = "",
    val name: String = "",
    val price: String = "",
    val description: String = "",
    val category: String = "",
    val imageUrl: String = ""
)
