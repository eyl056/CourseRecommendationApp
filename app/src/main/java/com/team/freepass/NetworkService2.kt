package com.team.freepass

import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface NetworkService2 {

    @POST("/course.php")
    fun putTodaySurvey(
        @Header("Authorization") Authorization : String,
        @Body TodaySurveyData : TodaySurveyData
    ) : Call<TodaySurveyResponse>
}