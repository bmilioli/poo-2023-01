package com.github.bmilioli.poo.t18;

public class Lance {
    public Peca peca;
    public Jogador jogador;

    public Lance(Peca peca, Jogador jogador) {
        this.peca = peca;
        this.jogador = jogador;
    }
    //mover a peçar para outra posição
    public void mover(String posicaoX, String posicaoY) {
        this.peca.posicaoX = posicaoX;
        this.peca.posicaoY = posicaoY;
    }

    //imprimir lance
    public void imprimir() {
        System.out.println("Jogador: " + this.jogador.nome);
        System.out.println(this.peca.nome + this.peca.posicaoX + this.peca.posicaoY);
        System.out.println("\n");
    }


}
