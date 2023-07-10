package com.github.bmilioli.poo.t11;

public class Lanchonete {
    private Gerente gerente;
    private Funcionario funcionario;

    public Lanchonete(Gerente gerente, Funcionario funcionario) {
        this.gerente = gerente;
        this.funcionario = funcionario;
    }

    public Gerente getGerente() {
        return gerente;
    }



}
