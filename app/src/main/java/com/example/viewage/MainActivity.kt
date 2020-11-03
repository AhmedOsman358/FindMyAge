package com.example.viewage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        get_age_btn.setOnClickListener {

            val yourdatebirth:Int=enter_birth_et.text.toString().toInt()
            val  CurrentYear= Calendar.getInstance().get(Calendar.YEAR)
            var age=CurrentYear-yourdatebirth
            age_tv.text="YourAge"+" "+ age + ""+"Years"



        }
    }
}