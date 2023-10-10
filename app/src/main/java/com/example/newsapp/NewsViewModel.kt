package com.example.newsapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.RetrofitHelper.newsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class NewsViewModel:ViewModel() {

    fun getNews(){
        viewModelScope.launch(Dispatchers.IO){
           val newsService= RetrofitHelper.newsService

            try{
                val response=newsService.fetchHeadlines("in","technology",Constants.API_KEY)
            }
            // TODO:Provide response to the activity
            catch(e:Exception){
               Log.e("NewsViewModel",e.toString())
            }
        }
    }//this method will be responsible for making the api call
    //launch launches a new coroutine
    //we passed the dispatchers.io baecause we want it to happen on the background thread not on the main threadw
}