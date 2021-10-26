package com.android.post.domain.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Links(
    val next: String,
    val start: String
)