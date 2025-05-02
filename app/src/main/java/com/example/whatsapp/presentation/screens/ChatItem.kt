package com.example.whatsapp.presentation.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.Data.Chat
import com.example.whatsapp.Data.chats
import com.example.whatsapp.R

/**
 * This a single chat item that represents a single chat( Contact)
 */

@Composable
fun ChatItem( chat: Chat,modifier: Modifier = Modifier){
   Card( onClick = {}) {
       Row (modifier = Modifier.fillMaxWidth().padding(12.dp)){
           ChatImageIcon(chat.displayPicture)
           Spacer(modifier = Modifier.width(20.dp))
           ChatInformation(chat.name, chat.message)
           Spacer(modifier = Modifier.width(200.dp))
           ChatNotifications()
       }
   }
}
/**
 * Chat-items  Image
 */
@Composable
fun ChatImageIcon(@DrawableRes displayPicture: Int ,modifier: Modifier = Modifier){
    Image(
        painter = painterResource(displayPicture),
        contentDescription = "Chat item image",
        modifier = Modifier.size(45.dp),
    )
}

/**
 * Chat-item information
 */
@Composable
fun ChatInformation(
    @StringRes chatName: Int,
    @StringRes message: Int
){
    Column ()
    {
        Text( text = stringResource(chatName), fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(5.dp))
        Text( text = stringResource(message), fontSize = 13.sp)
    }
}

/**
 * Number of chats and time item item
 */
@Composable
fun ChatNotifications(modifier: Modifier = Modifier){
    Row {
        Text( text = "11:00")
        //Chat noti
    }
}
/**
 * Chat item preview
 */
@Preview(showBackground = true)
@Composable
fun ChatItemPreview(){
    ChatItem(chat = Chat(
        R.drawable.facebook_brands,
        name = R.string.Jane,
        message = R.string.message1
    ))
}