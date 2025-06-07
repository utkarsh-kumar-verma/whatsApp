package com.example.whatsApp_clone.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsApp_clone.R

@Composable
@Preview(showSystemUi = true)
fun userRegistrationScreen() {

    var expanded by remember{
        mutableStateOf(false)
    }

    var country by remember {
        mutableStateOf("India")
    }

    var countryCode by remember{
        mutableStateOf("+91")
    }

    var phoneNumber by remember {
        mutableStateOf("")
    }


    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Enter your phone number", fontSize = 24.sp, color = colorResource(id = R.color.dark_green), fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(24.dp))

        Row {
            Text(text = "whatsApp need to verify your phone number.", fontSize = 14.sp)
            Spacer(modifier = Modifier.width(4.dp))
            Text("what's", fontSize = 14.sp, color = colorResource(id = R.color.dark_green))
        }

        Text("my number?", fontSize = 14.sp, color = colorResource(id = R.color.dark_green))

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.width(200.dp)) {
                Text(text = country, modifier = Modifier.align(Alignment.Center), fontSize = 16.sp, color = colorResource(
                    id = R.color.black
                ))
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.CenterEnd),
                    tint = colorResource(id = R.color.dark_green)
                )
            }


            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false}) {
                listOf("India", "USA", "China", "Canada").forEach { cntry ->
                    DropdownMenuItem(text = { Text(text = cntry) }, onClick = {
                        country = cntry
                        expanded = false
                    })
                }


            }

        }


        Divider(
            modifier = Modifier.padding(horizontal =  66.dp),
            thickness = 2.dp,
            color = colorResource(id = R.color.light_green)
        )

      Column(modifier = Modifier
          .fillMaxWidth()
          .padding(16.dp)) {

         Row{
             TextField(value = countryCode,
                 onValueChange = {
                 countryCode=it // it is the current value
             }, modifier = Modifier.width(70.dp),
                 singleLine = true,
                 textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                 colors = TextFieldDefaults.colors(
                     unfocusedContainerColor = Color.Transparent,
                     focusedContainerColor = Color.Transparent,
                     unfocusedIndicatorColor = colorResource(id = R.color.light_green),
                     focusedIndicatorColor = colorResource(id = R.color.light_green)
                 )
             )
             Spacer(modifier = Modifier.width(16.dp))
             TextField(value = phoneNumber,
                 placeholder = {Text("phone number")},
                 onValueChange = {
                     phoneNumber=it // it is the current value
                 }, modifier = Modifier.width(500.dp),
                 singleLine = true,
                 textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                 colors = TextFieldDefaults.colors(
                     unfocusedContainerColor = Color.Transparent,
                     focusedContainerColor = Color.Transparent,
                     unfocusedIndicatorColor = colorResource(id = R.color.light_green),
                     focusedIndicatorColor = colorResource(id = R.color.light_green)
                 )
             )


         }
          Spacer(modifier = Modifier.height(16.dp))
          Text(text = "Carrier Charge may apply",
              color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
              fontSize = 12.sp,
              modifier = Modifier.align(Alignment.CenterHorizontally)
          )

          Spacer(modifier = Modifier.height(16.dp))
          Button(onClick = { /*TODO*/ },
              shape = RoundedCornerShape(6.dp),
              modifier = Modifier.align(Alignment.CenterHorizontally),
              colors = ButtonDefaults.buttonColors(
              colorResource(id = R.color.dark_green))) {

              Text(text = "Next", fontSize = 16.sp)
          }
      }



    }
}