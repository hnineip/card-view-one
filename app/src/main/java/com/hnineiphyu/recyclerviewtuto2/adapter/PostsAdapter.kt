package com.hnineiphyu.recyclerviewtuto2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.recyclerviewtuto2.R
import com.hnineiphyu.recyclerviewtuto2.model.Posts

class PostsViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

    var PostImage = itemView.findViewById<ImageView>(R.id.post_image)
    var ReactNumber = itemView.findViewById<TextView>(R.id.txt_reactnumber)
    var MessageNumber = itemView.findViewById<TextView>(R.id.txt_messagnumber)
    var ShareNumber = itemView.findViewById<TextView>(R.id.txt_sharenumber)
}

class PostsAdapter (val postsList: ArrayList<Posts>):RecyclerView.Adapter<PostsViewHolder>() {
    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
       holder.PostImage.setImageResource(postsList[position].image)
       holder.ReactNumber.text = postsList[position].reactNumber
       holder.MessageNumber.text = postsList[position].messageNumber.toString()
       holder.ShareNumber.text = postsList[position].shareNumber.toString()
    }

    override fun getItemCount(): Int {
        return postsList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_item, parent, false)
        return PostsViewHolder(view)


    }
}