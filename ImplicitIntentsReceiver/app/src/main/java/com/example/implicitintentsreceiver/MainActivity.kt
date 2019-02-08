package com.example.implicitintentsreceiver

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent

        if (intent.data != null){
            val uri: Uri = intent.data
            val uristring = "URI: " + uri.toString()
            text_uri_message.text = uristring
        }


    }
}
