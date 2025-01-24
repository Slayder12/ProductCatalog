package com.example.productcatalog.ui.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.productcatalog.models.ProductModule

@Composable
fun ProductCatalog(productList: List<ProductModule>, modifier: Modifier = Modifier) {
    Column(
        Modifier.fillMaxWidth()
    ) {
        Surface(
            border = BorderStroke(1.dp, Color.Black),
            modifier = modifier
                .padding(vertical = 10.dp, horizontal = 8.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Фрукты",
                    fontSize = 30.sp,
                )
            }
        }

        Surface(
            border = BorderStroke(1.dp, Color.Black),
            modifier = modifier
                .padding(horizontal = 15.dp)
        ) {
            LazyRow(
                contentPadding = PaddingValues(
                    horizontal = 10.dp, vertical = 5.dp
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(productList) { item: ProductModule ->
                    ProductRow(model = item)
                    Spacer(modifier = Modifier.padding(5.dp))
                }
            }
        }

        Surface(
            border = BorderStroke(1.dp, Color.Black),
            modifier = modifier
                .padding(vertical = 10.dp, horizontal = 8.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Другие фрукты",
                    fontSize = 30.sp,
                )
            }
        }

        Surface(
            border = BorderStroke(1.dp, Color.Black),
            modifier = modifier
                .padding(horizontal = 15.dp)
        ) {
            LazyColumn(
                contentPadding = PaddingValues(
                    horizontal = 15.dp, vertical = 2.dp
                ), modifier = Modifier.fillMaxSize()
            ) {
                items(productList) { item: ProductModule ->
                    ProductRow(model = item)
                    Spacer(modifier = Modifier.padding(5.dp))
                }
            }
        }
    }
}

@Composable
fun ProductRow(model: ProductModule) {
    var isClick by remember {
        mutableStateOf(false)
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .clickable {
                isClick = !isClick
            }
            .background(
                if (isClick) Color.Red else Color.Cyan
            )
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(
            text = model.name, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White
        )
    }
}