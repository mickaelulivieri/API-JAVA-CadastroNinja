package dev.java10x.CadastroNinja;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_Ninja")
public class NinjaModel {

    //atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nome;

    String email;

    int idade;

    // no args constructor
    public NinjaModel(){
    }

    //all args constructor
    public NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


}

