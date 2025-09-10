package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Referenciando os elementos do layout
        val welcomeTextView: TextView = findViewById(R.id.textViewWelcome)
        val settingsButton: Button = findViewById(R.id.buttonSettings)

        // Pega o Intent que iniciou esta Activity
        val intent = intent

        // Obtém o nome do usuário do Intent usando a mesma chave
        val userName = intent.getStringExtra("EXTRA_USER_NAME")

        // Verifica se o nome não é nulo e atualiza o TextView
        if (!userName.isNullOrEmpty()) {
            welcomeTextView.text = "Olá, $userName!"
        }

        // Configurando o que acontece quando o botão de configurações é clicado
        settingsButton.setOnClickListener {
            // Cria um Intent para iniciar a SettingsActivity
            val settingsIntent = Intent(this, SettingsActivity::class.java)
            // Inicia a tela de configurações
            startActivity(settingsIntent)
        }
    }
}