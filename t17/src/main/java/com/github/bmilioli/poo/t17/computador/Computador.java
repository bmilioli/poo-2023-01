package com.github.bmilioli.poo.t17.computador;

public class Computador {
    private final Teclado teclado;
    private final Mouse mouse;
    private final PlacaMae placaMae;
    private final CPU cpu;

    public Computador(Teclado teclado, Mouse mouse, PlacaMae placaMae, CPU cpu) {
        this.teclado = teclado;
        this.mouse = mouse;
        this.placaMae = placaMae;
        this.cpu = cpu;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public CPU getCpu() {
        return cpu;
    }
}
