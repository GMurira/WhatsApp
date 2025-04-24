package com.example.whatsapp.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R

/**
 * This is a screen where new users are prompted to create an account on the platform
 */

@Composable
fun UserRegistration(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    var selectedCountry by remember { mutableStateOf("Kenya") }

    var countryCode by remember { mutableStateOf("+254") }

    var phoneNumber by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Enter your phone number",
            fontSize = 20.sp,
            color = Color.Green,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(30.dp))
        Row {
            Text(text = "WhatsApp will need to verify you phone number.")
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Whats", color = Color.Green)
        }
        Text(text = "My number?", color = Color.Green)

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(
            onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()
        ) {
            Box(modifier = Modifier.width(230.dp)) {
                Text(
                    text = selectedCountry,
                    modifier = Modifier.align(Alignment.Center),
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Arrow Drop Down",
                    modifier = Modifier.align(Alignment.CenterEnd),
                    tint = Color.Green
                )
            }
        }
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 66.dp), thickness = 2.dp, color = Color.Green
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            listOf("Kenya", "Uganda", "Tanzania", "Ethiopia").forEach { country ->
                DropdownMenuItem(text = { Text(text = country) }, onClick = {
                    selectedCountry = country
                    expanded = false
                })
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                TextField(
                    value = countryCode,
                    onValueChange = { it },
                    modifier = Modifier.width(70.dp),
                    singleLine = true,
                    textStyle = LocalTextStyle.current,
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Gray,
                        focusedIndicatorColor = Color.Green
                    )
                )
                Spacer(modifier = Modifier.width(16.dp))
                TextField(
                    value = phoneNumber,
                    onValueChange = { it },
                    placeholder = { Text(text = "Phone Number ") },
                    singleLine = true,
                    textStyle = LocalTextStyle.current,
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Gray,
                        focusedIndicatorColor = Color.Green
                    )
                )

            }
            Spacer( modifier = Modifier.height(16.dp))
            Text( text = "Charges may apply", fontSize = 12.sp)
            Spacer(modifier = Modifier.height(45.dp))
            Button(
                onClick = {},
                modifier = Modifier.size(280.dp, 43.dp),
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
            ) {
                Text( text  = stringResource(R.string.Next_button), fontSize = 18.sp)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun UserRegistrationPreview() {
    UserRegistration()
}