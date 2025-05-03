package com.example.whatsapp.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R

/**
 * Updates screen
 */
@Composable
fun UpdatesScreen(modifier: Modifier = Modifier) {

}

/**
 * update status item
 */
@Composable
fun StatusItem(modifier: Modifier = Modifier) {
    Row (modifier = Modifier.fillMaxWidth()){
        UpdatesDisplayPicture()
    }
}

/**
 * Updates display picyure
 */
@Composable
fun UpdatesDisplayPicture(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .size(70.dp)
        .clickable { }) {
        Image(
            painter = painterResource(R.drawable.whatsapp_brands),
            contentDescription = "Whats up Status",
            modifier = Modifier.clip(CircleShape),
            contentScale = ContentScale.Crop
        )

    }
}

/**
 * UpdateDisplayPicture preview
 */
@Preview
@Composable
fun UpdateDisplayPicturePreview() {
    UpdatesDisplayPicture()
}

/**
 * Update Screen Preview
 */
@Preview(showBackground = true)
@Composable
fun UpdateScreenPreview() {

}