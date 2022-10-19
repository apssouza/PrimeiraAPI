let login = []
function entrar(){
    // usuario
    let user = document.getElementById('user').value

    // senha
    let senha = document.getElementById('senha').value

    let logar = {
        user: user,
        senha: senha
    }
}
console.log(login)

let cadastro = []
function cadastrar(){
    // nome
    let nome = document.getElementById('nome').value

    // usuario
    let user = document.getElementById('user').value

    // senha
    let senha = document.getElementById('senha').value

    // confirme a senha
    let confirmSenha = document.getElementById('confirmSenha').value

    let dados = {
        nome: nome,
        usuario: user,
        senha: senha,
        confirmacao: confirmSenha
    }
    cadastro.push(dados)
}

console.log(cadastro)