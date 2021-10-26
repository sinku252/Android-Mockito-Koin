package com.android.post.domain.repository

import com.android.post.domain.model.PostData

interface PostsRepository {

    suspend fun getPosts(key:String): PostData
}