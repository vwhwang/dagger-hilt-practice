package com.vicki.daggerhiltcourse

import androidx.lifecycle.ViewModel
import com.vicki.daggerhiltcourse.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>
): ViewModel() {

    /**
     * when is it useful to use lazy?
     * example token is not available until the user is log in
     */
    init {
        repository.get()
    }
}

/**
 * lazy is created when we first access.
 */