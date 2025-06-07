package com.example.whatsApp_clone.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsApp_clone.R

@Composable
@Preview(showSystemUi = true)
fun welcomeScreen()
{
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Image(painter = painterResource(id  = R.drawable.whatsapp_sticker), contentDescription = null, modifier = Modifier.width(300.dp))


        Text(
            text = "Welcome to WhatApp",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.black)
        )

        Spacer(modifier = Modifier.height(14.dp))

        Row {
            Text(text = "Read our",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.gray)
                )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Private Policy",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource
                    (id = R.color.light_green))
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Tap 'Agree and continue to'",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.gray)
            )

        }

        Row {
            Text(text = "accept the",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.gray)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Terms and Services",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource
                    (id = R.color.light_green))


        }

        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { /*TODO*/ },
            colors =  ButtonDefaults.buttonColors(
                containerColor = Color(0xFF4CAF50),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.padding(8.dp)
        ) {
           Text(text = "Get Started")
        }

        Spacer(modifier = Modifier.width(10.dp))

        Text(text = "Version 1.1050.4.2",
            fontSize = 12.sp,
            color = colorResource(id = R.color.gray)
        )

    }


}