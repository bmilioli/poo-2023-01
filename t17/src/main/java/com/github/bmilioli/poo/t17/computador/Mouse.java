package com.github.bmilioli.poo.t17.computador;

public class Mouse {

            private final String marca;
            private final String modelo;

            public Mouse(String marca, String modelo) {
                this.marca = marca;
                this.modelo = modelo;
            }

            public String getMarca() {
                return marca;
            }

            public String getModelo() {
                return modelo;
            }

            //Mover
            public void mover(int x, int y) {
                System.out.println("Movendo para: (" + x + ", " + y + ")");
            }

            //Clicar
            public void clicar() {
                System.out.println("Clicando");
            }

            //Pressionar botão
            public void pressionarBotao(String botao) {
                System.out.println("Pressionando botão: " + botao);
            }
}
