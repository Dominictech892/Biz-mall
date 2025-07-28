package com.marco.bizmall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.marco.bizmall.R
import com.marco.bizmall.navigation.ROUT_ITEM
import com.marco.bizmall.ui.theme.Bluenew
import com.marco.bizmall.ui.theme.Greennew
import com.marco.bizmall.ui.theme.Yellownew

@Composable
fun HomeScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize().background(Bluenew),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(R.drawable.blackfriday),
            contentDescription = "",

            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )


        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Bizmall",
            fontSize = 40.sp,
            color = Greennew,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Find More Products With Us!!",
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Welcome to BizMall! — your one-stop shop for everything you love. Discover amazing deals, explore new trends, and shop effortlessly anytime, anywhere!",
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {
                navController.navigate(ROUT_ITEM)
            },
            colors = ButtonDefaults.buttonColors(Greennew),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 25.dp, end = 25.dp)
        ){

            Text(text = "Get Started!")

        }


<<<<<<< HEAD
    }


=======



    }



>>>>>>> a33afe81711b2374c0fb5804d562be5a76dd3c3a
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}