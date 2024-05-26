package com.zakharov.core

import retrofit2.Retrofit

interface NetworkProvider {

    fun provideRetrofit(): Retrofit
}