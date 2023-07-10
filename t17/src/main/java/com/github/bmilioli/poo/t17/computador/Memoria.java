package com.github.bmilioli.poo.t17.computador;

public class Memoria {

        private final int capacidade;
        private int[] dados;

        public Memoria(int capacidade) {
            this.capacidade = capacidade;
            this.dados = new int[capacidade];
        }

        public int getCapacidade() {
            return capacidade;
        }

        public int getDado(int endereco) {
            return this.dados[endereco];
        }

        public void setDado(int endereco, int dado) {
            this.dados[endereco] = dado;
        }

        public void limpar() {
            this.dados = new int[capacidade];
        }

        public void imprimir() {
            System.out.println("Memória:");
            for (int i = 0; i < this.dados.length; i++) {
                System.out.printf("%d: %d\n", i, this.dados[i]);
            }
        }
}
