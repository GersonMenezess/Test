package com.example.menu

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    class CadastroActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_cadastro)

            val buttonCadastrar = findViewById<Button>(R.id.buttonCadastrar)
            buttonCadastrar.setOnClickListener {
                cadastrarRemedio()
            }
        }

        private fun cadastrarRemedio() {
            val editTextNome = findViewById<EditText>(R.id.editTextNome)
            val editTextDescricao = findViewById<EditText>(R.id.editTextDescricao)

            val nome = editTextNome.text.toString()
            val descricao = editTextDescricao.text.toString()

            val remedio = Remedio(nome, descricao)
            RemediosService.cadastrarRemedio()
            Toast.makeText(this, "Remédio cadastrado com sucesso!!!", Toast.LENGTH_SHORT).show()
        }
    }

}

class RemediosService {
    companion object {
        fun cadastrarRemedio() {
            TODO("Not yet implemented")
        }
    }

}

class Remedio(nome: String, descricao: String) {

}

