package com.anapaula.mbacadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.anapaula.mbacadastro.banco.UsuarioBanco;

@RestController
// Controller: lógica de buscar os dados 
public class UsuarioController {
    
    // @ é um spring, uma forma de injetar algo no projeto
    @Autowired
    private UsuarioBanco acessoBanco;

    @GetMapping("/usuarios")
    public List getUser(){
        List listaUsuario = (List) acessoBanco.findAll();
        return listaUsuario;
    }

    // CrudRepository é utilizado para acessar o banco
    public List getUser(){
        List listaUsuario = (List) acessoBanco.findAll();
        return "listaUsuario";
    }
}
