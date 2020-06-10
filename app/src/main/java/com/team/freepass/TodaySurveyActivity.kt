package com.team.freepass

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response

class TodaySurveyActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {

    }

    var course_1 : Button? = null
    var course_2 : Button? = null
    var course_3 : Button? = null
    var course_4 : Button? = null
    var course_5 : Button? = null
    var course_6 : Button? = null
    var course_7 : Button? = null
    var course_8 : Button? = null
    var course_9 : Button? = null
    var course_10 : Button? = null
    var course_11 : Button? = null
    var course_12 : Button? = null
    var course_14 : Button? = null
    var course_15 : Button? = null
    var course_16 : Button? = null
    var course_17 : Button? = null
    var course_18 : Button? = null
    var course_19 : Button? = null
    var course_20 : Button? = null
    var course_21 : Button? = null
    var course_22 : Button? = null
    var course_23 : Button? = null
    var course_24 : Button? = null
    var course_25 : Button? = null

    var button_complete : Button? = null
    private var networkService : NetworkService? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_today_survey)

        networkService = ApplicationController.instance!!.networkService

        var course = arrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
        var courseName = arrayOf("","","","","","","","","","","","","","","","","","","","","","","","","");

        course_1 = findViewById(R.id.course_1) as Button
        course_2 = findViewById(R.id.course_2) as Button
        course_3 = findViewById(R.id.course_3) as Button
        course_4 = findViewById(R.id.course_4) as Button
        course_5 = findViewById(R.id.course_5) as Button
        course_6 = findViewById(R.id.course_6) as Button
        course_7 = findViewById(R.id.course_7) as Button
        course_8 = findViewById(R.id.course_8) as Button
        course_9 = findViewById(R.id.course_9) as Button
        course_10 = findViewById(R.id.course_10) as Button
        course_11 = findViewById(R.id.course_11) as Button
        course_12 = findViewById(R.id.course_12) as Button
        course_14 = findViewById(R.id.course_14) as Button
        course_15 = findViewById(R.id.course_15) as Button
        course_16 = findViewById(R.id.course_16) as Button
        course_17 = findViewById(R.id.course_17) as Button
        course_18 = findViewById(R.id.course_18) as Button
        course_19 = findViewById(R.id.course_19) as Button
        course_20 = findViewById(R.id.course_20) as Button
        course_21 = findViewById(R.id.course_21) as Button
        course_22 = findViewById(R.id.course_22) as Button
        course_23 = findViewById(R.id.course_23) as Button
        course_24 = findViewById(R.id.course_24) as Button
        course_25 = findViewById(R.id.course_25) as Button

        courseName[0]= course_1!!.text.toString();
        courseName[1]= course_2!!.text.toString();
        courseName[2]= course_3!!.text.toString();
        courseName[3]= course_4!!.text.toString();
        courseName[4]= course_5!!.text.toString();
        courseName[5]= course_6!!.text.toString();
        courseName[6]= course_7!!.text.toString();
        courseName[7]= course_8!!.text.toString();
        courseName[8]= course_9!!.text.toString();
        courseName[9]= course_10!!.text.toString();
        courseName[10]= course_11!!.text.toString();
        courseName[11]= course_12!!.text.toString();
        courseName[12]= course_14!!.text.toString();
        courseName[13]= course_15!!.text.toString();
        courseName[14]= course_16!!.text.toString();
        courseName[15]= course_17!!.text.toString();
        courseName[16]= course_18!!.text.toString();
        courseName[17]= course_19!!.text.toString();
        courseName[18]= course_20!!.text.toString();
        courseName[19]= course_21!!.text.toString();
        courseName[20]= course_22!!.text.toString();
        courseName[21]= course_23!!.text.toString();
        courseName[22]= course_24!!.text.toString();
        courseName[23]= course_25!!.text.toString();


        course_1!!.setOnClickListener {
            if(course[0]==0) {
                course_1!!.setBackgroundResource(R.drawable.button_shape_2)
                course_1!!.setTextColor(Color.WHITE)
                course[0]=1
            }
            else {
                course_1!!.setBackgroundResource(R.drawable.button_shape)
                course_1!!.setTextColor(Color.parseColor("#707070"))
                course[0]=0
            }
        }
        course_2!!.setOnClickListener {
            if(course[1]==0) {
                course_2!!.setBackgroundResource(R.drawable.button_shape_2)
                course_2!!.setTextColor(Color.WHITE)
                course[1]=1
            }
            else {
                course_2!!.setBackgroundResource(R.drawable.button_shape)
                course_2!!.setTextColor(Color.parseColor("#707070"))
                course[1]=0
            }
        }
        course_3!!.setOnClickListener {
            if(course[2]==0) {
                course_3!!.setBackgroundResource(R.drawable.button_shape_2)
                course_3!!.setTextColor(Color.WHITE)
                course[2]=1
            }
            else {
                course_3!!.setBackgroundResource(R.drawable.button_shape)
                course_3!!.setTextColor(Color.parseColor("#707070"))
                course[2]=0
            }
        }
        course_4!!.setOnClickListener {
            if(course[3]==0) {
                course_4!!.setBackgroundResource(R.drawable.button_shape_2)
                course_4!!.setTextColor(Color.WHITE)
                course[3]=1
            }
            else {
                course_4!!.setBackgroundResource(R.drawable.button_shape)
                course_4!!.setTextColor(Color.parseColor("#707070"))
                course[3]=0
            }
        }
        course_5!!.setOnClickListener {
            if(course[4]==0) {
                course_5!!.setBackgroundResource(R.drawable.button_shape_2)
                course_5!!.setTextColor(Color.WHITE)
                course[4]=1
            }
            else {
                course_5!!.setBackgroundResource(R.drawable.button_shape)
                course_5!!.setTextColor(Color.parseColor("#707070"))
                course[4]=0
            }
        }
        course_6!!.setOnClickListener {
            if(course[5]==0) {
                course_6!!.setBackgroundResource(R.drawable.button_shape_2)
                course_6!!.setTextColor(Color.WHITE)
                course[5]=1
            }
            else {
                course_6!!.setBackgroundResource(R.drawable.button_shape)
                course_6!!.setTextColor(Color.parseColor("#707070"))
                course[5]=0
            }
        }
        course_7!!.setOnClickListener {
            if(course[6]==0) {
                course_7!!.setBackgroundResource(R.drawable.button_shape_2)
                course_7!!.setTextColor(Color.WHITE)
                course[6]=1
            }
            else {
                course_7!!.setBackgroundResource(R.drawable.button_shape)
                course_7!!.setTextColor(Color.parseColor("#707070"))
                course[6]=0
            }
        }
        course_8!!.setOnClickListener {
            if(course[7]==0) {
                course_8!!.setBackgroundResource(R.drawable.button_shape_2)
                course_8!!.setTextColor(Color.WHITE)
                course[7]=1
            }
            else {
                course_8!!.setBackgroundResource(R.drawable.button_shape)
                course_8!!.setTextColor(Color.parseColor("#707070"))
                course[7]=0
            }
        }
        course_9!!.setOnClickListener {
            if(course[8]==0) {
                course_9!!.setBackgroundResource(R.drawable.button_shape_2)
                course_9!!.setTextColor(Color.WHITE)
                course[8]=1
            }
            else {
                course_9!!.setBackgroundResource(R.drawable.button_shape)
                course_9!!.setTextColor(Color.parseColor("#707070"))
                course[8]=0
            }
        }
        course_10!!.setOnClickListener {
            if(course[9]==0) {
                course_10!!.setBackgroundResource(R.drawable.button_shape_2)
                course_10!!.setTextColor(Color.WHITE)
                course[9]=1
            }
            else {
                course_10!!.setBackgroundResource(R.drawable.button_shape)
                course_10!!.setTextColor(Color.parseColor("#707070"))
                course[9]=0
            }
        }
        course_11!!.setOnClickListener {
            if(course[10]==0) {
                course_11!!.setBackgroundResource(R.drawable.button_shape_2)
                course_11!!.setTextColor(Color.WHITE)
                course[10]=1
            }
            else {
                course_11!!.setBackgroundResource(R.drawable.button_shape)
                course_11!!.setTextColor(Color.parseColor("#707070"))
                course[10]=0
            }
        }
        course_12!!.setOnClickListener {
            if(course[11]==0) {
                course_12!!.setBackgroundResource(R.drawable.button_shape_2)
                course_12!!.setTextColor(Color.WHITE)
                course[11]=1
            }
            else {
                course_12!!.setBackgroundResource(R.drawable.button_shape)
                course_12!!.setTextColor(Color.parseColor("#707070"))
                course[11]=0
            }
        }
        course_14!!.setOnClickListener {
            if(course[12]==0) {
                course_14!!.setBackgroundResource(R.drawable.button_shape_2)
                course_14!!.setTextColor(Color.WHITE)
                course[12]=1
            }
            else {
                course_14!!.setBackgroundResource(R.drawable.button_shape)
                course_14!!.setTextColor(Color.parseColor("#707070"))
                course[12]=0
            }
        }
        course_15!!.setOnClickListener {
            if(course[13]==0) {
                course_15!!.setBackgroundResource(R.drawable.button_shape_2)
                course_15!!.setTextColor(Color.WHITE)
                course[13]=1
            }
            else {
                course_15!!.setBackgroundResource(R.drawable.button_shape)
                course_15!!.setTextColor(Color.parseColor("#707070"))
                course[13]=0
            }
        }
        course_16!!.setOnClickListener {
            if(course[14]==0) {
                course_16!!.setBackgroundResource(R.drawable.button_shape_2)
                course_16!!.setTextColor(Color.WHITE)
                course[14]=1
            }
            else {
                course_16!!.setBackgroundResource(R.drawable.button_shape)
                course_16!!.setTextColor(Color.parseColor("#707070"))
                course[14]=0
            }
        }
        course_17!!.setOnClickListener {
            if(course[15]==0) {
                course_17!!.setBackgroundResource(R.drawable.button_shape_2)
                course_17!!.setTextColor(Color.WHITE)
                course[15]=1
            }
            else {
                course_17!!.setBackgroundResource(R.drawable.button_shape)
                course_17!!.setTextColor(Color.parseColor("#707070"))
                course[15]=0
            }
        }
        course_18!!.setOnClickListener {
            if(course[16]==0) {
                course_18!!.setBackgroundResource(R.drawable.button_shape_2)
                course_18!!.setTextColor(Color.WHITE)
                course[16]=1
            }
            else {
                course_18!!.setBackgroundResource(R.drawable.button_shape)
                course_18!!.setTextColor(Color.parseColor("#707070"))
                course[16]=0
            }
        }
        course_19!!.setOnClickListener {
            if(course[17]==0) {
                course_19!!.setBackgroundResource(R.drawable.button_shape_2)
                course_19!!.setTextColor(Color.WHITE)
                course[17]=1
            }
            else {
                course_19!!.setBackgroundResource(R.drawable.button_shape)
                course_19!!.setTextColor(Color.parseColor("#707070"))
                course[17]=0
            }
        }
        course_20!!.setOnClickListener {
            if(course[18]==0) {
                course_20!!.setBackgroundResource(R.drawable.button_shape_2)
                course_20!!.setTextColor(Color.WHITE)
                course[18]=1
            }
            else {
                course_20!!.setBackgroundResource(R.drawable.button_shape)
                course_20!!.setTextColor(Color.parseColor("#707070"))
                course[18]=0
            }
        }
        course_21!!.setOnClickListener {
            if(course[19]==0) {
                course_21!!.setBackgroundResource(R.drawable.button_shape_2)
                course_21!!.setTextColor(Color.WHITE)
                course[19]=1
            }
            else {
                course_21!!.setBackgroundResource(R.drawable.button_shape)
                course_21!!.setTextColor(Color.parseColor("#707070"))
                course[19]=0
            }
        }
        course_22!!.setOnClickListener {
            if(course[20]==0) {
                course_22!!.setBackgroundResource(R.drawable.button_shape_2)
                course_22!!.setTextColor(Color.WHITE)
                course[20]=1
            }
            else {
                course_22!!.setBackgroundResource(R.drawable.button_shape)
                course_22!!.setTextColor(Color.parseColor("#707070"))
                course[20]=0
            }
        }
        course_23!!.setOnClickListener {
            if(course[21]==0) {
                course_23!!.setBackgroundResource(R.drawable.button_shape_2)
                course_23!!.setTextColor(Color.WHITE)
                course[21]=1
            }
            else {
                course_23!!.setBackgroundResource(R.drawable.button_shape)
                course_23!!.setTextColor(Color.parseColor("#707070"))
                course[21]=0
            }
        }
        course_24!!.setOnClickListener {
            if(course[22]==0) {
                course_24!!.setBackgroundResource(R.drawable.button_shape_2)
                course_24!!.setTextColor(Color.WHITE)
                course[22]=1
            }
            else {
                course_24!!.setBackgroundResource(R.drawable.button_shape)
                course_24!!.setTextColor(Color.parseColor("#707070"))
                course[22]=0
            }
        }
        course_25!!.setOnClickListener {
            if(course[23]==0) {
                course_25!!.setBackgroundResource(R.drawable.button_shape_2)
                course_25!!.setTextColor(Color.WHITE)
                course[23]=1
            }
            else {
                course_25!!.setBackgroundResource(R.drawable.button_shape)
                course_25!!.setTextColor(Color.parseColor("#707070"))
                course[23]=0
            }
        }
        button_complete = findViewById(R.id.button_complete) as Button
        button_complete!!.setOnClickListener{

            var purposes : String = ""
            if(course[0]==1 || course[1]==1 || course[3]==1 || course[3]==1 || course[4]==1) {
                val i = Intent(this, Course1Activity::class.java)
                startActivity(i)
            }
            else if(course[6]==1 || course[7]==1 || course[10]==1) {
                val i = Intent(this, Course2Activity::class.java)
                startActivity(i)
            }
            else if(course[5]==1 || course[8]==1 || course[9]==1 || course[21]==1 || course[22]==1 || course[23]==1 || course[17]==1) {
                val i = Intent(this, Course3Activity::class.java)
                startActivity(i)
            }
            else if(course[11]==1 || course[12]==1 || course[13]==1 || course[14]==1) {
                val i = Intent(this, Course4Activity::class.java)
                startActivity(i)
            }
            else if(course[15]==1 || course[16]==1) {
                val i = Intent(this, Course5Activity::class.java)
                startActivity(i)
            }
            else if(course[18]==1 || course[19]==1 || course[20]==1) {
                val i = Intent(this, Course6Activity::class.java)
                startActivity(i)
            }


//            var purposes : String = ""
//            for(i in 0..23) {
//                if(course[i]==1) purposes+= courseName[i]+';'
//            }
//            Log.v(purposes, "purposes")
//
//
//            val putTodaySurveyResponse = networkService!!.putTodaySurvey("1", TodaySurveyData(purposes))
//            putTodaySurveyResponse.enqueue(object : Callback<TodaySurveyResponse>,
//                retrofit2.Callback<TodaySurveyResponse> {
//                override fun onResponse(call: Call<TodaySurveyResponse>?, response: Response<TodaySurveyResponse>?) {
//                    if(response!!.isSuccessful) {
//                        if(response.body().status=="200") {
//                            ApplicationController.instance!!.makeToast("complete survey")
//                        }
//                    }
//                }
//                override fun onFailure(call: Call<TodaySurveyResponse>?, t: Throwable?) {
//                    Log.v("실패", "failure")
//
//                    //응답 실패
//                    ApplicationController.instance!!.makeToast("check communication")
//                }
//
//            })
//
//            val i = Intent(this, Course4Activity::class.java)
//            startActivity(i)
        }
    }
}