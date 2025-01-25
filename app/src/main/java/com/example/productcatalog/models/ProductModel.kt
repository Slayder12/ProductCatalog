package com.example.productcatalog.models

import com.example.productcatalog.R

data class ProductModel(
    val name: String,
    val image: Int
) {
    companion object {
        fun productList() = mutableListOf(
            ProductModel("Apple", R.drawable.apple),
            ProductModel("Banana", R.drawable.banana),
            ProductModel("Orange", R.drawable.orange),
            ProductModel("Grapes", R.drawable.grapes),
            ProductModel("Strawberry", R.drawable.strawberry),
            ProductModel("Pineapple", R.drawable.pineapple),
            ProductModel("Watermelon", R.drawable.watermelon),
            ProductModel("Mango", R.drawable.mango),
            ProductModel("Peach", R.drawable.peach),
            ProductModel("Pear", R.drawable.pear),
            ProductModel("Cherry", R.drawable.cherry),
            ProductModel("Kiwi", R.drawable.kiwi)
        )
    }
}