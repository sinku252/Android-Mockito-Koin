package com.android.post.domain.usecase

import com.android.post.domain.model.Post
import com.android.post.domain.model.PostData
import com.android.post.domain.repository.PostsRepository
import com.android.post.domain.usecase.base.UseCase

class GetPostsUseCase constructor(
    private val postsRepository: PostsRepository
) : UseCase<PostData, Any?>() {

    override suspend fun run(params: Any?): PostData {
        return postsRepository.getPosts(params.toString())
    }

}