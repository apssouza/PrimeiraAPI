package com.anapaula.mbacadastro.entidade;

import javax.persistence.Entity;
@Entity

// nome de classe em java começa com letra maiúscula
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String senha;
    private String user;
    private String email;

// arrow function ativada
  get getId => this.id;

 set setId( id) => this.id = id;

  get getNome => this.nome;

 set setNome( nome) => this.nome = nome;

  get getSenha => this.senha;

 set setSenha( senha) => this.senha = senha;

  get getUser => this.user;

 set setUser( user) => this.user = user;

  get getEmail => this.email;

 set setEmail( email) => this.email = email;

//  sem arrow function
//  public int GetId(){
//     return id;
//  }
//  public void setId(int id){
//     this.id = id;
//  }
    
}
