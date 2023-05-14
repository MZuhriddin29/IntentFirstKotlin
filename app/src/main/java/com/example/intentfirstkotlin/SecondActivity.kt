package com.example.intentfirstkotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }

    fun initView(){
         var tv_data = findViewById<TextView>(R.id.tv_data)
         var name =intent.getStringExtra("name")
         var age =intent.getIntExtra("age" , 0)
         tv_data.text = name+" "+ age
     }

}