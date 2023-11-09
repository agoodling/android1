package com.example.android1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.set

class MainActivity : AppCompatActivity() {



   // val clearButton = findViewById(R.id.clearButton) as Button
  //  val calcButton = findViewById(R.id.calcButton) as Button




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1Lat: EditText = findViewById(R.id.p1Lat)
        val p1Long: EditText = findViewById(R.id.p1Long)
        val p2Lat: EditText = findViewById(R.id.p2Lat)
        val p2Long: EditText = findViewById(R.id.p2Long)

        val clearButton = findViewById<Button>(R.id.clearButton)
        val calcButton = findViewById<Button>(R.id.calcButton)
        clearButton.setOnClickListener{
            Toast.makeText(this@MainActivity,"YOU did it",Toast.LENGTH_SHORT).show()
            p1Lat.setText("")
            p1Long.setText("")
            p2Lat.setText("")
            p2Long.setText("")

        }
    }

}