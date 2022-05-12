package com.example.retrofit_test_3.repository

import com.example.retrofit_test_3.api.RetrofitInstance
import com.example.retrofit_test_3.model.Post

class Repository {

    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }
}