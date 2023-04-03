package com.example.guilhermegarcia_rm87192

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val distancia = findViewById<EditText>(R.id.ETDistancia)
        val preco = findViewById<EditText>(R.id.ETPreco)
        val autonomia = findViewById<EditText>(R.id.ETAutonomia)
        val txtDistancia = findViewById<TextView>(R.id.TVDescDistancia)
        val txtPreco = findViewById<TextView>(R.id.TVDescPreco)
        val txtAutonomia = findViewById<TextView>(R.id.TVDescAutonomia)
        val txtResultado = findViewById<TextView>(R.id.TVValorResultado)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            var res = (distancia.text.toString().toFloat() * preco.text.toString().toFloat()) / autonomia.text.toString().toFloat()
            txtResultado.text = "R$ " + res.toString()
        }

    }
}