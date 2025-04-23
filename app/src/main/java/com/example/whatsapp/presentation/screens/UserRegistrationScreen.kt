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
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * This is a screen where new users are prompted to create an account on the platform
 */

@Composable
fun UserRegistration(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    var selectedCountry by remember { mutableStateOf("Kenya") }
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
            modifier = Modifier.padding(horizontal = 66.dp),
            thickness = 2.dp,
            color = Color.Green
        )
    }
}

@Preview(showBackground = true)
@Composable
fun UserRegistrationPreview() {
    UserRegistration()
}