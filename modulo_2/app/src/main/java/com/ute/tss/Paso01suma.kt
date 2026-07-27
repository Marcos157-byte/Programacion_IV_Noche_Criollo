package com.ute.tss

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Paso 01: suma de dos números ingresados por el usuario
class Paso01suma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_paso01_suma)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editNumero1 = findViewById<EditText>(R.id.editNumero1)
        val editNumero2 = findViewById<EditText>(R.id.editNumero2)
        val textResultado = findViewById<TextView>(R.id.textResultado)
        val btnSumar = findViewById<Button>(R.id.btnSumar)

        btnSumar.setOnClickListener {
            val numero1 = editNumero1.text.toString().toDoubleOrNull() ?: 0.0
            val numero2 = editNumero2.text.toString().toDoubleOrNull() ?: 0.0
            textResultado.text = "Resultado: ${numero1 + numero2}"
        }
    }
}
