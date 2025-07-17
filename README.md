# Gerenciador de Tarefas - Spring Boot

[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-orange.svg)](https://www.mysql.com/)

---

## 📋 Sumário
- [Descrição](#descrição)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Executar](#como-executar)
- [Endpoints da API](#endpoints-da-api)
- [Exemplo de Consumo no Front-end](#exemplo-de-consumo-no-front-end)
- [Observações](#observações)

---

## 📝 Descrição

Este projeto é um gerenciador de tarefas desenvolvido em Java com Spring Boot, utilizando banco de dados MySQL. Permite o cadastro de usuários e tarefas, associando cada tarefa a um usuário. O front-end é feito em HTML, CSS e JavaScript puro, consumindo as APIs REST do backend.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3
- Spring Data JPA
- MySQL
- HTML5, CSS3, JavaScript (ES6+)

---

## ⚙️ Como Executar

1. **Clone o repositório:**
   ```bash
   git clone <url-do-repo>
   ```
2. **Configure o banco de dados MySQL:**
   - Crie um banco chamado `prova`.
   - Ajuste usuário e senha no arquivo `src/main/resources/application.properties` se necessário.
3. **Acesse o front-end:**
   - Abra o arquivo `src/main/resources/static/index.html` no navegador.

---

## 📡 Endpoints da API

### Usuários

- **Cadastrar usuário**
  - `POST /usuarios`
  - Corpo (JSON):
    ```json
    {
      "nome": "Nome do usuário",
      "email": "email@exemplo.com"
    }
    ```
  - Resposta: Usuário cadastrado (JSON)

### Tarefas

- **Cadastrar tarefa**
  - `POST /tarefas`
  - Corpo (JSON):
    ```json
    {
      "descricao": "Descrição da tarefa",
      "setor": "Setor responsável",
      "id_usuario": 1
    }
    ```
  - Resposta: Tarefa cadastrada (JSON)

- **Listar tarefas**
  - `GET /tarefas`
  - Resposta: Lista de tarefas (JSON)

---

## 💻 Exemplo de Consumo no Front-end

O arquivo `script.js` faz as requisições para as rotas acima. Exemplo de uso:

```js
// Listar tarefas
fetch("http://localhost:8080/tarefas")
  .then(res => res.json())
  .then(tarefas => console.log(tarefas));

// Cadastrar usuário
fetch("http://localhost:8080/usuarios", {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify({ nome: "Maria", email: "maria@exemplo.com" })
});
```

> **Obs:** O endereço padrão do Spring Boot é `http://localhost:8080`. Se mudar a porta, ajuste as URLs no front-end.

---

## 📌 Observações

- Todas as requisições são feitas via `fetch` no JavaScript.
- O projeto é fullstack, mas o front-end pode ser aberto diretamente no navegador.
- O objetivo é educacional, para prática de consumo de APIs REST, manipulação de dados e atualização dinâmica da interface web.

---

Correção de uma atividade de simulado de uma prova, na qual era permitido apenas o uso de anotações físicas e do notebook sem acesso à internet.
