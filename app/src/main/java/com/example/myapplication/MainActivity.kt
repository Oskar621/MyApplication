package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczbaPierwsza = 0
        var liczbaDruga = 0
        var suma = 0
        findViewById<Button>(R.id.Wyswietl).setOnClickListener {
            findViewById<TextView>(R.id.DoWysw).text = findViewById<TextInputEditText>(R.id.poletekst2).text
        }
        findViewById<Button>(R.id.DodajiPolacz).setOnClickListener {
            findViewById<TextView>(R.id.DoWysw).text =
                findViewById<TextView>(R.id.DoWysw).text.toString() + findViewById<TextInputEditText>(R.id.poletekst2).text.toString()
        }
        findViewById<Button>(R.id.SumaLiczb).setOnClickListener {

            liczbaPierwsza = findViewById<EditText>(R.id.DoLiczb1).text.toString().toInt()
            liczbaDruga = findViewById<EditText>(R.id.DoLiczb2).text.toString().toInt()
            suma = liczbaPierwsza + liczbaDruga
            findViewById<TextView>(R.id.DoWysw).text = liczbaPierwsza.toString()+ "+" + liczbaDruga + "=" + suma.toString()
        }
    }
}