package com.example.pagin3roomcash.data.remote



import com.example.pagin3roomcash.model.SearchResult
import com.example.pagin3roomcash.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID pQf9bjEe-edgFl_FbNWnJDdsEFHKyxjlutXenaVmZTw")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<UnsplashImage>

    @Headers("Authorization: Client-ID pQf9bjEe-edgFl_FbNWnJDdsEFHKyxjlutXenaVmZTw")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("query") query: String,
        @Query("per_page") perPage: Int
    ): SearchResult
}