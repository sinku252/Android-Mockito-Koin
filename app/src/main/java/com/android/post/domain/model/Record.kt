package com.android.post.domain.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Record(
    val _id: Int,
    val quarter: String,
    val volume_of_mobile_data: String
)