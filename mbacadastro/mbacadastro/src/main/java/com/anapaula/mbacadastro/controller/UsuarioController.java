package com.anapaula.mbacadastro.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
     
    
}
