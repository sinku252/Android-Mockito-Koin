package com.android.post.domain.model

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class PostData(
    val help: String,
    val result: Result,
    val success: Boolean
)