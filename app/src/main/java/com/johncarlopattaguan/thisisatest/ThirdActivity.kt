package com.johncarlopattaguan.thisisatest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*


class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString( "user_message")
        mytextView.text = "Hi " + msg

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
