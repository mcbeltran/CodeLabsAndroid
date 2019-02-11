package com.example.droidcafe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener  {

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        if (parent != null) {
            displayToast(parent.getItemAtPosition(position).toString())
        }
        Log.d("LOG", "Item in the spinner is selected")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val msg = "Order: " + intent.getStringExtra("EXTRA_MSG")
        order_textview.text = msg

        //Coding challenge 1
        radio_group_delivery.check(R.id.nextday)

        //Start
        label_spinner.onItemSelectedListener = this

        //Create Adapter
        var adapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        //Set the adapter
        label_spinner.adapter = adapter
    }

    fun onRadioButtonClicked(view: View){
        when (view.id){
            R.id.sameday -> {
                displayToast(getString(R.string.same_day_messenger_service))
            }

            R.id.nextday -> {
                displayToast(getString(R.string.next_day_ground_delivery))
            }

            R.id.pickup -> {
                displayToast(getString(R.string.pick_up))
            }
        }
    }

    fun displayToast(msg: String){
        Toast.makeText(this.applicationContext, msg, Toast.LENGTH_SHORT).show()
    }


}




