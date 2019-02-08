package com.example.kotlinpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastAct (view: View){
        val intent = Intent(this, HelloToast::class.java)
        startActivity(intent)

    }

    fun scrollAct (view: View){
        val intent2 = Intent(this, TextScrollTest::class.java)
        startActivity(intent2)
    }
}
