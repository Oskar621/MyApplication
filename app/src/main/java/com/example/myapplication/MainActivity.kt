package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tekst1 = " "
        var wynik = " "
        var tekst2 = " "
        findViewById<Button>(R.id.Dodajnapis).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextInputLayout>(R.id.poletekst1).toString()
        }
        findViewById<Button>(R.id.Przywroc).setOnClickListener {

        }
        findViewById<Button>(R.id.ZapiszTekst).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = find
            findViewById<TextInputLayout>(R.id.poletekst1).text = ""
        }
    }
    }
}