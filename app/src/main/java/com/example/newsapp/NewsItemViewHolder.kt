package com.example.newsapp

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val newsImage:ImageView=itemView.findViewById(R.id.news_image)
    val titleText:TextView=itemView.findViewById(R.id.title_text)
    val descText:TextView=itemView.findViewById(R.id.desc_text)
}