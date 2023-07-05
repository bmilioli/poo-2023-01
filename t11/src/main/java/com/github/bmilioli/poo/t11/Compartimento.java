package com.github.bmilioli.poo.t11;

public class Compartimento {
    //Guarda os livros
    private Livro[] livros;
    //Metodo para guardar os livros
    public void guardarLivros(Livro[] livros) {
        this.livros = livros;
    }
    //Metodo para retornar os livros
    public Livro[] getLivros() {
        return livros;
    }

}
