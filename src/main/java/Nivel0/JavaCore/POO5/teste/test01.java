package Nivel0.JavaCore.POO5.teste;

import Nivel0.JavaCore.POO5.Evento.AcaoArena;
import Nivel0.JavaCore.POO5.metodo.Animal;
import Nivel0.JavaCore.POO5.metodo.Cachorro;
import Nivel0.JavaCore.POO5.metodo.Gato;

public class test01 {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Pastor Alemão",1,3,"Arena");
        Gato cat = new Gato("Simba",1,1,"Arena");

        cat.EstadoGato(2);
        dog.EstadoCachorro(2);
        System.out.println(" ");

        AcaoArena ag = new AcaoArena();
        ag.lutaArena(dog);
        System.out.println(" ");
        ag.lutaArena(cat);
    }
}
