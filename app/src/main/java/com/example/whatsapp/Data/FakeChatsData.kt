package com.example.whatsapp.Data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.whatsapp.R

/**
 * Fake chats data for the UI
 */

data class Chat(
    @DrawableRes val displayPicture: Int,
    @StringRes val name: Int,
    @StringRes val message: Int
)

val chats = listOf<Chat>(
    Chat(R.drawable.x_twitter_brands, R.string.Jane, R.string.message2),
    Chat(R.drawable.instagram_brands, R.string.Jane, R.string.message2),
    Chat(R.drawable.instagram_brands, R.string.Mary, R.string.message2),
    Chat(R.drawable.x_twitter_brands, R.string.John, R.string.message2),
    Chat(R.drawable.instagram_brands, R.string.Mary, R.string.message2),
    Chat(R.drawable.x_twitter_brands, R.string.Mary, R.string.message2),
    Chat(R.drawable.x_twitter_brands, R.string.Jane, R.string.message2),
    Chat(R.drawable.whatsapp_brands, R.string.Jane, R.string.message2),
    Chat(R.drawable.location_dot_solid__1_, R.string.Jane, R.string.message2),
)