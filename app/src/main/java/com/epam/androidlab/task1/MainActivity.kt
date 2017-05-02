package com.epam.androidlab.task1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TV = findViewById(R.id.activity_main_TV) as TextView
        TV.text = getString(com.epam.androidlab.mylibrary.R.string.my_library_hello)
    }
}
