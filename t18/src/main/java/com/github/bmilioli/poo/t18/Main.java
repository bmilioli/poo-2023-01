package com.github.bmilioli.poo.t18;

public class Main {
    public static void main(String[] args) {
        //Criar a partida imortal
        Partida partidaImortal = new Partida(new Jogador("Lionel Kieseritzky"), new Jogador("Adolf Anderssen"));
        //lances
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("P"), "e", "4"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("P"), "e", "5"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("P"), "f", "4"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("P"), "e", "xf4"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("B"), "c", "4"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("D"), "h", "4+"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("R"), "f", "1"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("P"), "b", "5"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("B"), "xb", "5"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("C"), "f", "6"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("C"), "f", "3"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("C"), "h", "5"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("C"), "h", "4"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("D"), "g", "5"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("C"), "f", "5"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("P"), "c", "6"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("P"), "g", "4"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("C"), "f", "6"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("T"), "g", "1!"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("C"), "xb", "5"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("D"), "g", "6"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("P"), "h", "5"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("D"), "f", "3"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("C"), "g", "8"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("B"), "xf", "4"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("C"), "c", "3"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("B"), "c", "5"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("C"), "d", "5"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("D"), "xb", "2"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("B"), "xg", "1?"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("P"), "e", "5!"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("C"), "a", "6"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("C"), "XG", "7+"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("R"), "d" , "8"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("D"), "f", "6+"));
        partidaImortal.lances.add(partidaImortal.jogador1.mover(new Peca("C"), "xf", "6"));
        partidaImortal.lances.add(partidaImortal.jogador2.mover(new Peca("B"), "e", "7#"));


        //Imprimir a partida
        partidaImortal.imprimir();




    }

}
