package com.github.bmilioli.poo.t18;

public class Main {
    public static void main(String[] args) {
        //Criar a partida imortal
        Partida partidaImortal = new Partida(new Jogador("Lionel Kieseritzky"), new Jogador("Adolf Anderssen"));
        //lances
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("P"), "e", "4"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("P"), "e", "5"));
        //GEre o o resto: https://pt.wikipedia.org/wiki/Partida_Imortal_de_Anderssen
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("P"), "f", "4"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("P"), "e", "xf4"));





        //Imprimir a partida
        partidaImortal.imprimir();




    }

}
