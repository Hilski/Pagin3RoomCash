package com.example.pagin3roomcash.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pagin3roomcash.data.local.dao.UnsplashImageDao
import com.example.pagin3roomcash.data.local.dao.UnsplashRemoteKeysDao
import com.example.pagin3roomcash.model.UnsplashImage
import com.example.pagin3roomcash.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}