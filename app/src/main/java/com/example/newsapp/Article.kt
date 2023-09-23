package com.example.newsapp

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("urlToImage") val imageUrl:String,
     @SerializedName("title") val titleText:String, //need to mention serialized name if the name is different in the api like in
    @SerializedName("description") val descText:String
)
