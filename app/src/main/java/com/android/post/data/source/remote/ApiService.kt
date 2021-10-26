package com.android.post.data.source.remote

import com.android.post.domain.model.Post
import com.android.post.domain.model.PostData
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("action/datastore_search")
    suspend fun getPosts(@Query("resource_id") resourceId:String,@Query("limit") limit:String="5"): PostData


}