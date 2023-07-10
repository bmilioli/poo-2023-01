package com.github.bmilioli.poo.t13;

public class Tipos {
    int meuNumero = 5;               // integer (whole number)
    float meuPontoFlutuante = 5.99f;    // floating point number
    char minhaLetra = 'D';         // character
    boolean meuBoleano = true;       // boolean

    public Tipos(int meuNumero, float meuPontoFlutuante, char minhaLetra, boolean meuBoleano) {
        this.meuNumero = meuNumero;
        this.meuPontoFlutuante = meuPontoFlutuante;
        this.minhaLetra = minhaLetra;
        this.meuBoleano = meuBoleano;
    }

    public int getMyNum() {
        return meuNumero;
    }

    public float getMyFloatNum() {
        return meuPontoFlutuante;
    }

    public char getMyLetter() {
        return minhaLetra;
    }

    public boolean isMyBool() {
        return meuBoleano;
    }
}
