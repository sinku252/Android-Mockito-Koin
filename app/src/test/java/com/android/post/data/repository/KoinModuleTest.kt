package com.android.post.data.repository

import com.android.post.data.source.remote.ApiService
import com.android.post.di.module.AppModule
import com.android.post.di.module.NetworkModule

import org.junit.Test
import org.koin.core.logger.Level
import org.koin.dsl.koinApplication
import org.koin.test.AutoCloseKoinTest
import org.koin.test.check.checkModules

class KoinModuleTest : AutoCloseKoinTest() {

    @Test
    fun testCoreModule() {
        koinApplication {
            printLogger(Level.DEBUG)
            modules(listOf(AppModule, NetworkModule))
        }.checkModules()
    }

}