package com.example.whatsapp.Data

import androidx.annotation.DrawableRes
import com.example.whatsapp.R

/**
 * Fake chats data for the UI
 */

data class Chat(
    @DrawableRes val displayPicture: Int,
    val name: String,
    val message: String
)

val chats = listOf<Chat>(
    Chat( R.drawable.x_twitter_brands, "Cindy", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Mary", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Candy", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Cindy", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Joe", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Doe", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Kamau", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Casty", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Cindy", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Cindy", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Cindy", "Hello How are you"),
    Chat( R.drawable.x_twitter_brands, "Cindy", "Hello How are you"),
)