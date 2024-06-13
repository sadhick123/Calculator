package com.sadhick.myapplication4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var plus_button: Button? = null
    var subtract_button: Button? = null
    var multiply_button: Button? = null
    var division_button: Button? = null
    var edit_data_TextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        plus_button = findViewById(R.id.plus)
        subtract_button = findViewById(R.id.subtract)
        multiply_button = findViewById(R.id.multiply)
        division_button = findViewById(R.id.division)
        edit_data_TextView = findViewById(R.id.edit_data)


        plus_button?.setOnClickListener() {
            val get_text = edit_data_TextView?.text?.toString()
            val int_getdata = (get_text?.toIntOrNull() ?: 0) + 2
            edit_data_TextView?.setText(int_getdata.toString())
        }

        subtract_button?.setOnClickListener() {
            val get_text = edit_data_TextView?.text?.toString()
            val int_getdata = (get_text?.toIntOrNull() ?: 0) - 2
            edit_data_TextView?.setText(int_getdata.toString())
        }
        multiply_button?.setOnClickListener() {
            val get_text = edit_data_TextView?.text?.toString()
            val int_getdata = (get_text?.toIntOrNull() ?: 0) * 2
            edit_data_TextView?.setText(int_getdata.toString())
        }
        division_button?.setOnClickListener() {
            val get_text = edit_data_TextView?.text?.toString()
            val int_getdata = (get_text?.toIntOrNull() ?: 0) / 2
            edit_data_TextView?.setText(int_getdata.toString())

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }
    }
}