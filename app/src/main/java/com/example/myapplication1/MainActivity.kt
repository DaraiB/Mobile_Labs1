package com.example.myapplication1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submit(v: View) {
        editText = findViewById<View>(R.id.name) as EditText
        val name = editText.text.toString()
        display (name)
    }
    fun display (text_name: String) {
        val textView = findViewById<View>(R.id.text_name) as TextView
        textView.text = ""+text_name
    }
}




