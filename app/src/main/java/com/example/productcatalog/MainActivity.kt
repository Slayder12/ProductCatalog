package com.example.productcatalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.productcatalog.models.ProductModule
import com.example.productcatalog.ui.pages.ProductCatalog

class MainActivity : ComponentActivity() {

    private val productList = ProductModule.productList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProductCatalog(productList)
        }
    }
}

