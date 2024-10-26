package com.vicki.daggerhiltcourse.di

import com.vicki.daggerhiltcourse.data.repository.MyRepositoryImpl
import com.vicki.daggerhiltcourse.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * what bind does here is ensure everytime we inject MyRepository this "MyRepositoryImpl" is chosen
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ) : MyRepository
}