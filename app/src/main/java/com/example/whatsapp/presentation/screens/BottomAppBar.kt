package com.example.whatsapp.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R

/**
 * Bottom Navigation Bar
 */
@Composable
fun BottomAppBar( modifier: Modifier = Modifier){
    Box {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            BottomNavigationBarItem(
                bottomNavigationImage = R.drawable.comment,
                bottomNavigationText = R.string.chats
            )
            BottomNavigationBarItem(
                bottomNavigationImage = R.drawable.social_media,
                bottomNavigationText = R.string.updates
            )
            BottomNavigationBarItem(
                bottomNavigationImage = R.drawable.community,
                bottomNavigationText = R.string.communities
            )
            BottomNavigationBarItem(
                bottomNavigationImage = R.drawable.telephone,
                bottomNavigationText = R.string.calls
            )
        }
    }
}

@Composable
fun BottomNavigationBarItem(
    bottomNavigationImage: Int,
    bottomNavigationText: Int,
    modifier: Modifier = Modifier
){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(bottomNavigationImage),
                contentDescription = "Bottom Navigation Bar",
                modifier = Modifier.size(35.dp)
            )
            Text(
                text = stringResource(bottomNavigationText),
                fontWeight = FontWeight.Bold
            )
        }
}
@Preview(showBackground = true)
@Composable
fun BottomAppBarPreview(){
    BottomAppBar()
}

/**
 * Make Images click able
 */