package com.example.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_text_scroll_test.*

class TextScrollTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_scroll_test)

        registerForContextMenu(article)

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        var inflater = menuInflater
        inflater.inflate(R.menu.menu_context_p, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_edit -> {displayToast("Edit choice clicked"); true}
            R.id.action_share -> {displayToast("Share choice clicked"); true}
            R.id.action_delete -> {displayToast("Delete choice clicked"); true}
            else -> super.onContextItemSelected(item)
        }
    }



    fun displayToast(message: String){
        Log.d("LOG", "The messeage received in displayToast is: " + message )
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

}

