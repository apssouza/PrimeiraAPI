package com.anapaula.mbacadastro.controller;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anapaula.mbacadastro.banco.UsuarioBanco;
import com.anapaula.mbacadastro.entidade.Usuario;

@RestController
public class UsuarioController {

    // erro JPA é erro de acesso ao banco
    // autowired é o que permite o acesso
    @Autowired
    private UsuarioBanco acessoBanco;
    
    @GetMapping("/usuarios")
    public List<Usuario> listarUsusaUsuarios(){
        return (List<Usuario>)acessoBanco.findAll();
    }
     
    @GetMapping("/usuarios/{id}")
    public Optional<Usuario> peguePorId(@PathVariable int id){
        return acessoBanco.findById(id);
    } 

    // na URL só presta o get
    // insomnia é um recurso utilizado para fazer requisições
    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody Usuario novoUsuario){
        acessoBanco.save(novoUsuario);
    }
}
