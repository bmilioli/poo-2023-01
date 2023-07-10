package com.github.bmilioli.poo.t17.computador;

public class CPU {
    String marca;
    String modelo;
    int nucleos;
    int threads;
    double frequencia;

    public CPU(String marca, String modelo, int nucleos, int threads, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.threads = threads;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public int getThreads() {
        return threads;
    }

    public double getFrequencia() {
        return frequencia;
    }
}
