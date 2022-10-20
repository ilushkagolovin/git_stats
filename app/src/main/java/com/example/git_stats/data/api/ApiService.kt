package com.example.git_stats.data.api


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {

    @GET("search/repositories")
    fun searchGitHubRepo(

    )

    companion object {

        var BASE_URL = "https://api.github.com/"

        fun create() : ApiService {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiService::class.java)
        }
    }
}