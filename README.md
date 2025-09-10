# Desafio: App Android com Fluxo de Login, Boas-vindas e Configurações

## 📌 Proposta

O desafio consiste em criar um aplicativo Android simples utilizando **Kotlin** e **Jetpack Compose**, implementando três telas principais:

1. **Tela de Login/Cadastro**

   * O usuário insere seu nome para iniciar a sessão.
   * Validação para impedir cadastro vazio.

2. **Tela de Boas-vindas**

   * Exibe o nome do usuário cadastrado.
   * Contém botão para acessar as configurações.

3. **Tela de Configurações**

   * Permite alterar preferências do app (exemplo: tema claro/escuro).
   * Retorno para a tela de boas-vindas.

---

## 🛠️ Tecnologias Utilizadas

* **Kotlin** para linguagem principal.
* **Jetpack Compose** para construção das telas.
* **Navigation Compose** para navegação entre telas.
* **ViewModel** para gerenciamento de estado (nome do usuário e preferências).

---

## 🚀 Funcionalidades

* Cadastro de nome do usuário.
* Exibição personalizada de boas-vindas.
* Alteração do tema do aplicativo (claro/escuro).
* Navegação fluida entre as telas.

---

## 🔮 Possíveis Melhorias Futuras

* Persistência de dados com **DataStore** para manter nome e preferências salvos mesmo após fechar o app.
* Adicionar mais opções de configurações (idioma, notificações etc.).
* Testes instrumentados para validar a navegação e regras de negócio.

---

## ▶️ Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seuusuario/login-compose-challenge.git
   ```
2. Abra o projeto no **Android Studio**.
3. Execute o app em um emulador ou dispositivo físico.

---

## 🎯 Objetivo do Desafio

Demonstrar domínio de conceitos fundamentais no desenvolvimento Android moderno com Compose:

* Estruturação de telas.
* Navegação entre telas.
* Gerenciamento de estado.
* Aplicação de boas práticas de arquitetura simples.
