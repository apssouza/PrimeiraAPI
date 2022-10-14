package com.anapaula.mbacadastro.banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anapaula.mbacadastro.entidade.Usuario;

@Repository
public interface UsuarioBanco extends CrudRepository<Usuario, Integer>{
    
}
