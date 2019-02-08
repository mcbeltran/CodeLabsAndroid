package com.example.hellocompat

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val colorArray: Array<String> = arrayOf("red", "pink", "purple", "deep_purple",
          "indigo", "blue", "light_blue", "cyan", "teal", "green",
          "light_green", "lime", "yellow", "amber", "orange", "deep_orange",
          "brown", "grey", "blue_grey", "black" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            hello_textview.setTextColor(savedInstanceState.getInt("color"));
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        //save the current text color
        if (outState != null) {
            outState.putInt("color", hello_textview.currentTextColor)
        }
    }


    fun changeColor (view: View){
        var random: Random = Random
        var colorName = colorArray[random.nextInt(20)]
        var colorResourceName = resources.getIdentifier(colorName,"color", applicationContext.packageName)
        var colorRes: Int = resources.getColor(colorResourceName, this.theme)
        hello_textview.setTextColor(colorRes)
    }
}
