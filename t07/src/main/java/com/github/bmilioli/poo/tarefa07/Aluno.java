package com.github.bmilioli.poo.tarefa07;

public class Aluno extends Pessoa {
    private Curso[] curso;
    //contrutor de pessoas
    public Aluno(String nome) {
        super(nome);
    }
    //metodo para adicionar curso
    public void addCurso(Curso curso) {
        this.curso = new Curso[1];
        this.curso[0] = curso;
    }
    //metodo para retornar o curso
    public Curso[] getCurso() {
        return this.curso;
    }
}
