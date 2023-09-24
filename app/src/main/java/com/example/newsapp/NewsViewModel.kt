package com.example.newsapp

import android.util.Log
import androidx.lifecycle.ViewModel


class NewsViewModel:ViewModel() {

    fun getNews(){
        viewModelScope.launch()
    }//this method will be responsible for making the api call
}