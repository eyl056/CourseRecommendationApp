package com.team.freepass

import android.app.Application
import android.content.Context
import android.widget.Toast
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApplicationController : Application() {

    var networkService: NetworkService? = null
    var networkService2: NetworkService2? = null

        private set
    val baseUrl = "http://freepath.dothome.co.kr"
    var appContext: Context? = null

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        instance = this

        buildNetwork()

    }

    fun buildNetwork() {
        var builder = Retrofit.Builder()
        var retrofit = builder
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        networkService=retrofit.create(NetworkService::class.java)
    }

    fun makeToast(message: String) {
        Toast.makeText(appContext, message, Toast.LENGTH_SHORT).show()
    }

    companion object {
        var instance: ApplicationController? = null
    }
}