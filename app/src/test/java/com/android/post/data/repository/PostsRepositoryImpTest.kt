package com.android.post.data.repository

import com.android.post.domain.model.Post
import com.android.post.domain.model.PostData
import com.android.post.presentation.posts.PostsViewModel
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PostsRepositoryImpTest {

    var resourceId="a807b7ab-6cad-4aa6-87d0-e283a7353a0f"
    @MockK
    lateinit var postsRepository: PostsRepositoryImp

    @MockK
    lateinit var postsViewModel: PostsViewModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this) //for initialization
    }

    @Test
    fun getPostsData() = runBlocking {
        val posts = mockk<PostData>()
        every { runBlocking { postsRepository.getPosts(resourceId) } } returns (posts)
        val result = postsRepository.getPosts(resourceId)
        MatcherAssert.assertThat(
            "Received result [$result] & mocked [$posts] must be matches on each other!",
            result,
            CoreMatchers.`is`(posts)
        )
    }


}