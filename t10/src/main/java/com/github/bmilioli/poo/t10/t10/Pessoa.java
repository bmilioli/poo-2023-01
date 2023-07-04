package com.github.bmilioli.poo.t10.t10;

public class Pessoa {
    String nome;
    int idade;
    String cpf;

    String sexo;

    public Pessoa(String nome, int idade, String cpf, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }
}
