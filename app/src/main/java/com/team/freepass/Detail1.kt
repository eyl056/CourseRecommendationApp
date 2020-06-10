package com.team.freepass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detail1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail1)

        var img1: ImageView = findViewById(R.id.img1)
        img1.setOnClickListener{
            var intent = Intent(this, Course1DetailActivity::class.java)
            startActivity(intent)
        }
        var img2: ImageView = findViewById(R.id.img2)
        img2.setOnClickListener{
            val intent= Intent(this, TodaySurveyActivity::class.java)
            startActivity(intent)
        }
        var textfreepass: TextView = findViewById(R.id.textfreepass)
        textfreepass.setText("프리패스")
        textfreepass.setOnClickListener{

        }
    }
}