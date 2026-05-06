package Nivel0.JavaCore.POO3.Event;

import Nivel0.JavaCore.POO3.metodo.Elemento;

public class Reatividade implements Reacao{
    private int reatividade;
    private int energia;

    public Reatividade(int reatividade, int energia) {
        this.reatividade = reatividade;
        this.energia = energia;
    }

    @Override
    public void fusao(Elemento e) {
        System.out.println("Reação atual : " + "Reator + " + e.getNome() + " | Atomos Reator : " + reatividade);
        e.setReacao(e.getReacao() + reatividade);
        System.out.println("Resultado da fusão : " + e.getReacao());
    }

    @Override
    public void novoElemento() {
        // preciso aprender isso -> como cria novo objeto sem ser manual java ?
    }
}
