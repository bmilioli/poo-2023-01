package com.github.bmilioli.poo.t09;

public class Circulo {
    private double x; // coordenada x do centro
    private double y; // coordenada y do centro
    private double raio;

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public void transladar(double deslocamentoX, double deslocamentoY) {
        this.x += deslocamentoX;
        this.y += deslocamentoY;
    }

    // getters e setters

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
