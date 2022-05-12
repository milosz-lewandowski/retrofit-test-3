package com.example.retrofit_test_3.api

import com.example.retrofit_test_3.model.Post
import retrofit2.http.GET

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Post
}