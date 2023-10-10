package com.example.newsapp


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("top-headlines")
    suspend fun fetchHeadlines(
        @Query("country") countryName: String,
        @Query("category") category:String,
        @Query("apiKey") apikey:String
    ):News //Call<News> //will return an object of news,if we don't use suspend method then use call<news>
    //this means that fetchHeadlines is a suspend method means it can be paused at any point of time and resumed later
    //https://newsapi.org/v2/top-headlines?countryName=in&category&apikey-12345678

}
//here we define the endpoint which we trigger to get the news articles