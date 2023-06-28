package com.github.bmilioli.poo.t08;

public class Janela {
    private List<ElementoInteracao> elementos;

    public Janela() {
        elementos = new ArrayList<>();
    }

    public void adicionarElemento(ElementoInteracao elemento) {
        elementos.add(elemento);
    }

    public void removerElemento(ElementoInteracao elemento) {
        elementos.remove(elemento);
    }

    public void exibir() {
        // Lógica para exibir a janela e seus elementos
    }
}
