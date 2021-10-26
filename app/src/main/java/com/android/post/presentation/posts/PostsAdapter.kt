package com.android.post.presentation.posts

import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.post.databinding.HolderPostBinding
import androidx.recyclerview.widget.RecyclerView
import com.android.post.R
import com.android.post.domain.model.Post
import com.android.post.domain.model.PostData
import com.android.post.domain.model.Record
import kotlin.properties.Delegates

class PostsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var mPostList: List<Record> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemBinding = HolderPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return PostViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = if (mPostList.isNullOrEmpty()) 0 else mPostList.size

    private fun getItem(position: Int): Record = mPostList[position]

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PostViewHolder).bind(getItem(position))
    }

    private inner class PostViewHolder(var holderPostBinding: HolderPostBinding) :
        RecyclerView.ViewHolder(holderPostBinding.root) {
        fun bind(post: Record) {
            holderPostBinding.postTitleTextView.text = post.quarter
            holderPostBinding.postBodyTextView.text = post.volume_of_mobile_data
        }
    }
}