package com.github.bmilioli.poo.t19.associacao;

public class Usuario  extends Pessoa{
    //COrrija o eero
    private String login;
    private String senha;
    private String email;


    public Usuario(String nome, String cpf, String rg, String dataNascimento) {
        super(nome, cpf, rg, dataNascimento);
    }
}
