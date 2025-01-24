package com.example.productcatalog.models

import com.example.productcatalog.R

data class ProductModule(
    val name: String,
    val image: Int
) {
    companion object {
        fun productList() = mutableListOf(
            ProductModule("Apple", R.drawable.apple),
            ProductModule("Banana", R.drawable.banana),
            ProductModule("Orange", R.drawable.orange),
            ProductModule("Grapes", R.drawable.grapes),
            ProductModule("Strawberry", R.drawable.strawberry),
            ProductModule("Pineapple", R.drawable.pineapple),
            ProductModule("Watermelon", R.drawable.watermelon),
            ProductModule("Mango", R.drawable.mango),
            ProductModule("Peach", R.drawable.peach),
            ProductModule("Pear", R.drawable.pear),
            ProductModule("Cherry", R.drawable.cherry),
            ProductModule("Kiwi", R.drawable.kiwi)
        )
    }
}