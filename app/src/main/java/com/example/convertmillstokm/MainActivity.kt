package com.example.convertmillstokm

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.roundToLong

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_milles_to_km: Button = findViewById(R.id.button_milles_to_km)
        val button_km_to_milles: Button = findViewById(R.id.button_km_to_milles)
        val inputMilles: EditText = findViewById(R.id.InputMilles)
        val inputKm: EditText = findViewById(R.id.InputKm)

        //val toast: Toast = Toast.makeText(this, "19.9".toDouble().javaClass.toString(), Toast.LENGTH_SHORT)
        //toast.show()
        button_milles_to_km.setOnClickListener {
            val toast: Toast
            if (inputMilles.text.toString() != "") {
                toast = Toast.makeText(
                    this,
                    "KM = ${((inputMilles.text.toString()
                        .toFloat() / 0.62137 * 100.0).roundToLong() / 100.0)}",
                    Toast.LENGTH_SHORT
                )
                toast.show()
                inputKm.setText(((inputMilles.text.toString()
                    .toFloat() / 0.62137 * 100.0).roundToLong() / 100.0).toString())
            } else {
                toast = Toast.makeText(this, "Укажите мили!", Toast.LENGTH_SHORT)
                toast.show()
            }

        }
        button_km_to_milles.setOnClickListener {
            val toast: Toast
            if (inputKm.text.toString() != "") {
                toast = Toast.makeText(
                    this,
                    "Milles = ${
                        (inputKm.text.toString().toFloat() * 0.62137 * 100.0).roundToLong() / 100.0}",
                    Toast.LENGTH_SHORT
                )
                toast.show()
                inputMilles.setText(((inputKm.text.toString().toFloat() * 0.62137 * 100.0).roundToLong() / 100.0).toString())
            } else {
                toast = Toast.makeText(this, "Укажите километры!", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}