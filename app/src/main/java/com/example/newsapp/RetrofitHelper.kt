package com.example.newsapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Singleton
object RetrofitHelper {

    /*fun something(){

    }*/
    private val retrofitBuilder = Retrofit.Builder() //retrofit has builder method which we need to call

    private val retrofit = retrofitBuilder.baseUrl("www.newsapi.org/v2/")
    /*private val retrofit = Retrofit.Builder()
        .baseUrl("www.newsapi.org/v2/")*/ //we can write like this also
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val newsService=retrofit.create(NewsService::class.java)//like a instance of newsservice object
}
//RetrofitHelper.something() here we can access directly in classes we had to make object and then access but here we can do directly
//Main thread/UI thread
//Background thread