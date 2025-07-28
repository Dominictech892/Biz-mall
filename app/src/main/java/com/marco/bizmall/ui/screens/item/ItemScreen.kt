package com.marco.bizmall.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.DefaultTintColor
import com.marco.bizmall.R
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.marco.bizmall.ui.theme.Bluenew
import com.marco.bizmall.ui.theme.Greennew
import com.marco.bizmall.ui.theme.yellowstar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize()
    ){
        //TopAppBar

        TopAppBar(

            title = { Text(text = "Products") },
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
                        imageVector = Icons.Default.ShoppingCart,
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
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notification",
                    )
                }
            }
        )

        //End of TopAppBar
        Image(
            painter = painterResource(R.drawable.shop),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth().height(300.dp),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(40.dp))

        //SearchBar

        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 25.dp, end = 25.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },
            placeholder = { Text(text = "search products...")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Bluenew,
                focusedBorderColor = Greennew
            )
        )


        //End of SearchBar

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Other Products",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())

        ){
            //Row ---> Start

            Row(
                modifier = Modifier.padding(start = 20.dp)
            ){

                Image(
                    painter = painterResource(R.drawable.blackfriday),
                    contentDescription = "",
                    modifier = Modifier.size(width = 150.dp, height = 150.dp).clip(shape = RoundedCornerShape(30.dp))
                )

                Spacer(modifier = Modifier.width(40.dp))


                Column(){
                    Text( text = "Black Friday Deals", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text( text = "Brand: Samsung", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text( text = "Price: Ksh 20,000", fontSize = 15.sp, textDecoration = TextDecoration.LineThrough)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text( text = "Now: Ksh 18,999", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text( text = "Specs: 6gb + 128 gb", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(15.dp))

                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = yellowstar)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = yellowstar)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = yellowstar)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = yellowstar)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }

                    Spacer(modifier = Modifier.height(20.dp))


                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Greennew),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Buy Now")
                    }





                }

            }

            //End of Row
            Spacer(modifier = Modifier.height(20.dp))

            //Row ---> Start

            Row(
                modifier = Modifier.padding(start = 20.dp)
            ){

                Image(
                    painter = painterResource(R.drawable.shoe),
                    contentDescription = "",
                    modifier = Modifier.size(width = 150.dp, height = 150.dp).clip(shape = RoundedCornerShape(30.dp))
                )

                Spacer(modifier = Modifier.width(40.dp))


                Column(){
                    Text( text = "Black Friday Deals", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text( text = "Brand: Samsung", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text( text = "Price: Ksh 20,000", fontSize = 15.sp, textDecoration = TextDecoration.LineThrough)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text( text = "Now: Ksh 18,999", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text( text = "Specs: 6gb + 128 gb", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(15.dp))

                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = yellowstar)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = yellowstar)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = yellowstar)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = yellowstar)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }

                    Spacer(modifier = Modifier.height(20.dp))


                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Greennew),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Buy Now")
                    }


                }

            }

            //End of Row


        }


    }


}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())

}