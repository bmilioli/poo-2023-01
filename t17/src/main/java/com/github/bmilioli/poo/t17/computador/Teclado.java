package com.github.bmilioli.poo.t17.computador;

public class Teclado {

        private final String marca;
        private final String modelo;

        public Teclado(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        //Digitar
        public void digitar(String texto) {
            System.out.println("Digitando: " + texto);
        }

        //Pressionar tecla
        public void pressionarTecla(String tecla) {
            System.out.println("Pressionando tecla: " + tecla);
        }
}
