package com.marco.bizmall.ui.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.marco.bizmall.ui.theme.Bluenew
import com.marco.bizmall.ui.theme.Greennew

@Composable
fun AboutScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

            Image(painter = painterResource(R.drawable.shop),
                contentDescription = "",
                modifier = Modifier.size(300.dp),
                )
            Text(
                text = "Easy Shopping",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold



                )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Browse a wide range of products with a user-friendly interface designed to make your shopping experience fast, simple, and enjoyable.",
                textAlign = TextAlign.Center,
                fontSize = 15.sp,

            )

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ){
        Image(
            painter = painterResource(R.drawable.more),
            contentDescription = "",
            modifier = Modifier.size(30.dp)
        )
        Spacer(modifier = Modifier.width(100.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            modifier = Modifier.padding(end = 0.dp)
        ){

            Text(text = "Skip",
                color = Color.Blue)

        }
    }


    }
}


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())

}