package com.example.intentfirstkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView(){
        val b_check = findViewById<Button>(R.id.b_check)
        b_check.setOnClickListener(){
            openSecondActivity()
        }
    }

    fun openSecondActivity() {
        var intent = Intent(this , SecondActivity::class.java)
        intent.putExtra("name" , "Zuhriddin")
        intent.putExtra("age" , 29)
        startActivity(intent)
    }
}