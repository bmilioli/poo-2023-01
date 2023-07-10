package com.github.bmilioli.poo.t18;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Partida {
    Jogador jogador1;
    Jogador jogador2;
    public ArrayList<Lance> lances = new ArrayList<Lance>(100);

    public Partida(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void imprimir() {
        for (Lance lance : this.lances) {
            lance.imprimir();
        }
    }
}


