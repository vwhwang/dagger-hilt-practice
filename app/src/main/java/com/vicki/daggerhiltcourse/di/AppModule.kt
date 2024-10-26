package com.vicki.daggerhiltcourse.di

import android.app.Application
import com.vicki.daggerhiltcourse.data.remote.MyApi
import com.vicki.daggerhiltcourse.data.repository.MyRepositoryImpl
import com.vicki.daggerhiltcourse.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

/**
 * Example SingletonComponent lives as long as application
 * Example ActivityComponent lives as long as activity etc.
 * decides about the lifetime
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /**
     * this @Singleton defines the scope one instance through out the whole lifetime
     * to ensure same instance of myApi
     */
    @Provides
    @Singleton
    fun provideMyApi() : MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    /**
     * tell dagger hilt how to provide viewmodle anotation
     * you never call the below it's for dagger to call
     */
//    @Provides
//    @Singleton
//    fun provideMyRepository(
//        api: MyApi,
//        app: Application,
//        @Named("hello1") hello: String
//    ): MyRepository {
//        return MyRepositoryImpl(api, app)
//    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
}