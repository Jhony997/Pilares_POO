package Nivel0.JavaCore.POO5.Evento;

import Nivel0.JavaCore.POO5.metodo.Animal;

public class AcaoArena {
    private int monstroColiseu = 5;

    public void lutaArena(Animal es){
        System.out.println(es.getNome() + " | Vida :  " + es.getVida());
        es.setVida(es.getVida() - 1);
        monstroColiseu -= es.getForca();
        System.out.println(es.getNome() + " Vida atual : " + es.getVida());
        System.out.println("Resta na Arena : " + monstroColiseu + "x Monstros!");

        if(es.getVida() <= 0){
            System.out.println(es.getNome() + " Faleceu");
        }
    }
}
