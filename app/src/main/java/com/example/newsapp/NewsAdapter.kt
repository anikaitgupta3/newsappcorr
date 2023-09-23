package com.example.newsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val newsList:List<Article>):RecyclerView.Adapter<NewsItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsItemViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.news_item,parent,false)
        return NewsItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) {
        val article=newsList[position]

        //val article1=Article("Example","Title","Desc") we can do like this also

        holder.titleText.text=article.titleText
        holder.descText.text=article.descText

        //Set the news image
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

}