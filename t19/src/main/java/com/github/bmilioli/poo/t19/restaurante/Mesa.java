package com.github.bmilioli.poo.t19.restaurante;

public class Mesa {
    //Uma mesa pode ser ocupada por até 10 pessoas
    private static final int MAX_PESSOAS = 10;
    private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    private int qtdPessoas = 0;
    //A mesa pode estar ocupada ou não
    private boolean ocupada = false;
    //A mesa tem um número
    private int numero;

}
