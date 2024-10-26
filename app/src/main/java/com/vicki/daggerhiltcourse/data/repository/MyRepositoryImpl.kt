package com.vicki.daggerhiltcourse.data.repository

import android.app.Application
import com.vicki.daggerhiltcourse.R
import com.vicki.daggerhiltcourse.data.remote.MyApi
import com.vicki.daggerhiltcourse.domain.repository.MyRepository
import javax.inject.Inject

/**
 * if you have @Inject then you don't need provide
 */
class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("hi from $appName")
    }

    override suspend fun doNetWorkCall() {
        TODO("Not yet implemented")
    }
}