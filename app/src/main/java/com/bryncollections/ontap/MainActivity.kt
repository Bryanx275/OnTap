package com.bryncollections.ontap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // declare variable for counting
    var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTouch(view: View) {
        // increment counter
        count++

        // locate textview and update the label

        var textView = findViewById(R.id.textView) as TextView
        textView.text = "You touched $count times"
    }
}