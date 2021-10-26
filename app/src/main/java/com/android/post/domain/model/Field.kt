package com.android.post.domain.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Field(
    val id: String,
    val type: String
)