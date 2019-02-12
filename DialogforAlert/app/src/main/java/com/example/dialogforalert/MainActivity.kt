package com.example.dialogforalert

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowAlert(view: View){
        var myAlertBuilder = AlertDialog.Builder(this)
        myAlertBuilder.setTitle(getString(R.string.alert))
        .setMessage(getString(R.string.alert_message))
        .setPositiveButton(getString(R.string.ok_button)){
            dialog, which ->
            Toast.makeText(this, getString(R.string.ok_msg), Toast.LENGTH_SHORT).show()

        }
        .setNegativeButton(getString(R.string.cancel_button)){
                    dialog, which ->
                Toast.makeText(this, getString(R.string.cancel_msg), Toast.LENGTH_SHORT).show()
        }
        //Show
        myAlertBuilder.show()
    }
}
