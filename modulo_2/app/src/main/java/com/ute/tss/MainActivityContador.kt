package com.ute.tss

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Contador simple con botones de incremento y decremento
class MainActivityContador : AppCompatActivity() {
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contador)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textContador = findViewById<TextView>(R.id.textContador)
        val btnIncrementar = findViewById<Button>(R.id.btnIncrementar)
        val btnDecrementar = findViewById<Button>(R.id.btnDecrementar)

        fun actualizarTexto() {
            textContador.text = contador.toString()
        }
        actualizarTexto()

        btnIncrementar.setOnClickListener {
            contador++
            actualizarTexto()
        }
        btnDecrementar.setOnClickListener {
            contador--
            actualizarTexto()
        }
    }
}
