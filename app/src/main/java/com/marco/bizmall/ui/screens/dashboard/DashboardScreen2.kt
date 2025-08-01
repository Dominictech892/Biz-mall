package com.marco.bizmall.ui.screens.contact

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.marco.bizmall.R

@Composable
fun DashboardScreen2(navController: NavController){

Column(
    modifier = Modifier.fillMaxSize()
) {
    //Card

    Card(
        modifier = Modifier.fillMaxWidth().height(height = 300.dp),
        shape = RoundedCornerShape(bottomStart =60.dp ),
        colors = CardDefaults.cardColors(Color.Green)
    ){
        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "",
                    tint = Color.White

                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Crypto currency ", fontSize = 20.sp,color = Color.White, fontWeight = FontWeight.ExtraBold)

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Landing page", fontSize = 17.sp, color = Color.White, fontWeight = FontWeight.ExtraBold )



            //row
            Row(
                modifier = Modifier.padding(start = 20.dp)
            )
            {
                Spacer(modifier = Modifier.height(20.dp))


                Image(
                    painter = painterResource(R.drawable.blackfriday),
                    contentDescription = "Sneakers",
                    modifier = Modifier
                        .width(60.dp)
                        .height(70.dp)
                        .clip(RoundedCornerShape(200.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Samantha ", fontSize = 20.sp,color = Color.White, fontWeight = FontWeight.ExtraBold,

                )

            }




            //end of row


        }

    }














    //End of card


}

}

@Preview(showBackground = true)
@Composable
fun DashboardScreen2Preview(){
    DashboardScreen2(rememberNavController())

}