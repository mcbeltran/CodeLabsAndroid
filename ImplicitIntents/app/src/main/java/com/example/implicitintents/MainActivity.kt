package com.example.implicitintents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ShareCompat
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openWebsite(view: View){
        // Get the URL text.
        val url: String = edittxt_website.text.toString()
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)

        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
        else{
            Log.d("ImplicitIntents","Can't handle this!!!!")
        }
    }

    fun openLocation(view: View){
        val location: String = edittxt_location.text.toString()
        val address: Uri = Uri.parse("geo:0,0?q=" + location)
        val intent = Intent(Intent.ACTION_VIEW, address)

        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
        else{
            Log.d("ImplicitIntents","Can't handle this!!!!")
        }

    }

    fun shareText(view: View){
        val text: String = edittxt_sharetxt.text.toString()
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder.from(this)
            .setType(mimeType)
            .setChooserTitle("Share this text with: ")
            .setText(text)
            .startChooser()

    }
}


