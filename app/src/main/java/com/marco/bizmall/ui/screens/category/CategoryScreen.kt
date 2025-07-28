package com.marco.bizmall.ui.screens.category

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.marco.bizmall.R
import com.marco.bizmall.ui.theme.Greennew

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
    ){


        //TopAppBar
        TopAppBar(

            title = { Text(text = "Other Categories") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Greennew,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                    )
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Cart",
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "notification",
                    )
                }
            }
        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Welcome to Bizmall!!",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp),

        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Discover unique styles across categories. Find something for every vibe",
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 20.dp),

            )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Shop by category",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp),

            )

        Spacer(modifier = Modifier.height(10.dp))

        //Card


        Card(
            onClick = {},
            modifier = Modifier.fillMaxWidth().height(200.dp).padding(start = 20.dp, end = 20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.ecomm),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
                Text(
                    text = "Jewelrey",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp),
                    color = Color.White

                    )
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favorite",
                    modifier = Modifier.align(alignment = Alignment.TopStart).padding(10.dp),
                    tint = Color.Gray
                )
            }

        }
        //End of Card

        Spacer(modifier = Modifier.height(10.dp))


        //Card


        Card(
            onClick = {},
            modifier = Modifier.fillMaxWidth().height(200.dp).padding(start = 20.dp, end = 20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.blackfriday),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
                Text(
                    text = "Phones",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp),
                    color = Color.Yellow

                )
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favorite",
                    modifier = Modifier.align(alignment = Alignment.TopStart).padding(10.dp),
                    tint = Color.Gray
                )
            }

        }
        //End of Card




    }



}

@Preview(showBackground = true)
@Composable
fun ContactScreenPreview(){
    CategoryScreen(rememberNavController())

}