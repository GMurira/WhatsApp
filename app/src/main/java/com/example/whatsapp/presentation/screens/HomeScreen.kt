package com.example.whatsapp.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.Data.chats
import com.example.whatsapp.R

/**
 * The home Screen composable displays the list of chats as well as the navigation bars
 */
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopNavigationBar()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.Green,
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(R.drawable.whatsapp_brands),
                    contentDescription = "floating action button",
                    modifier = Modifier.size(45.dp)
                )
            }
        },
        bottomBar = {
            BottomAppBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(chats){
                ChatItem(chat = it)
            }
        }
    }
}

/**
 * Top App Bars
 */
@Composable
fun TopNavigationBar(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = stringResource(R.string.app_name),
            fontSize = 28.sp,
            color = Color.Green,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.TopStart),
            fontWeight = FontWeight.Bold
        )

        Row (modifier = Modifier.align(Alignment.CenterEnd)){
            IconButton( onClick = {}) { 
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon"
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Menu Bar Items"
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
        }
    }


}

/**
 * Top app bar preview
 */
@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {

}

/**
 * Home Screen Preview
 */
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}