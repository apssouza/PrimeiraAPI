package com.anapaula.mbacadastro.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anapaula.mbacadastro.banco.UsuarioBanco;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioBanco acessoBanco;
    
    @GetMapping("/usuarios")
    public String getUsuarios(){
        acessoBanco.findAll();
        return "<h1>Teste De API<h1>";
    }
    
}
