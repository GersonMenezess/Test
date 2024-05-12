package com.example.menu

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConsultaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consulta)
        val listViewRemedios = findViewById<ListView>(R.id.listViewRemedios)
        val listaRemedios = obterListaRemedios()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaRemedios)
        listViewRemedios.adapter = adapter
    }

    private fun obterListaRemedios(): List<String> {
        return listOf("Paracetamol", "Dipirona", "Ibuprofeno", "Dorflex")
    }
}


