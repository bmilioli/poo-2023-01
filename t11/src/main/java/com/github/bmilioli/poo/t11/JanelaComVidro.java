package com.github.bmilioli.poo.t11;

public class JanelaComVidro extends Janela{
    private int areaVidro;

    public JanelaComVidro(int area, int areaVidro) {
        super(area);
        this.areaVidro = areaVidro;
    }

    public int getAreaVidro() {
        return areaVidro;
    }

    public void setAreaVidro(int areaVidro) {
        this.areaVidro = areaVidro;
    }

    @Override
    public String toString() {
        return "JanelaComVidro{" +
                "areaVidro=" + areaVidro +
                ", area=" + area +
                '}';
    }
}
