package com.taboret.mobilek

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dopisz = findViewById<Button>(R.id.dopisz)
        val przywroc = findViewById<Button>(R.id.przywroc)
        val teskt = findViewById<TextView>(R.id.text)
        val wpisz = findViewById<EditText>(R.id.wpisz)
    }
}