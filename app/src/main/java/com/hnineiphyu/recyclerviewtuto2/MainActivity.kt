package com.hnineiphyu.recyclerviewtuto2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.recyclerviewtuto2.adapter.PostsAdapter
import com.hnineiphyu.recyclerviewtuto2.model.Posts

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.cart_recycler)

        val postArray = ArrayList<Posts>()

        postArray.add(Posts(R.drawable.postone,"2K", 98, 69))
        postArray.add(Posts(R.drawable.posttwo,"3K", 70, 92))
        postArray.add(Posts(R.drawable.postthree,"2.7K", 128, 90))
        postArray.add(Posts(R.drawable.postfour,"8K", 588, 156))
        postArray.add(Posts(R.drawable.postfive,"6K", 480, 127))

        val shoesAdapter = PostsAdapter(postArray)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = shoesAdapter
    }
}
