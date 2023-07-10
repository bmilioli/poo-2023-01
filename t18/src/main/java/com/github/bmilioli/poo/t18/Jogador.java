package com.github.bmilioli.poo.t18;

public class Jogador {
    String nome;


    public Jogador(String nome) {
        this.nome = nome;
    }

    public Lance mover(Peca peca, String posicaoX, String posicaoY) {
        Lance lance = new Lance(peca, this);
        lance.mover(posicaoX, posicaoY);
        return lance;
    }
}
