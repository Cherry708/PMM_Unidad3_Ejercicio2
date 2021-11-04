package com.example.pmm_unidad3_ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val intent = getIntent()
        val extras = intent.getExtras()

        val resultado = extras?.getInt("resultado")
        val tvResultado = findViewById<TextView>(R.id.tvResultado1)
        tvResultado.text = resultado.toString()
    }
}