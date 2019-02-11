package com.example.droidcafe

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.EventLogTags
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mOrderMessage: String = ""
    //val extraMsg: String = "com.example.android.droidcafe.extra.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        mOrderMessage = ""

        fab.setOnClickListener{
          var intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("EXTRA_MSG", mOrderMessage)
            startActivity(intent)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {

            R.id.action_order -> {displayToast(getString(R.string.action_order_message))
                var intent: Intent = Intent(this, OrderActivity::class.java)
                intent.putExtra("EXTRA_MSG", mOrderMessage)
                startActivity(intent)
                ; true}
            R.id.action_status -> {displayToast(getString(R.string.action_status_message)); true}
            R.id.action_favorites -> {displayToast(getString(R.string.action_favorites_message)); true}
            R.id.action_contact -> {displayToast(getString(R.string.action_contact_message)); true}

            else -> super.onOptionsItemSelected(item)
        }
    }

    fun displayToast(message: String){
        Log.d("LOG", "The messeage received in displayToast is: " + message )
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    fun showDonutOrder(view: View){
        mOrderMessage = getString(R.string.donut_order_message)
        displayToast(mOrderMessage)
    }
    fun showIceCreamOrder(view: View) {
        mOrderMessage = getString(R.string.ice_cream_order_message)
        displayToast(mOrderMessage)
    }
    fun showFroyoOrder(view: View){
        mOrderMessage = getString(R.string.froyo_order_message)
        displayToast(mOrderMessage)
    }

}
