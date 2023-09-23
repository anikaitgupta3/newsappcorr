package com.example.newsapp

data class News(
    val totalResults: Int,
    val articles: List<Article> //we can make array of article also but list as it will be parsed properly

)
