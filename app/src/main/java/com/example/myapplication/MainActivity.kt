package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referenciando os elementos do layout
        val userNameEditText: EditText = findViewById(R.id.editTextUserName)
        val loginButton: Button = findViewById(R.id.buttonLogin)

        // Configurando o que acontece quando o botão é clicado
        loginButton.setOnClickListener {
            // Pega o nome digitado no campo de texto
            val userName = userNameEditText.text.toString()

            // Cria um Intent para iniciar a próxima Activity (tela de boas-viands)
            val intent = Intent(this, WelcomeActivity::class.java)

            // Coloca o nome do usuário no Intent para ser passado
            // A chave "EXTRA_USER_NAME" é como um rótulo para o valor
            intent.putExtra("EXTRA_USER_NAME", userName)

            // Inicia a próxima tela
            startActivity(intent)
        }
    }
}