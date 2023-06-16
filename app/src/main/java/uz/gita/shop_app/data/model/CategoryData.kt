package uz.gita.shop_app.data.model

data class CategoryData(
    val id: Long = 0,
    val name: String,
    val items: List<ProductData>
)