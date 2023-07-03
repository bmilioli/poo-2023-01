package com.github.bmilioli.poo.t11;

import java.util.List;

public class Casa {
    List<Sala> salas;
    List<Banheiro> banheiros;
    List<Quarto> quartos;
    Garagem garagem;
    Area area;
    int capacidade;

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public List<Banheiro> getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(List<Banheiro> banheiros) {
        this.banheiros = banheiros;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public Garagem getGaragem() {
        return garagem;
    }

    public void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
