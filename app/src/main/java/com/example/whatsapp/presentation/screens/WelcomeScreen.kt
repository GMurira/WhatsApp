package com.example.whatsapp.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R

/**
 * Welcome Screen   gives the user a link to the terms and conditions and a button to continue if they
 * agree with the terms of use
 */

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.instagram_brands),
            contentDescription = stringResource(R.string.welcome_Screen_image),
            modifier = Modifier.size(150.dp)
        )

        Text(
            text = "Welcome to WhatsApp", fontSize = 24.sp, fontWeight = FontWeight.Bold
        )

        Row {
            Text(text = "Read our", color = Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Privacy Policy", color = Color.Green)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Tap agree to continue to")
        }
        Row {
            Text(text = "accept the ", color = Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Terms of Service", color = Color.Green)
        }
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            onClick = {/*TODO*/ },
            modifier = Modifier.size(280.dp, 43.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
        ) {
            Text(text = stringResource(R.string.welcome_screen_button))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreView() {
    WelcomeScreen()
}