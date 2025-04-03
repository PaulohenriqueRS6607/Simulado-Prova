const API_URL = "http:localhost:3306/list"; 

async function listarUsuarios() {
    const response = await fetch(`${API_URL}/usuarios`);
    const usuarios = await response.json();

    const select = document.getElementById("usuarioTarefa");
    select.innerHTML = "";
    usuarios.forEach(user => {
        const option = document.createElement("option");
        option.value = user.id;
        option.textContent = user.nome;
        select.appendChild(option);
    });
}

async function listarTarefas() {
    const response = await fetch(`${API_URL}/tarefas`);
    const tarefas = await response.json();

    const lista = document.getElementById("listaTarefas");
    lista.innerHTML = "";
    tarefas.forEach(tarefa => {
        const item = document.createElement("li");
        item.textContent = `${tarefa.descricao} - ${tarefa.setor} (Status: ${tarefa.status})`;
        lista.appendChild(item);
    });
}

async function salvarUsuario() {
    const nome = document.getElementById("nomeUsuario").value;
    const email = document.getElementById("emailUsuario").value;

    const response = await fetch(`${API_URL}/usuarios`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ nome, email })
    });

    if (response.ok) {
        alert("Usuário cadastrado!");
        listarUsuarios();
    }
}

async function salvarTarefa() {
    const descricao = document.getElementById("descricaoTarefa").value;
    const setor = document.getElementById("setorTarefa").value;
    const id_usuario = document.getElementById("usuarioTarefa").value;

    const response = await fetch(`${API_URL}/tarefas`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ descricao, setor, id_usuario })
    });

    if (response.ok) {
        alert("Tarefa cadastrada!");
        listarTarefas();
    }
}

document.addEventListener("DOMContentLoaded", () => {
    listarUsuarios();
    listarTarefas();
});
