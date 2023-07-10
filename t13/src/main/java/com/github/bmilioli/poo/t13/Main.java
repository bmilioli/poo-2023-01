package com.github.bmilioli.poo.t13;

public class Main {
    public static void main(String[] args) {
        //Imprimir ola mundo
        System.out.println("Hello World");


        //Array de contas
        Conta[] contas = new Conta[10];
        //Criar conta
        contas[0] = new Conta("123", 1000);
        //Debitar valor da conta
        contas[0].sacar(100);
        //Imprimir saldo da conta
        System.out.println(contas[0].getSaldo());


        //Criar objeto Tipos
        Tipos tipos = new Tipos(1, 1.0f, 'a', true);
        //Imprimir valores do objeto Tipos
        System.out.println(tipos.getMyNum());
        System.out.println(tipos.getMyFloatNum());
        System.out.println(tipos.getMyLetter());
        System.out.println(tipos.isMyBool());


    }

}
