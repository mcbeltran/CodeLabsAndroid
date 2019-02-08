package com.example.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hello_toast.*

class HelloToast : AppCompatActivity() {

    var mCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_toast)
    }

    fun showToast(view: View) {
        var t = Toast.makeText(this, "Hello Toast!!!", Toast.LENGTH_SHORT)
        t.show()
    }
    fun countUp(view: View) {
        show_count.text = mCount++.toString()
    }
}
