package com.github.bmilioli.poo.t19.linha;

public class Linha {
    //Formada por vários pontos, não podendo ser vazio
    private Ponto[] pontos;
    public void mover(int x, int y){
        for (Ponto ponto : pontos) {
            ponto.mover(x, y);
        }
    }
}
