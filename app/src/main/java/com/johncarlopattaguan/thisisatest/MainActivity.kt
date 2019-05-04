package com.johncarlopattaguan.thisisatest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnclick.setOnClickListener {
            mytxtview.text = "YEST"
            Toast.makeText(this, mytxtview.text.toString(), Toast.LENGTH_SHORT).show()
        }

        btn2ndclick.setOnClickListener {

            val message = myedittxt.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()


        }

    }
}
