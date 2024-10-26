package com.vicki.daggerhiltcourse

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.vicki.daggerhiltcourse.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Example on service can not inject constructor then how do we inject
 * -> "field injection"
 */
@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}

//injecting dependency and delay the creation of object -> lazy injection