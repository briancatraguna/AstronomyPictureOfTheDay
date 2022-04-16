package com.briancatraguna.data.di

import com.briancatraguna.data.BuildConfig
import com.skydoves.sandwich.adapters.ApiResponseCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier

@InstallIn(SingletonComponent::class)
@Module
class RestClient {

    @ApiBaseUrl
    @Provides
    fun provideApiBaseUrl(): String = BuildConfig.NASA_BASE_URL

    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    @Provides
    fun provideOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor
    ) = OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor)
        .build()

    @Provides
    fun provideRestClient(
        @ApiBaseUrl apiBaseUrl: String,
        okHttpClient: OkHttpClient
    ) = Retrofit.Builder()
        .baseUrl(apiBaseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(ApiResponseCallAdapterFactory.create())
        .client(okHttpClient)
        .build()

}

@Qualifier
@Retention
annotation class ApiBaseUrl