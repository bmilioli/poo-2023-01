package com.github.bmilioli.poo.t19.carta;

public class ConfiguracoesCartas {
    //Possuem Cartas e esta na mao e um jogador ou no monte
    private Carta[] cartas;
    private Jogador jogador;
    private MaoJogador maoJogador;
    private Monte monte;
    //Construção
    public ConfiguracoesCartas(Carta[] cartas, Jogador jogador, MaoJogador maoJogador, Monte monte) {
        this.cartas = cartas;
        this.jogador = jogador;
        this.maoJogador = maoJogador;
        this.monte = monte;
    }
}
